import java.io.File;

public class Main {
    public static void main(String[] args) {
        File file = new File("first.txt");

        // createNewFile method
        try {
            boolean created = file.createNewFile();
            if (created) {
                System.out.println("File created successfully.");
            } else {
                System.out.println("File already exists.");
            }
        } catch (Exception e) {
            System.out.println("An error occurred while creating the file.");
            e.printStackTrace();
        }

        // getName method
        String fileName = file.getName();
        System.out.println("File name: " + fileName);

        // getAbsolutePath method
        String absolutePath = file.getAbsolutePath();
        System.out.println("Absolute path: " + absolutePath);

        // canRead method
        boolean readable = file.canRead();
        System.out.println("Readable: " + readable);

        // canWrite method
        boolean writable = file.canWrite();
        System.out.println("Writable: " + writable);

        // isFile method
        boolean isFile = file.isFile();
        System.out.println("Is file: " + isFile);

        // isDirectory method
        boolean isDirectory = file.isDirectory();
        System.out.println("Is directory: " + isDirectory);

        // length method
        long length = file.length();
        System.out.println("File length: " + length);

        // exists method
        boolean exists = file.exists();
        System.out.println("File exists: " + exists);
    }
}
