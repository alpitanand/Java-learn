import com.sun.corba.se.pept.transport.Connection;


import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Alpit on 03-06-2017.
 */
public class create {
public static void main(String args[]) throws IOException, ClassNotFoundException, SQLException {
Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con=null;
 con=(Connection) DriverManager.getConnection(
            "jdbc:oracle:thin:@localhost:1521:xe","alpit","DBADBADBA");
    con.close();

}
}
