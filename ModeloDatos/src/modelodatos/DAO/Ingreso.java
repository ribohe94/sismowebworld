package modelodatos.DAO;

import java.sql.SQLException;

public class Ingreso extends DAO {

    public Ingreso(String url, String user, String password) {
        super(url, user, password);
    }

    public Ingreso() {
        super();
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getHoraIngreso() {
        return horaIngreso;
    }

    public void setHoraIngreso(String horaIngreso) {
        this.horaIngreso = horaIngreso;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean insertar(String correo, String pais) throws SQLException {
        connect();
        stmt = conn.prepareStatement("INSERT INTO Ingreso(usuario,horaIngreso,pais)"
                + " values(?,?,?)");
        stmt.setString(1, correo);
        
        java.util.Date dt = new java.util.Date();
        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String currentTime = sdf.format(dt);
        
        stmt.setString(2, currentTime);
        stmt.setString(3, pais);
        stmt.executeUpdate();
        disconnect();
        return true;
    }
    
    /*Atributos*/
    private String usuario;
    private String horaIngreso;
    private String pais;
}
