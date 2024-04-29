public class TerminalAccount {
    /**
     * The main function that creates a BankAccount via terminal and displays the account creation message.
     *
     * @param  args	an array of strings containing command line arguments
     */
    
    public static void main(String[] args) {
        BankAccount account = BankAccount.createAccountViaTerminal();
        account.displayAccountCreatedMessage();
    }
}