import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SingletonLogger {
    private String fileName;

    private static Map<String, SingletonLogger> loggers = new HashMap<>();

    private SingletonLogger(String fileName) {
        this.fileName = fileName;
    }

    public static SingletonLogger getLogger(String fileName) {
        if(loggers.isEmpty() || !loggers.containsKey(fileName)){
            loggers.put(fileName, new SingletonLogger(fileName));
        }
        return loggers.get(fileName);
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
