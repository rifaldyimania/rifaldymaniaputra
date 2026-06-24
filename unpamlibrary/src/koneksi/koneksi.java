package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class koneksi {
    private static Connection mysqlkonek;

    public static Connection koneksiDB() {
        if (mysqlkonek == null) {
            try {
                String url  = "jdbc:mysql://localhost:3306/unpamlibrary";
                String user = "root";
                String pass = "";
                Class.forName("com.mysql.cj.jdbc.Driver");
                mysqlkonek = DriverManager.getConnection(url, user, pass);
            } catch (ClassNotFoundException | SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi database gagal: " + e.getMessage());
            }
        }
        return mysqlkonek;
    }

    // TAMBAHKAN METHOD INI agar semua form yang memanggil getConnection tidak error
    public static Connection getConnection() {
        return koneksiDB();
    }
}