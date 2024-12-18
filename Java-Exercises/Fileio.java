import java.io.*;

public class Fileio {
    public static void main(String[] args) {
        String filepath = "example.txt";

        // Write to the file
        writeFile(filepath, "Hello, World!\nThis is a file writing example.");

        // Read from the file
        readFile(filepath);
    }

    public static void writeFile(String filepath, String content) {
        BufferedWriter writer = null;

        try {
            writer = new BufferedWriter(new FileWriter(filepath));
            writer.write(content);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the writer.");
                e.printStackTrace();
            }
        }
    }

    // Method to read from a file
    public static void readFile(String filepath) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found: " + filepath);
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("An error occurred while closing the reader.");
                e.printStackTrace();
            }
        }
    }
}