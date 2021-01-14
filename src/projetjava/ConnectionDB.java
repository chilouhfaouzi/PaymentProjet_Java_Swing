package projetjava;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;
public class ConnectionDB {
    public static Connection my_connect() throws ClassNotFoundException, SQLException {

     

        Class.forName("org.mariadb.jdbc.Driver");

        try  {
            Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/paymentbancaire", "root", "");
            return con;

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return null;

    }
}
