package Controlador;

import java.sql.*;
public class Conexion {
    private static Connection conexion=null;
    public static Connection  getConnection() throws SQLException, ClassNotFoundException{
    if (conexion==null){
    Class.forName("com.mysql.jdbc.Driver");
    conexion= DriverManager.getConnection("jdbc:mysql://localhost/base_bbl", "root","");
    
    }
    return conexion;
}

    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        Connection conexion = Conexion.getConnection();
        if(conexion != null){
        conexion.close();
        System.out.println("Conexion Exitosa");
              
        }else{
        System.out.println("Error al conectar, intenta nuevamente.");
        }
    }

}
