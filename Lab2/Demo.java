import java.util.Scanner;

//this is client code to run and test prototype pattern
public class Demo {

    public static void main(String[] args) {
        Timeline timeline = new Timeline(); //creates timeline

        //creates components and add them to timeline.
        Text text = new Text();
        text.objectName = "Text";
        text.content = "Hello";
        timeline.add(text);

        Audio audio = new Audio();
        audio.objectName = "Audio";
        audio.audioLength = 10.90;
        timeline.add(audio);

        Clip clip = new Clip();
        clip.objectName = "Clip";
        clip.clipDuration = 20.35;
        clip.clipSpeed  = 1.5;
        clip.clipVolume = 10.00;
        timeline.add(clip);

        ContextMenu menu = new ContextMenu(timeline);

        printOptions();

        //read and process user input to duplicate components
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 5) {
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    menu.duplicate(text);
                    printOptions();
                    break;
                case 2:
                    menu.duplicate(audio);
                    printOptions();
                    break;
                case 3:
                    menu.duplicate(clip);
                    printOptions();
                    break;
                case 4:
                    timeline.print();
                    printOptions();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }

    //prints options for user to select
    public static void printOptions(){
        System.out.println("Select component to duplicate:");
        System.out.println("1. Text");
        System.out.println("2. Audio");
        System.out.println("3. Clip");
        System.out.println("4. print timeline");
        System.out.println("5. Exit");
    }
}
