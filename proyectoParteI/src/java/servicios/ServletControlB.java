package servicios;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelodatos.DAO.Usuario;
import modelodatos.ModeloDatos;

public class ServletControlB extends HttpServlet {

    ModeloDatos datos = ModeloDatos.obtenerInstancia();
    Usuario usuarioConectado = new Usuario();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        boolean band = true;
        String mail = request.getParameter("emailLogin");
        String pass = request.getParameter("passwordLogin");

        try {
            if (datos.existeUsuario(mail, pass)) {
                datos.setUsuario(datos.getUsuario(mail));
                usuarioConectado = datos.getUsuario(mail);
                System.out.println("Successfull Login ---------------------------------->" + datos.getUsuario(mail).toString());

            } else {
                datos.setUsuario(null);
                System.out.println("Errores al procesar Login");
                band = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(ServletControlB.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (band == true) {
            response.sendRedirect("indexVisitantes.jsp");
        } else {
            response.sendRedirect("loginFail.jsp");
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
        String text = "";
        if (request.getParameter("id") != null) {
            String val = request.getParameter("id");
            try {
                if ("0".equals(val)) {
                    text = usuarioConectado.getNombre();
                }
                if ("1".equals(val)) {
                    text = usuarioConectado.getApellido1();
                }
                if ("2".equals(val)) {
                    text = usuarioConectado.getApellido2();
                }
                if ("3".equals(val)) {
                    text = usuarioConectado.getCorreo();
                }
                if ("4".equals(val)) {
                    text = usuarioConectado.getNacimiento();
                }

                response.setContentType("text/html");  // Set content type of the response so that jQuery knows what it can expect.
                response.setCharacterEncoding("UTF-8"); // You want world domination, huh?
                response.getWriter().write(text);
            } catch (Exception e) {

            }
        } else {
            processRequest(request, response);
        }
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
