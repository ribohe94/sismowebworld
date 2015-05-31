package modelodatos.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

    public int getCantPaises() throws SQLException {
        String usuarioQ = "", horaQ = "", paisQ = "";
        connect();
        ArrayList<Ingreso> listaIngresos = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM Ingreso");
        ResultSet res = stmt.executeQuery();

        while (res.next()) {
            usuarioQ = res.getString("usuario");
            horaQ = res.getString("horaIngreso");
            paisQ = res.getString("pais");
            if("Italia".equals(paisQ)) {
                System.out.println(paisQ);
            }
            Ingreso i = new Ingreso();
            i.setUsuario(usuarioQ);
            i.setHoraIngreso(horaQ);
            i.setPais(paisQ);
            listaIngresos.add(i);
        }
        disconnect();
        ArrayList<String> listaPaises = new ArrayList<>();
        boolean flag = true;
        for (Ingreso listaIngreso : listaIngresos) {
            flag = true;
            for (String listaPaise : listaPaises) {
                if (listaIngreso.getPais() == null ? listaPaise == null : listaIngreso.getPais().equals(listaPaise)) {
                    flag = false;
                }
            }
            if (flag) {
                listaPaises.add(listaIngreso.getPais());
            }
        }
        return listaPaises.size();
    }

    public ArrayList<String> getNombresPaises() throws SQLException {
        String usuarioQ = "", horaQ = "", paisQ = "";
        connect();
        ArrayList<Ingreso> listaIngresos = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM Ingreso");
        ResultSet res = stmt.executeQuery();

        while (res.next()) {
            usuarioQ = res.getString("usuario");
            horaQ = res.getString("horaIngreso");
            paisQ = res.getString("pais");
            Ingreso i = new Ingreso();
            i.setUsuario(usuarioQ);
            i.setHoraIngreso(horaQ);
            i.setPais(paisQ);
            listaIngresos.add(i);
            System.out.println(i.getUsuario());
            System.out.println(i.getHoraIngreso());
            System.out.println(i.getPais());
        }
        disconnect();
        ArrayList<String> listaPaises = new ArrayList<>();
        boolean flag = true;
        for (Ingreso listaIngreso : listaIngresos) {
            flag = true;
            for (String listaPaise : listaPaises) {
                if (listaIngreso.getPais() == null ? listaPaise == null : listaIngreso.getPais().equals(listaPaise)) {
                    flag = false;
                }
            }
            if (flag) {
                listaPaises.add(listaIngreso.getPais());
            }
        }
        return listaPaises;
    }

    public int getCantIngresoPais(String pais) throws SQLException {
        connect();
        stmt = conn.prepareStatement("SELECT * FROM Ingreso where pais = ?");
        stmt.setString(1, pais);
        ResultSet res = stmt.executeQuery();
        int cont = 0;
        while (res.next()) {
            cont++;
        }
        disconnect();
        return cont;
    }

    public ArrayList<Ingreso> getIngresos() throws SQLException {
        String usuarioQ = "", horaQ = "", paisQ = "";
        connect();
        ArrayList<Ingreso> listaIngresos = new ArrayList<>();
        stmt = conn.prepareStatement("SELECT * FROM Ingreso");
        ResultSet res = stmt.executeQuery();

        while (res.next()) {
            usuarioQ = res.getString("usuario");
            horaQ = res.getString("horaIngreso");
            paisQ = res.getString("pais");
            Ingreso i = new Ingreso();
            i.setUsuario(usuario);
            i.setHoraIngreso(horaIngreso);
            i.setPais(pais);
            listaIngresos.add(i);
        }
        disconnect();
        return listaIngresos;
    }

    /*Atributos*/
    private String usuario;
    private String horaIngreso;
    private String pais;
}
