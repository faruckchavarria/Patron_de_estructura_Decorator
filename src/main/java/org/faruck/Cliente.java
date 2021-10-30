package org.faruck;


import java.util.Date;

public class Cliente {
    private String dni;
    private String nombre;
    private Fecha fechaNac;
    private String direccion;
    private String tfno;
    //constructor
    public Cliente(String p_dni, String p_nombre, Fecha p_fecnac, String p_direccion,
                   String p_tfno) {
        dni = p_dni;
        nombre = p_nombre;
        fechaNac = p_fecnac;
        direccion = p_direccion;
        tfno = p_tfno;
    }
    //métodos
    public String getDni() {
        return this.dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getFechaNac() {
        return this.fechaNac;
    }
    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTfno() {
        return this.tfno;
    }
    public void setTfno(String tfno) {
        this.tfno = tfno;
    }

}