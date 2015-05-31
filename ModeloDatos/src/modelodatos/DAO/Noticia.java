/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelodatos.DAO;

import java.sql.SQLException;

/**
 *
 * @author bove
 */
public class Noticia {

    public Noticia(String titulo, String contenido, String fecha, String id) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.fecha = fecha;
        this.id = id;
    }

    public Noticia() {
        super();
    }

    public String getTitulo() {
        return titulo + "\n";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    /*Metodos*/

    @Override
    public String toString() {
        return titulo + "\n" + fecha + "\n" + contenido + "\n";
    }
    
    /*Atributos*/

    private String titulo;
    private String contenido;
    private String fecha;
    private String id;

}
