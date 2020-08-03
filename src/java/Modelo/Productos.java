/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author TuNombre
 */
public class Productos {
    
    int idproducto;
    String nomproducto;
    String cantidad;
    String precio;
    String estado;

    public Productos() {
    }

    public Productos(int idproducto, String nomproducto, String cantidad, String precio, String estado) {
        this.idproducto = idproducto;
        this.nomproducto = nomproducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.estado = estado;
    }

    public int getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(int idproducto) {
        this.idproducto = idproducto;
    }

    public String getNomproducto() {
        return nomproducto;
    }

    public void setNomproducto(String nomproducto) {
        this.nomproducto = nomproducto;
    }

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
}
