package DataBase;

import java.sql.*;

public class Data6 {
    public static void main(String ar[]) {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/School";
        String user = "root";
        String password = "root";

        {
            try {
                Class.forName(driver);
                Connection connection = DriverManager.getConnection(url, user, password);
                String deleteSQL = "DELETE FROM students WHERE id = ?";
                try (PreparedStatement pstmt = connection.prepareStatement(deleteSQL)) {
                    pstmt.setInt(1, 16);
                    int rowsAffected = pstmt.executeUpdate();
                    System.out.println("Rows affected: " + rowsAffected);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }
}


