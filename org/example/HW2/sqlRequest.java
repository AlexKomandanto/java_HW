package org.example.HW2;

public class sqlRequest {
    public static void main(String[] args) throws Exception {
        String data = "name: Ivan, Lastname: Ivanov, country: Belarus";
        StringBuilder builder = new StringBuilder();

        String[] parts = data.split (", ");
        for (String part : parts) {
            String[] keyValue = part.split (": ");
            String key = keyValue[0];
            String value = keyValue[1];

            builder.append (String.format (" AND %s = %s", key, value));
        }
        String request = builder.toString();
        request = request.substring(5);

        System.out.println(request);
    }
}

