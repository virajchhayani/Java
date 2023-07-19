import java.io.File;
import java.io.IOException;

public class Main4 {
    public static void main(String args[]) {
        try {
            File f = new File("D:\\File1.txt");
            boolean created = f.createNewFile();
            System.out.println("File Created: " + created);
            System.out.println("File name is: " + f.getName());
            System.out.println("File path is " + f.getAbsolutePath());
            System.out.println("File read operation: " + f.canRead());
            System.out.println("File write operation: " + f.canWrite());
            System.out.println("File length in bytes: " + f.length());
            System.out.println("Is file: " + f.isFile());
            System.out.println("Is directory: " + f.isDirectory());
            System.out.println("File exists: " + f.exists());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
