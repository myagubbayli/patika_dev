import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {
    public static final String url = "jdbc:postgresql://localhost/university";
    public static final String user = "postgres";
    public static final String password = "postgres";

    public static void main(String[] args) throws Exception {
        Connection connection = null;

        // Getting data from sql table

        // String sql = "SELECT * FROM student";

        // Inserting data to the table

        // String insertSQL = "INSERT INTO student (student_name, student_class) VALUES ('Damla', 4)";

        // Prepared Statements

        // String prSQL = "INSERT INTO student (student_name, student_class) VALUES (?, ?)";

        // Updating SQL table

        // String stSQL = "UPDATE student SET student_name='Farid Yagubbayli' WHERE student_id=1";

        // Updating SQL table in prepared statements

        // String prSQL = "UPDATE student SET student_name=? WHERE student_id=?";

        // Deleting from table

        String stSQL = "DELETE FROM student WHERE student_id = 4";

        // Deleting from table with prepared statements 

        String prSQL = "DELETE FROM student WHERE student_id = ?";

        try {
            connection = DriverManager.getConnection(url, user, password);
            Statement st = connection.createStatement();

            // Getting data from sql table 

            // Statement st = connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
            // ResultSet data = st.executeQuery(sql);
            // while (data.next()) {
            //     System.out.println("ID : " + data.getInt("student_id"));
            //     System.out.println("Name: " + data.getString("student_name"));
            //     System.out.println("Class: " + data.getInt("student_class"));
            //     System.out.println("##############################");
            // }

            // data.next();
            // data.next();
            // data.first();
            // data.last();
            // System.out.println(data.getString("student_name"));


            // Inserting data to the database 

            // System.out.println(st.executeUpdate(insertSQL));

            // Prepared Statements

            // PreparedStatement prSt = connection.prepareStatement(prSQL);
            // prSt.setString(1, "Ahmet");
            // prSt.setInt(2, 5);
            // prSt.executeUpdate();
            // prSt.close();

            // Updating SQL table 

            // st.executeUpdate(stSQL);

            // Updating SQL Table in prepared statements

            // PreparedStatement pr = connection.prepareStatement(prSQL);
            // Here parameterIndex in set parameters is referring to which '?', first or second
            // pr.setInt(2, 1);
            // pr.setString(1, "Yagubbayli Mahammad");
            // pr.executeUpdate();
            
            // Deleting row in the table
            st.executeUpdate(stSQL);

            // Deleting row in the table with prepared statements
            PreparedStatement pr = connection.prepareStatement(prSQL);
            pr.setInt(1, 3);
            pr.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
