/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Camilo
 */
public class Usuario {
    String cedula;
    String nombre;
    String apellidos;
    String departamento;
    String ciudad;
    String direccion;
    String barrio;
    String email;
    String telefono;
    String celular;
    
    
    public String getCedula(){
        return cedula;
    
    }
    
    public void setCedula(String cedula){
        this.cedula=cedula;
        }
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    
    }
    public String getApellidos(){
        return apellidos;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos=apellidos;
    
    }

    public String getDepartamento(){
        return departamento;
    }
    
    public void setDepartamento(String departamento){
        this.departamento=departamento;
    
    }

    public String getCiudad(){
        return ciudad;
    }
    
    public void setCiudad(String ciudad){
        this.ciudad=ciudad;
    
    }
    public String getBarrio(){
        return barrio;
    }
    
    public void setBarrio(String barrio){
        this.barrio=barrio;
    
    }
    public String getDireccion(){
        return direccion;
    }
    
    public void setDireccion(String direccion){
        this.direccion=direccion;
    
    }

    
    
    
    public String getCelular(){
        return celular;
    
    }
        
    public void setCelular(String celular){
        this.celular=celular;
    
    }
    
    
    
    public String getTelefono(){
        return telefono;
    
    }
    
    public void setTelefono(String telefono){
        this.telefono=telefono;
        }
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email=email;
    
    }

    
    
    
    
}
