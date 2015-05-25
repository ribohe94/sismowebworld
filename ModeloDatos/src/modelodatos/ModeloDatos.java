package modelodatos;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelodatos.DAO.ContenedorNoticias;
import modelodatos.DAO.Ingreso;
import modelodatos.DAO.Noticia;
import modelodatos.DAO.Usuario;
import modelodatos.DAO.Validacion;

public class ModeloDatos {

    private ModeloDatos() {
        usuario = new Usuario();
        ingreso = new Ingreso();
        validar = new Validacion();
        noticias = new ContenedorNoticias();
        try {
            cargarNoticias();
        } catch (SQLException ex) {
            Logger.getLogger(ModeloDatos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ContenedorNoticias getNoticias() {
        return noticias;
    }

    public static ModeloDatos obtenerInstancia() {
        return (modelo == null) ? new ModeloDatos() : modelo;
    }

    public boolean insertarUsuario(String correo, String nombre, String apellido1,
            String apellido2, String password, String rutaFoto, String nacimiento) throws SQLException {
        return usuario.insertar(correo, nombre, apellido1, apellido2, password, rutaFoto, nacimiento, ingreso);
    }

    public boolean insertarIngreso(String correo, String pais) throws SQLException {
        return ingreso.insertar(correo, pais);
    }

    public boolean insertarNoticia(String titulo, String fecha, String contenido) throws SQLException {
        return noticias.addNoticia(new Noticia(titulo, contenido, fecha, ""));
    }

    public boolean cargarNoticias() throws SQLException {
        return noticias.cargarNoticias();
    }

    public boolean existeUsuario(String email, String password) throws SQLException {
        boolean existe = validar.existeUsuario(email, password);
        if(existe == true){
            insertarIngreso(email, "Costa Rica");
        }
        return existe;
    }

    private Usuario usuario;
    private Ingreso ingreso;
    private Validacion validar;
    private ContenedorNoticias noticias;
    private static ModeloDatos modelo;
    

}
