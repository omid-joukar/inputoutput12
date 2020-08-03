import java.io.*;

/**
 * Created by KPS on 8/3/2020.
 */
public class Main {
    public static void main(String[] args) {
        File path = new File("d:\\employee.txt");
        try(FileReader reader = new FileReader(path);
            BufferedReader reader1 = new BufferedReader(reader);){
            String line = "";
            while ((line = reader1.readLine()) != null){
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
