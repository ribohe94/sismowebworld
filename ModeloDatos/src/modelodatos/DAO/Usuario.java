package modelodatos.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario extends DAO {

    public Usuario(String url, String user, String password) {
        super(url, user, password);
        admin = 0;
        primerIngreso = null;
    }

    public Usuario() {
        super();
    }

    public boolean insertar(String correo, String nombre, String apellido1,
            String apellido2, String password, String rutaFoto, String nacimiento, Ingreso ingre) throws SQLException {
        connect();
        if (!existe(correo).equals("")) {
            disconnect();
            return false;
        } else {
            stmt = conn.prepareStatement("INSERT INTO Usuario(email,nombre,apellido1,"
                    + "apellido2,password,rutaFoto,nacimiento,isAdministrador) values(?,?,?,?,?,?,?,?)");
            stmt.setString(1, correo);
            stmt.setString(2, nombre);
            stmt.setString(3, apellido1);
            stmt.setString(4, apellido2);
            stmt.setString(5, password);
            stmt.setString(6, "default path");
            stmt.setString(7, nacimiento);
            stmt.setByte(8, admin);
            stmt.executeUpdate();
            ingre.insertar(correo, "Costa Rica");
            disconnect();
            return true;
        }
    }

    public String existe(String correo) throws SQLException {
        stmt = conn.prepareStatement("SELECT email FROM Usuario where email = ?");
        stmt.setString(1, correo);
        ResultSet res = stmt.executeQuery();
        String correoaux = "";
        while (res.next()) {
            correoaux = res.getString("email");
        }
        return correoaux;
    }
    private byte admin;
    private Ingreso primerIngreso;
}
