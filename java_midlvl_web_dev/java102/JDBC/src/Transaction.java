import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Transaction {
    public static final String url = "jdbc:postgresql://localhost/university";
    public static final String user = "postgres";
    public static final String password = "postgres";
    
    public static void main(String[] args) {
        Connection connection = null;        

        try {
            connection = DriverManager.getConnection(url, user, password);
            connection.setAutoCommit(false);
            
            PreparedStatement pr = connection.prepareStatement("INSERT INTO student (student_name, student_class) VALUES (?, ?)");
            pr.setString(1, "John");
            pr.setInt(2, 1);
            pr.executeUpdate();  

            if (true) {
                throw new SQLException();
            }

            pr.setString(1, "Doe");
            pr.setInt(2, 4);
            pr.executeUpdate();

            connection.commit();
            pr.close();
            connection.close();
        } catch (SQLException e) {
            if (connection != null) {
                try {
                    connection.rollback();
                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                }
            }
            System.out.println(e.getMessage());
        }
    }
}
