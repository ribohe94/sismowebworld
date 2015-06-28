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
        stmt = conn.prepareStatement("SELECT * FROM Usuario WHERE email = ? AND password = ?");
        stmt.setString(1, email);
        stmt.setString(2, password);
        ResultSet rs = stmt.executeQuery();

//        System.out.println(rs.getString("email"));
//        System.out.println(rs.getString("password"));
        if (rs.next()) {
            if ((rs.getString("email").equals(email))
                    && (rs.getString("password").equals(password))) {
                disconnect();
                return true;
            } else {
                disconnect();
                return false;
            }
        }
        return false;
    }
}
