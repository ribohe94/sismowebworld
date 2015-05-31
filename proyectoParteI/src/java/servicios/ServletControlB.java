package servicios;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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
        Usuario u = new Usuario();
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
                if ("10".equals(val)) {
                    if (usuarioConectado.getAdmin() == 1) {
                        text = "Si";
                    } else {
                        if (usuarioConectado.getAdmin() == 0) {
                            text = "No";
                        }
                    }
                }

                if ("5".equals(val)) {
                    usuarioConectado.setNombre(request.getParameter("name"));
                    datos.modificarNom(usuarioConectado);
                    text = usuarioConectado.getNombre();
                }
                if ("6".equals(val)) {
                    usuarioConectado.setApellido1(request.getParameter("ape1"));
                    datos.modificarApe1(usuarioConectado);
                    text = usuarioConectado.getApellido1();
                }
                if ("7".equals(val)) {
                    usuarioConectado.setApellido2(request.getParameter("ape2"));
                    datos.modificarApe2(usuarioConectado);
                    text = usuarioConectado.getApellido2();
                }
                if ("8".equals(val)) {
                    String correo = request.getParameter("email");
                    datos.modificarEmail(usuarioConectado, correo);
                    text = usuarioConectado.getCorreo();
                }
                if ("9".equals(val)) {
                    usuarioConectado.setNacimiento(request.getParameter("nac"));
                    datos.modificarNac(usuarioConectado);
                    text = usuarioConectado.getNacimiento();
                }
                if ("admin".equals(val)) {
                    text = String.valueOf(usuarioConectado.getAdmin());
                }

                if ("26".equals(val)) { //Regresa la cantidad de paises
                    text = String.valueOf(datos.getCantPaises());
                }

                if ("27".equals(val)) { //Regresa el nombre de un pais en la posición posPais
                    int pos = Integer.parseInt(request.getParameter("posPais"));
                    text = datos.getNombrePaises().get(pos);
                }

                if ("28".equals(val)) { //Regresa la cantidad de veces que el sitie fue ingresado desde un país
                    String nombrePais = request.getParameter("nombrePais");
                    text = String.valueOf(datos.getCantPaisXIngreso(nombrePais));
                }

                if (usuarioConectado.getAdmin() == 1) {

                    if ("11".equals(val)) {
                        text = String.valueOf(datos.getListaUsuarios().size());
                    }
                    if ("12".equals(val)) {
                        text = datos.getListaUsuarios().get(Integer.parseInt(request.getParameter("pos"))).getNombre();
                    }
                    if ("13".equals(val)) {
                        System.out.println(request.getParameter("pos"));
                        text = datos.getListaUsuarios().get(Integer.parseInt(request.getParameter("pos"))).getCorreo();
                    }
                    if ("14".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        if (u == null) {
                            text = "Usuario no registrado";
                        } else {
                            text = u.getNombre();
                        }
                    }
                    if ("15".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        if (u == null) {
                            text = "Usuario no registrado";
                        } else {
                            text = u.getApellido1();
                        }
                    }
                    if ("16".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        if (u == null) {
                            text = "Usuario no registrado";
                        } else {
                            text = u.getApellido2();
                        }
                    }
                    if ("17".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        if (u == null) {
                            text = "Usuario no registrado";
                        } else {
                            text = u.getCorreo();
                        }
                    }
                    if ("18".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        if (u == null) {
                            text = "Usuario no registrado";
                        } else {
                            text = u.getNacimiento();
                        }
                    }
                    if ("19".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        if (u == null) {
                            text = "Usuario no registrado";
                        } else {
                            if (u.getAdmin() == 0) {
                                text = "No";
                            } else {
                                if (u.getAdmin() == 1) {
                                    text = "Si";
                                }
                            }
                        }
                    }
                    if ("20".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        u.setNombre(request.getParameter("name"));
                        datos.modificarNom(u);
                        text = u.getNombre();
                    }
                    if ("21".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        u.setApellido1(request.getParameter("ape1"));
                        datos.modificarApe1(u);
                        text = u.getApellido1();
                    }
                    if ("22".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        u.setApellido2(request.getParameter("ape2"));
                        datos.modificarApe2(u);
                        text = u.getApellido2();
                    }
                    if ("23".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        datos.modificarEmail(u, request.getParameter("email01"));
                        text = u.getCorreo();
                    }
                    if ("24".equals(val)) {
                        u = datos.getUsuario(request.getParameter("email"));
                        u.setNacimiento(request.getParameter("nac"));
                        datos.modificarNac(u);
                        text = u.getNacimiento();
                    }

                    if ("25".equals(val)) {
                        boolean flag = true;
                        ArrayList<String> listaPaises = new ArrayList<>();
                        if ("0".equals(request.getParameter("chart"))) {
                            for (int i = 0; i < datos.getListaIngreso().size(); i++) {
                                flag = true;
                                for (String listaPaise : listaPaises) {
                                    if (datos.getListaIngreso().get(i).getPais() == null ? listaPaise == null : datos.getListaIngreso().get(i).getPais().equals(listaPaise)) {
                                        flag = false;
                                    }
                                }
                                if (flag) {
                                    listaPaises.add(datos.getListaIngreso().get(i).getPais());
                                }
                            }
                            text = String.valueOf(listaPaises.size());
                        }
                    }

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
