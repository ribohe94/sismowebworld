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
        stmt = conn.prepareStatement("SELECT * FROM Usuario WHERE email='" + email + "' AND password='" + password + "'");
        ResultSet rs = stmt.executeQuery();
        rs.next();
        if ((rs.getString("email") == null ? email == null : rs.getString("email").equals(email)) && 
                (rs.getString("password") == null ? password == null : rs.getString("password").equals(password))) {
            disconnect();
            return true;
        } else {
            disconnect();
            return false;
        }
    }
}
