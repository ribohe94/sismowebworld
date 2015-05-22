package modelodatos;

import java.sql.SQLException;
import modelodatos.DAO.Ingreso;
import modelodatos.DAO.Usuario;
import modelodatos.DAO.Validacion;

public class ModeloDatos {

    private ModeloDatos() {
        usuario = new Usuario();
        ingreso = new Ingreso();
        validar = new Validacion();
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
    private static ModeloDatos modelo;
    

}
