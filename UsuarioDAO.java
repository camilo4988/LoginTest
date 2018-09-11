/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UsuarioDAO {
    public boolean insertarUser(Usuario us) throws SQLException, ClassNotFoundException{
    boolean resultado= false;
    String sql ="insert into  usuario(cedula, nombres, apellidos, "
            + "departamento,ciudad, direccion, barrio,telefono, celular, email) values(?,?,?,?,?,?,?,?,?,?)";
    Connection conexion =  Conexion.getConnection();
        PreparedStatement pst=conexion.prepareStatement(sql);
        pst.setString(1, us.getCedula());
        pst.setString(2, us.getNombre());
        pst.setString(3, us.getApellidos());
        pst.setString(4, us.getDepartamento());
        pst.setString(5, us.getCiudad());
        pst.setString(7, us.getBarrio());
        pst.setString(6, us.getDireccion());
        pst.setString(8, us.getTelefono());
        pst.setString(9, us.getCelular());
        pst.setString(10, us.getEmail());
        
        resultado= pst.executeUpdate()==1;
        pst.close();
        return resultado;
    }
}
