package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class mapaVisitantes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/AJAX.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"js/scripts.js\"></script>    \n");
      out.write("        <script src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>  \n");
      out.write("        <script type=\"text/javascript\" src=\"http://api.geonames.org/export/jsr_class.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body onload=\"cargarpaises();\">\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <header>\n");
      out.write("                <section id=\"encabezado\">\n");
      out.write("                    <h1>\n");
      out.write("                        <a href=\"index.jsp\">\n");
      out.write("                            <img src=\"images/Captura de pantalla de 2015-05-16 11_23_46.png\" id=\"img_logo\" alt=\"logo\"/>\n");
      out.write("                        </a>\n");
      out.write("                        <a href=\"index.jsp\">SISMO WEB WORLD</a>\n");
      out.write("                    </h1>\n");
      out.write("                </section>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div id=\"contents\">\n");
      out.write("\n");
      out.write("                <section id=\"navegacion\">\n");
      out.write("                    <div class=\"links_nav\"><a href=\"index.jsp\"><p>Inicio</p></a></div>\n");
      out.write("                    <div class=\"links_nav\"><a href=\"registro.jsp\"><p>Registro</p></a></div>\n");
      out.write("                    <div class=\"links_nav\"><a href=\"login.jsp\"><p>Ingreso</p></a></div>\n");
      out.write("                    <div><a href=\"mapaVisitantes.jsp\"><p>Mapa</p></a></div>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <section id=\"mapa\">\n");
      out.write("                    <div id=\"contents_mapa\">\n");
      out.write("                        <div id=\"SBuscar\">\n");
      out.write("                            <h3>Especifique una fecha y elija un Pais a consultar</h3>\n");
      out.write("                            <input id=\"fromDate\" type=\"date\" value=\"2015-05-21\" >\n");
      out.write("                            <select id=\"SPais\"></select>\n");
      out.write("                            <input type=\"button\" onclick=\"Consulta();\" value=\"enviar\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div id=\"SMapa\"></div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <div id=\"noticias\">\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><button id=\"previous\" class=\"btn\"><</button></td>\n");
      out.write("                            <td style=\"width: 100%; text-align: center\"><h2>Noticias</h2></td>\n");
      out.write("                            <td><button id=\"next\" class=\"btn\">></button></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
      out.write("                    <table>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><div id=\"tituloNoticia\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><div id=\"fechaNoticia\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <td><div id=\"contNoticia\"></div></td>\n");
      out.write("                        </tr>\n");
      out.write("                    </table>\n");
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
