package Metodos_sql;


import java.sql.*;
import java.sql.Connection;
import com.mysql.cj.jdbc.ConnectionImpl;

public class ConexionBD {

    public static String url = "jdbc:mysql://localhost/login_bd";
    public static String usuario = "root";
    public static String contraseña = "admin";
    public static String clase = "com.mysql.jdbc.Driver";

    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName(clase);
            conexion =DriverManager.getConnection(url, usuario, contraseña);
            System.out.println("conexion establecida");
        } catch (ClassNotFoundException | SQLException e) {
             throw new RuntimeException(e);
        }
        return conexion;
    }
}
