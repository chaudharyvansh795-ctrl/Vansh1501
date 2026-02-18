import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MergeFiles {
    public static void main(String[] args) {

        try {
            FileInputStream fis1 = new FileInputStream("sample.txt");
            FileInputStream fis2 = new FileInputStream("my.txt");

            FileOutputStream fos = new FileOutputStream("merged.txt");
            int ch;
              while ((ch = fis1.read()) != -1) {
                fos.write(ch);
            }
            fos.write('\n');

            while ((ch = fis2.read()) != -1) {
                fos.write(ch);
            }

            fis1.close();
            fis2.close();
            fos.close();

            System.out.println("Files merged successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }

 {
    
 }
}