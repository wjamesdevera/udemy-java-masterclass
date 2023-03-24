import java.io.BufferedReader;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String[] names = {
                "Winfrey",
                "Wilson",
                "Wesley"
        };
        String filePath = "src/mycsv.csv";
        String line;
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(",(?=([^\"]*\"[^\"]*\")*[^\"]*$)");

                for (int i = 0; i < row.length; i++) {
                    System.out.printf("%-20s", row[i]);
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}