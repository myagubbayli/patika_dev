package Inter;

public interface IBank {
    final String hostIpAdress = "127.0.0.1";

    boolean connect(String ipAddress);

    boolean payment(double amount, String cardNumber, String expireDate, String CVC);
}
