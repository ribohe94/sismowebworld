package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelodatos.ModeloDatos;

public final class Perfil_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://www.google.com/jsapi\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.10.2.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/ui/1.11.4/jquery-ui.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/scripts.js\"></script>    \n");
      out.write("        <script type=\"text/javascript\" src=\"js/AJAX.js\"></script>    \n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#tabs\").tabs();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("\n");
      out.write("            <header>\n");
      out.write("                <section id=\"encabezado\">\n");
      out.write("                    <h1>\n");
      out.write("                        <a href=\"index.jsp\">\n");
      out.write("                            <p id=\"pEncabezado\"><img src=\"images/Captura de pantalla de 2015-05-16 11_23_46.png\" id=\"img_logo\"/></p>\n");
      out.write("                            <p id=\"pEncabezado\">SISMO WEB WORLD</p>\n");
      out.write("                        </a>\n");
      out.write("                    </h1>\n");
      out.write("                </section>\n");
      out.write("                <div id=\"datosSesion\" onload=\"cargarDatosSesion()\"></div>\n");
      out.write("                <input id=\"user\" type=\"hidden\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.usuario}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\n");
      out.write("                <script>\n");
      out.write("                    if (document.getElementById(\"user\").value !== \"\") {\n");
      out.write("                        document.getElementById(\"datosSesion\").innerHTML = document.getElementById(\"user\").value + \" | <a href=\\\"ServletCerrarSesion\\\">Cerrar sesion</a>\";\n");
      out.write("                    }\n");
      out.write("                </script>\n");
      out.write("            </header>\n");
      out.write("            <section id=\"navegacion\">\n");
      out.write("                <div class=\"links_nav\"><a href=\"index.jsp\"><p>Inicio</p></a></div>\n");
      out.write("                <div class=\"links_nav\"><a href=\"Perfil.jsp\"><p>Perfil</p></a></div>\n");
      out.write("                <div><a href=\"mapa.jsp\"><p>Mapa</p></a></div>\n");
      out.write("            </section>\n");
      out.write("            <div id=\"noticias\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><button id=\"previous\" class=\"btn\"><</button></td>\n");
      out.write("                        <td style=\"width: 100%; text-align: center\"><h2>Noticias</h2></td>\n");
      out.write("                        <td><button id=\"next\" class=\"btn\">></button></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><div id=\"tituloNoticia\"></div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><div id=\"fechaNoticia\"></div></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td><div id=\"contNoticia\"></div></td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
      out.write("            </div>\n");
      out.write("            <div id=\"tabs\">\n");
      out.write("\n");
      out.write("                <ul>\n");
      out.write("                    <li><a href=\"#tabs-1\">Perfil</a></li>\n");
      out.write("                    <li><a href=\"#tabs-2\">Modificar usuario</a></li>\n");
      out.write("                    <li><a href=\"#tabs-3\">Gráfico de ingresos</a></li>\n");
      out.write("                </ul>\n");
      out.write("\n");
      out.write("                <div id=\"tabs-1\">\n");
      out.write("                    <table id=\"tabla_info\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nombre: </td><td id=\"divnombre\"></td><td><button id=\"btnModNom\">Modificar</button></td><td><button id=\"btnSavNom\" disabled>Guardar</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Primer apellido: </td><td id=\"divapellido1\"></td><td><button id=\"btnModApe1\">Modificar</button></td><td><button id=\"btnSavApe1\" disabled>Guardar</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Segundo apellido: </td><td id=\"divapellido2\"></td><td><button id=\"btnModApe2\">Modificar</button></td><td><button id=\"btnSavApe2\" disabled>Guardar</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Email: </td><td id=\"divemail\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Fecha de nacimiento: </td><td id=\"divnacimiento\"></td><td><button id=\"btnModNac\">Modificar</button></td><td><button id=\"btnSavNac\" disabled>Guardar</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Es administrador: </td><td id=\"divnadmin\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"tabs-2\">\n");
      out.write("                    <table id=\"tablaUsuarios\">\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Ingrese el correo del usuario que desea modificar: </td> <td><input id=\"usuarioemail\" type=\"text\"/></td> <td><button id=\"buscarUsuario\">Enviar</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Nombre: </td><td id=\"divnombreuser\"></td><td><button id=\"btnModNomuser\">Modificar</button></td><td><button id=\"btnSavNomuser\" disabled>Guardar</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Primer apellido: </td><td id=\"divapellido1user\"></td><td><button id=\"btnModApe1user\">Modificar</button></td><td><button id=\"btnSavApe1user\" disabled>Guardar</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Segundo apellido: </td><td id=\"divapellido2user\"></td><td><button id=\"btnModApe2user\">Modificar</button></td><td><button id=\"btnSavApe2user\" disabled>Guardar</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Email: </td><td id=\"divemailuser\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Fecha de nacimiento: </td><td id=\"divnacimientouser\"></td><td><button id=\"btnModNacuser\">Modificar</button></td><td><button id=\"btnSavNacuser\" disabled>Guardar</button></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td>Es administrador: </td><td id=\"divnadminuser\"></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td id=\"divNoticias\"><a href=\"ActualizarInformacion.jsp\">Agregar Noticias</a></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <div id=\"mensaje_usuario\"></div>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"tabs-3\">\n");
      out.write("                    <div id=\"chart_div\" onload=\"drawChart()\">(Permita algunos segundos para cargar la información)</div>\n");
      out.write("                    <script>\n");
      out.write("                        drawChart();\n");
      out.write("                    </script>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <footer></footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
