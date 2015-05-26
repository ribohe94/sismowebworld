package modelodatos.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Usuario extends DAO {

    public Usuario(byte admin, Ingreso primerIngreso, String correo, String nombre, String apellido1, String apellido2, String password, String rutaFoto, String nacimiento) {
        this.admin = admin;
        this.primerIngreso = primerIngreso;
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
        primerIngreso = null;
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

    public Ingreso getPrimerIngreso() {
        return primerIngreso;
    }

    public void setPrimerIngreso(Ingreso primerIngreso) {
        this.primerIngreso = primerIngreso;
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
    
    public Usuario getUsuario(String email) throws SQLException{
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
        return new Usuario(isAdmin, new Ingreso(), correoaux, nombreaux, apellido1aux, apellido2aux, pass, rutaFotoaux, nacimientoaux);
    }
    
    private byte admin;
    private Ingreso primerIngreso;
    private String correo;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private String password;
    private String rutaFoto;
    private String nacimiento;
}
