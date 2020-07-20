import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import com.mysql.cj.jdbc.Driver;
import java.sql.*;

public class JDBCTest {
   public static List<String> getEmployeeFirstNames() {
       List<String> names = new ArrayList<>();
       try {
           DriverManager.registerDriver(new Driver());
           Connection conn = DriverManager.getConnection(
                   "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
                   "root",
                   "codeup"
           );
           Statement stmt = conn.createStatement();
           String query = "SELECT first_name FROM employees.employees LIMIT 10";
           ResultSet rs = stmt.executeQuery(query);
           while (rs.next()) {
               names.add(rs.getString(1));
           }
       } catch (SQLException e) {
           e.printStackTrace();
       }
        return names;
   }


//    public static List<String> getEmployeeFirstNames(int numberOfNames) {
//        List<String> names = new ArrayList<>();
//        try {
//            DriverManager.registerDriver(new Driver());
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:mysql://localhost/codeup_test_db?serverTimezone=UTC&useSSL=false",
//                    "root",
//                    "codeup"
//            );
//            Statement stmt = conn.createStatement();
//            String query = "SELECT first_name FROM employees.employees + numberOfNames";
//            ResultSet rs = stmt.executeQuery(query);
//            while (rs.next()) {
//                names.add(rs.getString(1));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return names;
//    }
    public static void main(String[] args) throws SQLException {
//        System.out.println(getEmployeeFirstNames());
//
//        System.out.println(getEmployeeFirstNames(3));
    }
}
