import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        System.out.println("Select the type of Calanedar you want to use:");
        System.out.println("1. Gregorian Calendar");
        System.out.println("2. Arabian Calendar");

        //read in user input
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        Scheduler scheduler = null;

        if(choice == 1) {
            scheduler = new GregorianScheduler();
            scheduler.schedule(new Event());
        } else if(choice == 2) {
            scheduler = new ArabianScheduler();
            scheduler.schedule(new Event());
        } else {
            System.out.println("Invalid choice");
        }
    }
}
