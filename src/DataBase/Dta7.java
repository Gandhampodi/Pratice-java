package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Dta7 {
    public static void main(String ar[]) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/School";
        String user = "root";
        String password = "root";

        {
            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement stmt = connection.createStatement();
                String sql = "ALTER TABLE students ADD COLUMN email VARCHAR(255)";
                stmt.executeUpdate(sql);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
