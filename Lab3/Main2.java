public class Main2 {
    public static void main (String[] agrs){

        Logger logger = new Logger("File.txt");
        Logger logger2 = new Logger("File.txt");
        System.out.println(logger == logger2);

        //write to same file
        SingletonLogger singleLogger = SingletonLogger.getLogger("File.txt");
        SingletonLogger singleLogger2 = SingletonLogger.getLogger("File.txt");
        System.out.println(singleLogger == singleLogger2);

        //write to different files
        SingletonLogger singleLogger3 = SingletonLogger.getLogger("File2.txt");
        SingletonLogger singleLogger4 = SingletonLogger.getLogger("File3.txt");
        System.out.println(singleLogger3 == singleLogger4);
    }
}
