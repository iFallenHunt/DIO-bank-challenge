import java.util.Scanner;

public class BankAccount {
    private int number;
    private String agency;
    private String clientName;
    private double balance;

    public BankAccount(int number, String agency, String clientName, double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }

    // Getter and setter methods
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    /**
     * Creates a new BankAccount object by prompting the user for the agency number,
     * account number, client's name, and account balance via the terminal.
     *
     * @return a new BankAccount object with the provided information
     */

    public static BankAccount createAccountViaTerminal() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the Agency number:");
        String agency = scanner.nextLine();

        System.out.println("Please enter the Account number:");
        int number = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        System.out.println("Please enter the Client's name:");
        String clientName = scanner.nextLine();

        System.out.println("Please enter the Account balance:");
        double balance = scanner.nextDouble();

        scanner.close();

        return new BankAccount(number, agency, clientName, balance);
    }

    /**
     * Displays a message confirming the account creation with the client's name,
     * agency number, account number, and balance.
     */
    public void displayAccountCreatedMessage() {
        System.out.println("Hello " + this.clientName + ", thank you for creating an account with us.");
        System.out.println("Your agency is " + this.agency + ", account " + this.number + " and your balance is $"
                + this.balance + ".");
        System.out.println("Your balance is already available for withdrawal.");
    }
}