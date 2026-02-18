import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class file_reader_writer {
    public static void main(String[] args) {

        try {
            FileOutputStream fos = new FileOutputStream("sample.txt");
            String data = "Hello Vansh!";
            fos.write(data.getBytes());
            fos.close();
            System.out.println("Data written successfully.");

            FileInputStream fis = new FileInputStream("sample.txt");
            int ch;
            System.out.print("File content: ");
            while ((ch = fis.read()) != -1) {
                System.out.print((char) ch);
            }
            fis.close();

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
