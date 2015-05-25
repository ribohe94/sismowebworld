/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelodatos.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ContenedorNoticias extends DAO {

    public ContenedorNoticias(String url, String user, String password) {
        super(url, user, password);
        this.listaNoticias = new ArrayList<>();
    }

    public ContenedorNoticias(ArrayList<Noticia> listaNoticias, String url, String user, String password) {
        super(url, user, password);
        if (listaNoticias != null) {
            this.listaNoticias = listaNoticias;
        }
    }

    public ContenedorNoticias() {
        super();
        this.listaNoticias = new ArrayList<>();
    }

    public Noticia getNoticiaPosicion (int i) {
        return listaNoticias.get(i);
    }
    
    public boolean addNoticia(Noticia n) throws SQLException {
        connect();
        if (n != null) {
            n.setId(String.valueOf(listaNoticias.size() + 1));
            this.listaNoticias.add(n);
            stmt = conn.prepareStatement("INSERT INTO Noticia(titulo,fecha,contenido,id)"
                    + " values(?,?,?,?)");
            stmt.setString(1, n.getTitulo());
            stmt.setString(2, n.getFecha());
            stmt.setString(3, n.getContenido());
            stmt.setString(4, String.valueOf(listaNoticias.size()));
            stmt.executeUpdate();
            disconnect();
            return true;
        }
        return false;
    }

    public boolean cargarNoticias() throws SQLException {
        connect();
        String titulo, fecha, contenido, id;
        boolean flag = false;
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/proyecto", "root", "root");

        String SQL = "SELECT * FROM Noticia";
        Statement stmtSQL = con.createStatement();
        ResultSet rs = stmtSQL.executeQuery(SQL);

        
            while (rs.next()) {
                flag = true;
                id = String.valueOf(rs.getInt("id"));
                System.out.println(rs.getInt("id"));
                titulo = rs.getString("titulo");
                System.out.println(rs.getString("titulo"));
                fecha = rs.getString("fecha");
                System.out.println(rs.getString("fecha"));
                contenido = rs.getString("contenido");
                System.out.println(rs.getString("contenido"));
                listaNoticias.add(new Noticia(titulo, contenido, fecha, id));
            }
//            System.out.println(toString());
            return flag;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < listaNoticias.size(); i++) {
            sb.append(listaNoticias.get(i).toString());
        }
        return sb.toString();
    }

    //Atributos
    private ArrayList<Noticia> listaNoticias;

}
