package modelodatos.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Usuario extends DAO {

    public Usuario(byte admin, Ingreso ingreso, String correo, String nombre, String apellido1, String apellido2, String password, String rutaFoto, String nacimiento) {
        this.admin = admin;
        this.ingreso = ingreso;
        this.correo = correo;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.password = password;
        this.rutaFoto = rutaFoto;
        this.nacimiento = nacimiento;
    }

    public Usuario(String url, String user, String password) {
        super(url, user, password);
        admin = 0;
        ingreso = null;
    }

    public Usuario() {
        super();
    }

    public byte getAdmin() {
        return admin;
    }

    public void setAdmin(byte admin) {
        this.admin = admin;
    }

    public Ingreso getIngreso() {
        return ingreso;
    }

    public void setIngreso(Ingreso ingreso) {
        this.ingreso = ingreso;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRutaFoto() {
        return rutaFoto;
    }

    public void setRutaFoto(String rutaFoto) {
        this.rutaFoto = rutaFoto;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public boolean insertar(String correo, String nombre, String apellido1,
            String apellido2, String password, String rutaFoto, String nacimiento, String isAdmin, Ingreso ingre) throws SQLException {
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
            stmt.setByte(8, Byte.parseByte(isAdmin));
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

    public Usuario getUsuario(String email) throws SQLException {
        connect();
        String correoaux = "", nombreaux = "", apellido1aux = "", apellido2aux = "", pass = "", rutaFotoaux = "", nacimientoaux = "";
        String usuarioIngreso = "", horaIngreso = "", pais = "";
        byte isAdmin = 0;
        //Selecciono Usuario
        stmt = conn.prepareStatement("SELECT * FROM Usuario where email = ?");
        stmt.setString(1, email);
        ResultSet res = stmt.executeQuery();
        while (res.next()) {
            correoaux = res.getString("email");
            System.out.println(correoaux);
            nombreaux = res.getString("nombre");
            System.out.println(nombreaux);
            apellido1aux = res.getString("apellido1");
            System.out.println(apellido1aux);
            apellido2aux = res.getString("apellido2");
            System.out.println(apellido2aux);
            pass = res.getString("password");
            System.out.println(pass);
            rutaFotoaux = res.getString("rutaFoto");
            nacimientoaux = res.getString("nacimiento");
            isAdmin = res.getByte("isAdministrador");
            System.out.println("Estado ADMIN:   " + isAdmin);
        }
        //Selecciono Ingreso
        stmt = conn.prepareStatement("SELECT usuario FROM Ingreso where usuario = ?");
        stmt.setString(1, email);
        res = stmt.executeQuery();
        while(res.next()) {
            usuarioIngreso = res.getString("usuario");
            horaIngreso = res.getString("horaIngreso");
            pais = res.getString("pais");
        }
        Ingreso i = new Ingreso();
        i.setUsuario(correoaux);
        i.setHoraIngreso(horaIngreso);
        i.setPais(pais);
        disconnect();
        return new Usuario(isAdmin, i, correoaux, nombreaux, apellido1aux, apellido2aux, pass, rutaFotoaux, nacimientoaux);
    }

    public ArrayList<Usuario> getListaUsuario() throws SQLException {
        connect();
        ArrayList<Usuario> lista = new ArrayList<>();
        String correoaux = "", nombreaux = "", apellido1aux = "", apellido2aux = "", pass = "", rutaFotoaux = "", nacimientoaux = "";
        String usuarioIngreso = "", horaIngreso = "", pais = "";
        byte isAdmin = 0;
        //Selecciono Usuario
        stmt = conn.prepareStatement("SELECT * FROM Usuario where isAdministrador = '0'");
        ResultSet res = stmt.executeQuery();
        while (res.next()) {
            correoaux = res.getString("email");
            System.out.println(correoaux);
            nombreaux = res.getString("nombre");
            System.out.println(nombreaux);
            apellido1aux = res.getString("apellido1");
            System.out.println(apellido1aux);
            apellido2aux = res.getString("apellido2");
            System.out.println(apellido2aux);
            pass = res.getString("password");
            System.out.println(pass);
            rutaFotoaux = res.getString("rutaFoto");
            nacimientoaux = res.getString("nacimiento");
            isAdmin = res.getByte("isAdministrador");
            System.out.println("Estado ADMIN:   " + isAdmin);
            lista.add(new Usuario(isAdmin, new Ingreso(), correoaux, nombreaux, apellido1aux, apellido2aux, pass, rutaFotoaux, nacimientoaux));
        }
        //Selecciono Ingreso
//        stmt = conn.prepareStatement("SELECT usuario FROM Ingreso where usuario = ?");
//        stmt.setString(1, usuario);
//        res = stmt.executeQuery();
//        while(res.next()) {
//            usuarioIngreso = res.getString("usuario");
//            horaIngreso = res.getString("horaIngreso");
//            pais = res.getString("pais");
//        }
//        Ingreso i = new Ingreso();
//        i.setUsuario(usuarioIngreso);
//        i.setHoraIngreso(horaIngreso);
//        i.setPais(pais);
        disconnect();
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).getNombre());
        }
        return lista;
    }

    public boolean modificaUsuario(Usuario u) throws SQLException {
        connect();
        stmt = conn.prepareStatement("UPDATE Usuario SET nombre = ?, apellido1 = ?, apellido2 = ?, password = ?, nacimiento = ? WHERE email=?;");
        stmt.setString(1, u.getNombre());
        stmt.setString(2, u.getApellido1());
        stmt.setString(3, u.getApellido2());
        stmt.setString(4, u.getPassword());
        stmt.setString(5, u.getNacimiento());
        stmt.setString(6, u.getCorreo());
        stmt.executeUpdate();
        stmt.close();
        disconnect();
        return true;
    }

    public boolean modificaUsuarioNom(Usuario u) throws SQLException {
        connect();
        stmt = conn.prepareStatement("UPDATE Usuario SET nombre = ? WHERE email=?;");
        stmt.setString(1, u.getNombre());
        stmt.setString(2, u.getCorreo());
        stmt.executeUpdate();
        stmt.close();
        disconnect();
        return true;
    }


    public boolean modificaUsuarioApe1(Usuario u) throws SQLException {
        connect();
        stmt = conn.prepareStatement("UPDATE Usuario SET apellido1 = ? WHERE email=?;");
        stmt.setString(1, u.getApellido1());
        stmt.setString(2, u.getCorreo());
        stmt.executeUpdate();
        stmt.close();
        disconnect();
        return true;
    }

    public boolean modificaUsuarioApe2(Usuario u) throws SQLException {
        connect();
        stmt = conn.prepareStatement("UPDATE Usuario SET apellido2 = ? WHERE email=?;");
        stmt.setString(1, u.getApellido2());
        stmt.setString(2, u.getCorreo());
        stmt.executeUpdate();
        stmt.close();
        disconnect();
        return true;
    }

    public boolean modificaUsuarioPass(Usuario u) throws SQLException {
        connect();
        stmt = conn.prepareStatement("UPDATE Usuario SET password = ? WHERE email=?;");
        stmt.setString(1, u.getPassword());
        stmt.setString(2, u.getCorreo());
        stmt.executeUpdate();
        stmt.close();
        disconnect();
        return true;
    }

    public boolean modificaUsuarioNac(Usuario u) throws SQLException {
        connect();
        stmt = conn.prepareStatement("UPDATE Usuario SET nacimiento = ? WHERE email=?;");
        stmt.setString(1, u.getNacimiento());
        stmt.setString(2, u.getCorreo());
        stmt.executeUpdate();
        stmt.close();
        disconnect();
        return true;
    }
    
    public boolean modificaUsuarioEmail(Usuario u, String email) throws SQLException {
        connect();
        stmt = conn.prepareStatement("UPDATE Usuario SET email = ? WHERE email = ?;");
        stmt.setString(1, email);
        u.setCorreo(email);
        stmt.setString(2, u.getCorreo());
        stmt.executeUpdate();
        stmt.close();
        disconnect();
        return true;
    }
    
    public boolean modificaUsuarioIsAdmin(Usuario u) throws SQLException {
        connect();
        stmt = conn.prepareStatement("UPDATE Usuario SET isAdministrador = ? WHERE email=?;");
        stmt.setString(1, String.valueOf(u.getAdmin()));
        stmt.setString(2, u.getCorreo());
        stmt.executeUpdate();
        stmt.close();
        disconnect();
        return true;
    }
    
    private byte admin;
    private Ingreso ingreso;
    private String correo;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String password;
    private String rutaFoto;
    private String nacimiento;
}
