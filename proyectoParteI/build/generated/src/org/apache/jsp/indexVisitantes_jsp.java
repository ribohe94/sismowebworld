package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class indexVisitantes_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("                <section id=\"navegacion\">\n");
      out.write("                    <article>\n");
      out.write("                        <li><a href=\"indexVisitantes.jsp\"><p>INICIO</p></a></li>\n");
      out.write("                    </article>\n");
      out.write("                    <article>\n");
      out.write("                        <li><a href=\"Perfil.jsp\"><p>Perfil</p></a></li>\n");
      out.write("                    </article>\n");
      out.write("                    <article>\n");
      out.write("                        <li><a href=\"mapaVisitantes.jsp\"><p>MAPA</p></a></li>\n");
      out.write("                    </article>\n");
      out.write("                    <article>\n");
      out.write("                        <li><a href=\"index.jsp\"><p>SALIR</p></a></li>\n");
      out.write("                    </article>\n");
      out.write("                </section>\n");
      out.write("\n");
      out.write("                <section id=\"info\">\n");
      out.write("                    <div id=\"c_info\">\n");
      out.write("                        <article>\n");
      out.write("                            <div id=\"Mision\">\n");
      out.write("                                <h2 class=\"a\">Misión</h2>\n");
      out.write("                                <p class=\"a\">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ac \n");
      out.write("                                    lacus sapien. Quisque eu tincidunt sem. Proin quis lacus vel dui euismod \n");
      out.write("                                    pellentesque. Nullam tincidunt auctor tellus, non rhoncus risus. Maecenas\n");
      out.write("                                    luctus, lacus ut laoreet tincidunt, lacus diam eleifend ante, ut rutrum nulla\n");
      out.write("                                    enim eu erat. Sed sed nibh vitae ipsum porttitor pharetra eget eu velit. Nulla\n");
      out.write("                                    feugiat sed diam eu dignissim. Donec ipsum quam, sodales non felis id, condimentum\n");
      out.write("                                    placerat erat. Phasellus sit amet urna eget tortor consequat tristique.</p>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                            <div id=\"Vision\">\n");
      out.write("                                <h2 class=\"a\">Visión</h2>\n");
      out.write("                                <p class=\"a\">Sed tincidunt euismod magna a varius. Sed maximus nec nunc ac ultricies.\n");
      out.write("                                    Suspendisse ante arcu, placerat eu vehicula sit amet, elementum eu nisi.\n");
      out.write("                                    Morbi quis laoreet felis. Integer massa velit, bibendum a risus at, rutrum\n");
      out.write("                                    scelerisque sapien. Quisque risus mauris, eleifend id massa ut,\n");
      out.write("                                    vulputate dignissim ante. Suspendisse accumsan nibh et porttitor placerat.\n");
      out.write("                                    Nullam ultricies eleifend massa sed rutrum. In consectetur, nisi at ultrices volutpat,\n");
      out.write("                                    nisl mauris ullamcorper sem, quis viverra diam libero quis sapien. Nulla eget arcu sit\n");
      out.write("                                    amet diam placerat semper in quis est. Etiam vel tristique risus. Etiam volutpat auctor\n");
      out.write("                                    lectus, eu iaculis metus posuere in. Donec posuere magna ac risus aliquam sollicitudin.\n");
      out.write("                                    Suspendisse iaculis molestie ligula vel fringilla. Suspendisse non ultricies orci.\n");
      out.write("                                    Nullam libero purus, mattis vitae hendrerit vitae, consectetur vitae lacus.</p>\n");
      out.write("\n");
      out.write("                                <p class=\"a\">Suspendisse id quam enim. Vestibulum orci felis, tincidunt nec semper vitae, pharetra\n");
      out.write("                                    ut mauris. Nunc in est mi. Nunc ut ex eget erat elementum tincidunt elementum at velit.\n");
      out.write("                                    Sed rutrum non diam vitae vehicula. Nam sed varius velit. Integer at leo neque.\n");
      out.write("                                    Nulla at volutpat ligula. Donec tristique, libero in imperdiet volutpat, urna nibh dapibus\n");
      out.write("                                    lacus, eget interdum diam orci sed magna. Morbi ultrices, leo ut rhoncus suscipit, orci\n");
      out.write("                                    risus placerat nisl, eget euismod sapien justo et urna. Sed ac lacus metus. Pellentesque\n");
      out.write("                                    habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.\n");
      out.write("                                    Quisque nec massa quis arcu fringilla maximus.</p>\n");
      out.write("                            </div>\n");
      out.write("                        </article>\n");
      out.write("                    </div>\n");
      out.write("                </section>\n");
      out.write("\n");
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
      out.write("                            \n");
      out.write("                            \n");
      out.write("                            \n");
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
