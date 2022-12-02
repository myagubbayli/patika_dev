package Inter;

public class ABank implements IBank {
    private String bankName;
    private String terminalID;
    private String password;

    public ABank(String bankName, String terminalID, String password) {
        this.bankName = bankName;
        this.terminalID = terminalID;
        this.password = password;
    }

    @Override
    public boolean connect(String ipAdress) {
        System.out.println("User ip: " + ipAdress);
        System.out.println("Machine ip: " + this.hostIpAdress);
        System.out.println(this.bankName + " Connected!");
        return true;
    }

    @Override
    public boolean payment(double amount, String cardNumber, String expireDate, String CVC) {
        // Bank payment services
        System.out.println("Waiting Bank for reply!");
        System.out.println("Transaction successful!");
        return true;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getTerminalID() {
        return terminalID;
    }

    public void setTerminalID(String terminalID) {
        this.terminalID = terminalID;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
