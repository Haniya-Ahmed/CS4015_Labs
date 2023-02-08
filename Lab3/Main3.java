import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("What is the client card name?");
        Scanner scanner = new Scanner(System.in);
        String clientName = scanner.nextLine();
        System.out.println("What is the account number?");
        int accountNumber = scanner.nextInt();
        BankApplication bankApplication = new BankApplication(0.00, clientName,accountNumber );

        int option = 0;
        do {
            System.out.println("Please select an option:");
            System.out.println("1. Check balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Exit");
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Your current balance is: " + bankApplication.getCurrentBalance());
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw?");
                    double withdrawAmount = scanner.nextDouble();
                    bankApplication.withdraw(withdrawAmount);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit?");
                    double depositAmount = scanner.nextDouble();
                    bankApplication.deposit(depositAmount);
                    break;
                case 4:
                    System.out.println("How much would you like to transfer?");
                    double transferAmount = scanner.nextDouble();
                    System.out.println("What is the name of the client you would like to transfer to?");
                    String transferClientName = scanner.next();
                    bankApplication.transfer(transferAmount, transferClientName);
                    break;
                case 5:
                    System.out.println("Thank you for using our services.");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }

        } while (option != 5);
    }
}
