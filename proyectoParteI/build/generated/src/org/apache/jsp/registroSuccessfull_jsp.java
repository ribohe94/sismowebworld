package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registroSuccessfull_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Inicio</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"default.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/scripts.js\"></script>\n");
      out.write("\n");
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
      out.write("\n");
      out.write("                <section id=\"success\">\n");
      out.write("                    <h1 id=\"r_bienvenido\">Bienvenid@</h1>\n");
      out.write("                    <p id=\"r_saludo\">Usted se ha registrado Correctamente</br>\n");
      out.write("                        vaya a la <a href=\"indexVisitantes.jsp\">Pagina principal</a> de Sismo Web World </p>\n");
      out.write("                </section>\n");
      out.write("                <section id=\"noticias\">\n");
      out.write("                    <h2>Noticias</h2>\n");
      out.write("                    <span>\n");
      out.write("                        <script src=\"http://code.jquery.com/jquery-latest.min.js\"></script>\n");
      out.write("                        <script>\n");
      out.write("                            $(document).ready(function () {\n");
      out.write("                                var x = 0;\n");
      out.write("                                // When the HTML DOM is ready loading, then execute the following function...\n");
      out.write("                                $('#next').click(function () {               // Locate HTML DOM element with ID \"somebutton\" and assign the following function to its \"click\" event...\n");
      out.write("                                    $.get('ServletControlC', {id: 0, id2: 1}, function (responseText) { // Execute Ajax GET request on URL of \"someservlet\" and execute the following function with Ajax response text...\n");
      out.write("                                        $('#tituloNoticia').text(responseText);         // Locate HTML DOM element with ID \"somediv\" and set its text content with the response text.\n");
      out.write("                                        $.get('ServletControlC', {id: 1, id2: 1}, function (responseText) { // Execute Ajax GET request on URL of \"someservlet\" and execute the following function with Ajax response text...\n");
      out.write("                                            $('#fechaNoticia').text(responseText);         // Locate HTML DOM element with ID \"somediv\" and set its text content with the response text.\n");
      out.write("                                            $.get('ServletControlC', {id: 2, id2: 1}, function (responseText) { // Execute Ajax GET request on URL of \"someservlet\" and execute the following function with Ajax response text...\n");
      out.write("                                                $('#contNoticia').text(responseText);         // Locate HTML DOM element with ID \"somediv\" and set its text content with the response text.\n");
      out.write("                                            });\n");
      out.write("                                        });\n");
      out.write("                                    });\n");
      out.write("                                });\n");
      out.write("                                $('#previous').click(function () {               // Locate HTML DOM element with ID \"somebutton\" and assign the following function to its \"click\" event...\n");
      out.write("                                    $.get('ServletControlC', {id: 0, id2: 0}, function (responseText) { // Execute Ajax GET request on URL of \"someservlet\" and execute the following function with Ajax response text...\n");
      out.write("                                        $('#tituloNoticia').text(responseText);         // Locate HTML DOM element with ID \"somediv\" and set its text content with the response text.\n");
      out.write("                                        $.get('ServletControlC', {id: 1, id2: 0}, function (responseText) { // Execute Ajax GET request on URL of \"someservlet\" and execute the following function with Ajax response text...\n");
      out.write("                                            $('#fechaNoticia').text(responseText);         // Locate HTML DOM element with ID \"somediv\" and set its text content with the response text.\n");
      out.write("                                            $.get('ServletControlC', {id: 2, id2: 0}, function (responseText) { // Execute Ajax GET request on URL of \"someservlet\" and execute the following function with Ajax response text...\n");
      out.write("                                                $('#contNoticia').text(responseText);         // Locate HTML DOM element with ID \"somediv\" and set its text content with the response text.\n");
      out.write("                                            });\n");
      out.write("                                        });\n");
      out.write("                                    });\n");
      out.write("                                });\n");
      out.write("                            });\n");
      out.write("                        </script>\n");
      out.write("                        <div id=\"tituloNoticia\"></div>\n");
      out.write("                        <div id=\"fechaNoticia\"></div>\n");
      out.write("                        <div id=\"contNoticia\"></div>\n");
      out.write("                        <button id=\"previous\">previous</button>\n");
      out.write("                        <button id=\"next\">next</button>\n");
      out.write("                    </span>\n");
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
