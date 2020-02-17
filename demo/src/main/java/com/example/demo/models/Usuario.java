package com.example.demo.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="usuario")
@SQLDelete(sql="UPDATE usuario SET estado = 'i' WHERE codigo = ?")
@Where(clause="estado ='a'")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    private int codigo;
    private String nombre;
    private String usuario;
    private String contrasena;
    private String cedula;
    private String provincia;
    private String ciudad;
    private String correo;
    private String estado;

    @Id
    @Column(name = "codigo", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Basic
    @Column(name = "nombre", nullable = false, length = 100)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Basic
    @Column(name = "usuario", nullable = false, length = 100)
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    @Basic
    @Column(name = "contrasena", nullable = false, length = 50)
    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Basic
    @Column(name = "cedula", nullable = false, length = 10)
    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    @Basic
    @Column(name = "provincia", nullable = false, length = 50)
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Basic
    @Column(name = "ciudad", nullable = false, length = 50)
    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    @Basic
    @Column(name = "correo", nullable = false, length = 100)
    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Basic
    @Column(name = "estado", nullable = false, length = 1)
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

}
