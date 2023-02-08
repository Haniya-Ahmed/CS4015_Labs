import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    private String fileName;

    private static Logger logger;

    public Logger(String fileName) {
        this.fileName = fileName;
    }


    public void write(String message) {
        try {
            FileWriter myWriter = new FileWriter(this.fileName, true);
            myWriter.write(message);
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
