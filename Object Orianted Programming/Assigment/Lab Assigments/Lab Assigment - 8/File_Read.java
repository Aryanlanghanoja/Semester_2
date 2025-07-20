import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class File_Read 
{
    public static void main(String[] args) 
    {

        try (BufferedReader reader = new BufferedReader(new FileReader("ABC.txt"))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.printf("%d: %s%n", lineNumber, line);
                lineNumber++;
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}
