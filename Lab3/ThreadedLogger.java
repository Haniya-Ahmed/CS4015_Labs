import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ThreadedLogger {
        private String fileName;

    private static Map<String, ThreadedLogger> loggers = new HashMap<>();

        private ThreadedLogger(String fileName) {
            this.fileName = fileName;
        }

        public static ThreadedLogger getLogger(String fileName) {
            if (loggers.isEmpty() || !loggers.containsKey(fileName)) {
                synchronized (ThreadedLogger.class){
                    if (loggers.isEmpty() || !loggers.containsKey(fileName)) {
                        loggers.put(fileName, new ThreadedLogger(fileName));
                    }
                }
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
