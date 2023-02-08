public class RunnableDemo implements Runnable{

    private String threadName;
    public RunnableDemo(String threadName){
        this.threadName = threadName;
    }
    @Override
    public void run() {
        try {
            System.out.println("Thread " + this.threadName+ " is running");
            SingletonLogger logger = SingletonLogger.getLogger("multithreaded2.txt");
            logger.write("  Hello from Thread " + this.threadName+".");
        }catch (Exception e){
            System.out.println("Exception is caught");
        }
    }

}
