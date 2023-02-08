
public class Main {
    public static void main(String[] args){

        //multiple logger writing to same file.
        Logger logger1 = new Logger("log1.txt");
        Logger logger2 = new Logger("log1.txt");
        System.out.println(logger1 == logger2);

        //multiple logger writing to different file.
        Logger logger3 = new Logger("log1.txt");
        Logger logger4 = new Logger("log2.txt");
        System.out.println(logger3 == logger4);
    }

}