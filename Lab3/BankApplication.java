public class BankApplication {

    private double currentBalance;
    private String clientName;

    private int accountNumber;
    private SingletonLogger logger;


    public BankApplication (double currentBalance, String clientName, int accountNumber) {
        this.accountNumber = accountNumber;
        this.clientName = clientName;
        this.currentBalance = currentBalance;
        this.logger = SingletonLogger.getLogger(clientName);
    }

    public double getCurrentBalance() {
        return this.currentBalance;
    }

    public void withdraw(double amount) {
        if (amount > this.currentBalance) {
            System.out.println("You do not have enough funds to withdraw that amount.");
        } else {
            this.currentBalance -= amount;
            System.out.println("You have successfully withdrawn " + amount + " from your account.");
            this.logger.write("User have successfully withdrawn " + amount + " from account."+ accountNumber);
        }
    }

    public void deposit(double amount) {
        this.currentBalance += amount;
        System.out.println("You have successfully deposited " + amount + " into your account.");
        this.logger.write("User have successfully deposited " + amount + " into account."+ accountNumber);
    }

    public void transfer(double amount, String clientName) {
        if (amount > this.currentBalance) {
            System.out.println("You do not have enough funds to transfer that amount.");
        } else {
            this.currentBalance -= amount;
            System.out.println("You have successfully transferred " + amount + " to " + clientName + ".");
            this.logger.write("User have successfully transferred " + amount + " to " + clientName + " from account."+ accountNumber);
        }
    }
}
