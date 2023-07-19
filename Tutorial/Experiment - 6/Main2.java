import java.io.File;

public class Main2 {
    public static void main(String[] args) {
        File file = new File("second.txt");

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

        // renameTo method
        File newFile = new File("newSecond.txt");
        boolean renamed = file.renameTo(newFile);
        if (renamed) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("Failed to rename file.");
        }
    }
}
