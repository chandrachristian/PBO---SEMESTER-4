package pbo.Minggu9;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Koneksi2 {
    public static Connection con;
    public static Statement stm;
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost/tutorial";
        String user = "root";
        String pass = "";
        Class.forName("com.mysql.jdbc.Driver");
        stm = con.createStatement();
        System.out.println("koneksi berhasil");
    }
}
