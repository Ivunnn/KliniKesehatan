/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author yudas
 */
public class koneksi {

public class DatabaseConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/identitas_pasien"; // Ganti dengan URL database Anda
    private static final String USER = "root"; // Ganti dengan username database Anda
    private static final String PASSWORD = " "; // Ganti dengan password database Anda

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}

}
