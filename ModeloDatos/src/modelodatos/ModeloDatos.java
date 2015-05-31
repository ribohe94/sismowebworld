package modelodatos;

import java.sql.SQLException;
import java.util.ArrayList;
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
        usuarioRegistrado = null;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ContenedorNoticias getNoticias() {
        return noticias;
    }

    public static ModeloDatos obtenerInstancia() {
        return (modelo == null) ? new ModeloDatos() : modelo;
    }

    public boolean insertarUsuario(String correo, String nombre, String apellido1,
            String apellido2, String password, String rutaFoto, String nacimiento, String isAdmin) throws SQLException {
        return usuario.insertar(correo, nombre, apellido1, apellido2, password, rutaFoto, nacimiento, isAdmin, ingreso);
    }

    public boolean modificarUsuario(Usuario u) throws SQLException {
        return usuario.modificaUsuario(u);
    }
    
    public ArrayList<Usuario> getListaUsuarios() throws SQLException {
        return usuario.getListaUsuario();
    }
    
    public boolean modificarNom(Usuario u) throws SQLException {
        return usuario.modificaUsuarioNom(u);
    }
    
    public boolean modificarEmail(Usuario u, String email) throws SQLException {
        return usuario.modificaUsuarioEmail(u, email);
    }
    
    public boolean modificarApe1(Usuario u) throws SQLException {
        return usuario.modificaUsuarioApe1(u);
    }
    
    public boolean modificarApe2(Usuario u) throws SQLException {
        return usuario.modificaUsuarioApe2(u);
    }
    
    public boolean modificarPass(Usuario u) throws SQLException {
        return usuario.modificaUsuarioPass(u);
    }
    
    public boolean modificarNac(Usuario u) throws SQLException {
        return usuario.modificaUsuarioNac(u);
    }
    
    public boolean modificarIsAdmin(Usuario u) throws SQLException {
        return usuario.modificaUsuarioIsAdmin(u);
    }
    
    public boolean insertarIngreso(String correo, String pais) throws SQLException {
        return ingreso.insertar(correo, pais);
    }

    public ArrayList<Ingreso> getListaIngreso() throws SQLException {
        return ingreso.getIngresos();
    }
    
    public int getCantPaises() throws SQLException {
        return ingreso.getCantPaises();
    }
    
    public int getCantPaisXIngreso(String pais) throws SQLException {
        return ingreso.getCantIngresoPais(pais);
    }
    
    public ArrayList<String> getNombrePaises() throws SQLException {
        return ingreso.getNombresPaises();
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
            insertarIngreso(email, "Italia");
        }
        return existe;
    }

    public Usuario getUsuario(String email) throws SQLException {
        return usuario.getUsuario(email);
    }
    
    private Usuario usuario;
    private Ingreso ingreso;
    private Validacion validar;
    private ContenedorNoticias noticias;
    private Usuario usuarioRegistrado;
    private static ModeloDatos modelo;
    

}
