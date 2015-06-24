package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelodatos.ModeloDatos;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script type=\"text/javascript\" src=\"js/scripts.js\"></script>    \n");
      out.write("        <script type=\"text/ajax\" src=\"js/AJAX.js\"></script>    \n");
      out.write("        <script src=\"http://maps.google.com/maps/api/js?sensor=false\"></script>  \n");
      out.write("        <script type=\"text/javascript\" src=\"http://api.geonames.org/export/jsr_class.js\"></script>\n");
      out.write("        <title>Inicio</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            <header>\n");
      out.write("                <section id=\"encabezado\">\n");
      out.write("                    <h1>\n");
      out.write("                        <a href=\"index.jsp\">\n");
      out.write("                            <p id=\"pEncabezado\"><img src=\"images/Captura de pantalla de 2015-05-16 11_23_46.png\" id=\"img_logo\"/></p>\n");
      out.write("                            <p id=\"pEncabezado\">SISMO WEB WORLD</p>\n");
      out.write("                        </a>\n");
      out.write("                    </h1>\n");
      out.write("                </section>\n");
      out.write("            </header>\n");
      out.write("\n");
      out.write("            <div id=\"contents\">\n");
      out.write("                <section>\n");
      out.write("                    <form action=\"ServletControlC\" method=\"GET\" id=\"formularioNoticia\">\n");
      out.write("                        <input type=\"submit\" form=\"formularioNoticia\"/>\n");
      out.write("                    </form>\n");
      out.write("                </section>\n");
      out.write("                <section id=\"navegacion\">\n");
      out.write("                    <article class=\"menu_iz\">\n");
      out.write("                        <li><a href=\"index.jsp\"><p>INICIO</p></a></li>\n");
      out.write("                    </article>\n");
      out.write("                    <article class=\"menu_iz\">\n");
      out.write("                        <li><a href=\"registro.jsp\"><p>REGISTRO</p></a></li>\n");
      out.write("                    </article>\n");
      out.write("                    <article class=\"menu_iz\">\n");
      out.write("                        <li><a href=\"login.jsp\"><p>INGRESO</p></a></li>\n");
      out.write("                    </article>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <section id=\"info\">\n");
      out.write("                    <div id=\"c_info\">\n");
      out.write("                        <article>\n");
      out.write("                            <div id=\"Mision\">\n");
      out.write("                                <h2 class=\"a\">Misión</h2>\n");
      out.write("                                <p class=\"a\">Ejecutar y promover, permanentemente, investigaciones y estudios sismológicos destinados a atender la demanda de seguridad en la población ante la amenaza sísmica en el territorio nacional, la formación de personal especializado y divulgar los nuevos conocimientos de las ciencias. </p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div id=\"Vision\">\n");
      out.write("                                <h2 class=\"a\">Visión</h2>\n");
      out.write("                                <p class=\"a\">Ser una organización de excelencia en el área de protección a la colectividad frente a la amenaza sísmica, de referencia nacional e internacional, distinguida por su capacidad de servicio, la calidad de su investigación y su desarrollo técnico y científico.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("                <section id=\"noticias\" onload=\"cargarNoticias()\">\n");
      out.write("                    <h2>Noticias</h2>\n");
      out.write("\n");
      out.write("                    <div id=\"tituloNoticia\"></div>\n");
      out.write("                    <div id=\"fechaNoticia\"></div>\n");
      out.write("                    <div id=\"contNoticia\"></div>\n");
      out.write("                    <button id=\"previous\">previous</button>\n");
      out.write("                    <button id=\"next\">next</button>\n");
      out.write("                </section>\n");
      out.write("            </div>\n");
      out.write("            <footer></footer>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
