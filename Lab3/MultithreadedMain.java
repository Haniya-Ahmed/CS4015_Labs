public class MultithreadedMain {
    public static void main(String[] args){
        int n = 4; // Number of threads
        for (int i=0; i<n; i++)
        {
            RunnableDemo runnableDemo = new RunnableDemo("Thread " + i);
            runnableDemo.run();
        }
    }

}
