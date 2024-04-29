public class AccountCreation {         

    private int number;    
    private String agency;
    private String clientName;
    private double balance;
    
    public AccountCreation(int number, String agency, String clientName, double balance) {
        this.number = number;
        this.agency = agency;
        this.clientName = clientName;
        this.balance = balance;
    }
    
    public String getAgency() {
        return agency;
    }
    
    public String getClientName() {
        return clientName;
    }
    
    public double getBalance() {
        return balance;
    }
    
}
