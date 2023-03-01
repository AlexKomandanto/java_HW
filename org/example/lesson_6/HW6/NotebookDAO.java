package lesson_6.HW6;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class NotebookDAO {
    private Connection connection;

    public NotebookDAO(String url, String username, String password) throws SQLException {
        connection = DriverManager.getConnection(url, username, password);
    }

    public void addNotebook(Notebook notebook) throws SQLException {
        String query = "INSERT INTO notebooks (brand, ram, hdd, operating_system, color) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement statement = connection.prepareStatement(query);
        statement.setString(1, notebook.getBrand());
        statement.setInt(2, notebook.getRam());
        statement.setInt(3, notebook.getHddVolume());
        statement.setString(4, notebook.getOperatingSystem());
        statement.setString(5, notebook.getColor());
        statement.executeUpdate();
    }

    public List<Notebook> getAllNotebooks() throws SQLException {
        String query = "SELECT * FROM notebooks";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(query);
        List<Notebook> notebooks = new ArrayList<>();
        while (resultSet.next()) {
            Notebook notebook = new Notebook(resultSet.getString("brand"), resultSet.getInt("ram"),
                    resultSet.getInt("hdd"), resultSet.getString("operating_system"), resultSet.getString("color"));
            notebooks.add(notebook);
        }
        return notebooks;
    }

    public List<Notebook> filterNotebooks(Map<String, Object> filters) throws SQLException {
        String query = "SELECT * FROM notebooks WHERE ";
        List<Object> values = new ArrayList<>();
        for (Map.Entry<String, Object> entry : filters.entrySet()) {
            switch (entry.getKey()) {
                case "ram":
                    query += "ram >= ? AND ";
                    values.add(entry.getValue());
                    break;
                case "hdd":
                    query += "hdd >= ? AND ";
                    values.add(entry.getValue());
                    break;
                case "os":
                    query += "operating_system = ? AND ";
                    values.add(entry.getValue());
                    break;
                case "color":
                    query += "color = ? AND ";
                    values.add(entry.getValue());
                    break;
                default:
                    throw new IllegalArgumentException("Invalid filter criteria: " + entry.getKey());
            }
        }
        if (values.isEmpty()) {
            throw new IllegalArgumentException("No filter criteria specified");
        }
        query = query.substring(0, query.length() - 5); // remove trailing " AND "
        PreparedStatement statement = connection.prepareStatement(query);
        for (int i = 0; i < values.size(); i++) {
            statement.setObject(i + 1, values.get(i));
        }
        ResultSet resultSet = statement.executeQuery();
        List<Notebook> notebooks = new ArrayList<>();
        while (resultSet.next()) {
            Notebook notebook = new Notebook(resultSet.getString("brand"), resultSet.getInt("ram"),
                    resultSet.getInt("hdd"), resultSet.getString("operating_system"), resultSet.getString("color"));
            notebooks.add(notebook);
        }
        return notebooks;
    }
}

