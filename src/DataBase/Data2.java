package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Data2 {
    public static void main(String[] ar) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/Student";
        String user = "root";
        String password = "password";
        {
            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url, user, password);
                Statement stmt = connection.createStatement();
                ResultSet res = stmt.executeQuery("select from student");
                while (res.next()) {
                    System.out.println("res.getInt(1)");
                    System.out.println("res.getString(2)");

                }
                connection.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
