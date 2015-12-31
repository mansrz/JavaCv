/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author wilme
 */
public class Usuario {
    private String idusuario;
    private String clave;
    private String rol;
    private String estado;
    private String fecha;

    public Usuario(String idusuario, String clave, String rol, String estado, String fecha) {
        this.idusuario = idusuario;
        this.clave = clave;
        this.rol = rol;
        this.estado = estado;
        this.fecha = fecha;
    }

    public Usuario(String idusuario, String clave, String rol, String estado) {
        this.idusuario = idusuario;
        this.clave = clave;
        this.rol = rol;
        this.estado = estado;
    }

    public Usuario(String idusuario, String clave) {
        this.idusuario = idusuario;
        this.clave = clave;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    
    
    

    /**
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the rol
     */
    public String getRol() {
        return rol;
    }

    /**
     * @param rol the rol to set
     */
    public void setRol(String rol) {
        this.rol = rol;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    

    /**
     * @return the fecha
     */
   
    
    
}
