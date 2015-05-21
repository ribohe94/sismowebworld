package modelodatos.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Validacion extends DAO {

    public Validacion(String url, String user, String password) {
        super(url, user, password);
    }

    public Validacion() {
        super();
    }

    public boolean existeUsuario(String email, String password) throws SQLException {
        connect();
        stmt = conn.prepareStatement("INSERT INTO Usuario(email,nombre,apellido1,"
                + "apellido2,password,rutaFoto,nacimiento,isAdministrador) values(?,?,?,?,?,?,?,?)");
        stmt = conn.prepareStatement("SELECT * FROM Usuario WHERE email='" + email + "' AND password='" + password + "'");
        ResultSet rs = stmt.executeQuery();
        boolean re = rs.first();
        disconnect();
        return re;
    }
}
