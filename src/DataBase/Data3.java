package DataBase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Data3 {
    public static void  main(String[] ar){
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/Student";
                String user = "root";
                String password = "root";

                {
                    try {
                        Class.forName(driver);
                        Connection connection = DriverManager.getConnection(url, user, password);
                        Statement stmt = connection.createStatement();
                        String q1 = "select * from students";
                        ResultSet rs = stmt.executeQuery(q1);
                        if (rs.next())
                        {
                            System.out.println("User-Id : " + rs.getString(1));
                            System.out.println("Full Name :" + rs.getString(2));
                            System.out.println("Age :" + rs.getString(3));
                            System.out.println("Grade:"+rs.getString(4));
                        }
                        else
                        {
                            System.out.println("No such user id is already registered");
                        }
                        connection.close();
                    } catch (Exception e) {
                        System.out.println(e);
                    }
                }

            }
}
