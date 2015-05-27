/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class ServletControlC extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
    }
    int n = 0;
    ModeloDatos datos = ModeloDatos.obtenerInstancia();

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
        try {
            int val = Integer.valueOf(request.getParameter("id"));
            int val2 = Integer.valueOf(request.getParameter("id2"));

            if (datos.getNoticias().getCantidad() > 0) {

                if ((val2 == 1) && (val == 0)) {
                    n++;
                } else {
                    if ((val2 == 0) && (val == 0)) {
                        n--;
                    }
                }
                if (n == datos.getNoticias().getCantidad()) {
                    n = 0;
                } else {
                    if (n < 0) {
                        n = datos.getNoticias().getCantidad() - 1;
                    }
                }
                if (val == 0) {
                    text = datos.getNoticias().getNoticiaPosicion(n).getTitulo();
                    System.out.println("Obtiene titulo en pos: " + n);
                }
                if (val == 1) {
                    text += datos.getNoticias().getNoticiaPosicion(n).getFecha();
                    System.out.println("Obtiene fecha en pos: " + n);
                }
                if (val == 2) {
                    text += datos.getNoticias().getNoticiaPosicion(n).getContenido();
                    System.out.println("Obtiene cont en pos: " + n);
                }
            }

        } catch (Exception e) {

        }

        try {
            int val = Integer.valueOf(request.getParameter("id"));
            if (val == 3) {
                String titulo = request.getParameter("valort");
                String fecha = request.getParameter("valorf");
                String contenido = request.getParameter("valorc");
                datos.insertarNoticia(titulo, fecha, contenido);
                System.out.println("NOTICIAS AGREGADA");
            }
        } catch (Exception e) {

        }

        response.setContentType("text/html");  // Set content type of the response so that jQuery knows what it can expect.
        response.setCharacterEncoding("UTF-8"); // You want world domination, huh?
        response.getWriter().write(text);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(ServletControlC.class.getName()).log(Level.SEVERE, null, ex);
        }
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
