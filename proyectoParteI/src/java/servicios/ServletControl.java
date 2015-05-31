package servicios;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelodatos.ModeloDatos;

public class ServletControl extends HttpServlet {
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ModeloDatos datos = ModeloDatos.obtenerInstancia();
        String email = request.getParameter("email");
        String nombre = request.getParameter("nombre");
        String apellido1 = request.getParameter("apellido1");
        String apellido2 = request.getParameter("apellido2");
        String password = request.getParameter("password");
        String foto = "foto";
        String fecha = request.getParameter("nacimiento");
        String[] adminArray = request.getParameterValues("isAdmin");
        String admin = "0";
        for (String admin1 : adminArray) {
            if ("isAdminN".equals(adminArray[0])) {
                admin = "0";
            }
            if ("isAdminY".equals(adminArray[0])) {
                admin = "1";
            }
        }
        
        boolean band = true;
        
        try {
            if (datos.insertarUsuario(email, nombre, apellido1, apellido2, password, foto, fecha, admin)) {
                System.out.println("Ingreso Válido");
            } else {
                System.out.println("Errores al procesar Ingreso");
                band = false;
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(ServletControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        if (band == true) {
            response.sendRedirect("registroSuccessfull.jsp");
        } else {
            response.sendRedirect("registroFail.jsp");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
