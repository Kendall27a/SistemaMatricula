/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Student
 */
public class Estudiante {
    
    String name; 
    String cedula;
    String telefono;
    String correo;
    String estadoActual;
    String fechaNac;
    String direccion;

    public Estudiante(String name, String cedula, String telefono, String correo, String estadoActual, String fechaNac, String direccion) {
        this.name = name;
        this.cedula = cedula;
        this.telefono = telefono;
        this.correo = correo;
        this.estadoActual = estadoActual;
        this.fechaNac = fechaNac;
        this.direccion = direccion;
    }
    public Estudiante() {
        this.name = "";
        this.cedula = "";
        this.telefono = "";
        this.correo = "";
        this.estadoActual = "";
        this.fechaNac = "";
        this.direccion = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
                    
    
}
