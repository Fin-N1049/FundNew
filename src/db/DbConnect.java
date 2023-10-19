package db;
import java.sql.*;
public class DbConnect {
    public static Connection c;
    public static Statement st;
    public Connection createConnection(){
        String url="jdbc:mysql://localhost:3306/imscdb";
        String user="root";
        String password="hlomysql@2021";
        Connection conn=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn=DriverManager.getConnection(url,user,password);
            System.out.println("Connection is Successful to the database"+url);
        }catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }catch(SQLException throwables){
            throwables.printStackTrace();
        }
        return conn;
    }
}
