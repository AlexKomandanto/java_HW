package lesson_2.sem2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*Напишите метод, который вернет содержимое текущей папки в виде массива строк.

 Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.

  Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения,
  оно должно записаться в лог-файл.
 */
public class Task05 {
    public static void main(String[] args) throws Exception {
        String[] filelist = dirList("./");
        Logger logger = Logger.getLogger(Task05.class.getName());
        try{
            writeFile(filelist);
        }catch(IOException ex){
            logger.log(Level.SEVERE,"Error writing", ex);
        }catch(NullPointerException npe){
            logger.log(Level.SEVERE,"Error writing", npe);
        }

    }

    private static String[] dirList(String dir){
        File file = new File(dir);
        String[] fileList = file.list();

        return fileList;
    }

    private static void writeFile(String[] str) throws IOException {
        try(FileWriter writer = new FileWriter("filelist_1.txt", false))
        {
// запись всей строки
            for(int i = 0; i < str.length; i++)
                writer.write(str[i] + '\n');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        catch(NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
