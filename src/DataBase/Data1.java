package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Data1 {
    public static void main(String[] ar) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/School";
        String user = "root";
        String password = "root";
        PreparedStatement pstmt = null;
        Connection connection = null;
        {
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
                // Statement stmt = connection.createStatement();
                String sql = "INSERT INTO students (name, age, grade) VALUES (?, ?, ?)";

                // Create PreparedStatement object
                pstmt = connection.prepareStatement(sql);

                // Set parameters and execute the insert
                pstmt.setString(1, "John Doe");
               pstmt.setInt(2, 18);
                pstmt.setString(3, "A");

                pstmt.executeUpdate();


                connection.close();
            } catch (Exception e) {
                System.out.println(e);
            } finally {
                // Clean-up environment
                try {
                    if (pstmt != null) pstmt.close();
                    if (connection != null) connection.close();
                } catch (SQLException se) {
                    se.printStackTrace();
                }
            }

        }

    }
}

