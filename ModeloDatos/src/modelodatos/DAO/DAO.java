package modelodatos.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DAO {

    public DAO(String url, String user, String password) {
        this.dburl = url;
        this.user = user;
        this.password = password;
    }

    public DAO() {
        this(DEFAULT_URL, DEFAULT_USER, DEFAULT_PASS);
    }

    public void connect() {
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(dburl, user, password);
        } catch (ClassNotFoundException | SQLException e) {
        }

    }

    public void disconnect() {
        try {
            stmt.close();
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    Connection conn;
    PreparedStatement stmt;

    String driver = "com.mysql.jdbc.Driver";
    String dburl;

    String user;
    String password;

    static final String DEFAULT_USER = "root";
    static final String DEFAULT_PASS = "root";
    static final String DEFAULT_URL = "jdbc:mysql://localhost:3307/proyecto";

}
//jdbc:mysql://localhost:3307/bd_final