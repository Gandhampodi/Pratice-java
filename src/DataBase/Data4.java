package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class Data4 {
    public static void main(String[] ar) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/School";
        String user = "root";
        String password = "root";

        {
            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url, user, password);
                String updateSQL = "UPDATE students SET name = ?, age = ? WHERE id = ?";
                PreparedStatement pstmt = connection.prepareStatement(updateSQL);
                pstmt.setString(1, "wai");
                pstmt.setInt(2, 20);
                pstmt.setInt(3, 15);
                int rowsAffected = pstmt.executeUpdate();
                System.out.println("Rows affected: " + rowsAffected);
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }
}
