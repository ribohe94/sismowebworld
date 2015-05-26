<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelodatos.ModeloDatos" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/scripts.js"></script>    
        <script src="http://maps.google.com/maps/api/js?sensor=false"></script>  
        <script type="text/javascript" src="http://api.geonames.org/export/jsr_class.js"></script>
        <title>Inicio</title>
        <link rel="stylesheet" type="text/css" href="default.css" />
    </head>
    <body>
        <div id="wrapper">
            <header>
                <section id="encabezado">
                    <h1>
                        <a href="index.jsp">
                            <p id="pEncabezado"><img src="images/Captura de pantalla de 2015-05-16 11_23_46.png" id="img_logo"/></p>
                            <p id="pEncabezado">SISMO WEB WORLD</p>
                        </a>
                    </h1>
                </section>
            </header>

            <div id="contents">
                <section>
                    <form action="ServletControlC" method="GET" id="formularioNoticia">
                        <input type="submit" form="formularioNoticia"/>
                    </form>
                </section>
                <section id="navegacion">
                    <article class="menu_iz">
                        <li><a href="index.jsp"><p>INICIO</p></a></li>
                    </article>
                    <article class="menu_iz">
                        <li><a href="registro.jsp"><p>REGISTRO</p></a></li>
                    </article>
                    <article class="menu_iz">
                        <li><a href="login.jsp"><p>INGRESO</p></a></li>
                    </article>
                    <article class="menu_iz">
                        <li><a href="mapa.jsp"><p>MAPA</p></a></li>
                    </article>
                </section>

                <section id="info">
                    <div id="c_info">
                        <article>
                            <div id="Mision">
                                <h2 class="a">Misión</h2>
                                <p class="a">Lorem ipsum dolor sit amet, consectetur adipiscing elit. Praesent ac 
                                    lacus sapien. Quisque eu tincidunt sem. Proin quis lacus vel dui euismod 
                                    pellentesque. Nullam tincidunt auctor tellus, non rhoncus risus. Maecenas
                                    luctus, lacus ut laoreet tincidunt, lacus diam eleifend ante, ut rutrum nulla
                                    enim eu erat. Sed sed nibh vitae ipsum porttitor pharetra eget eu velit. Nulla
                                    feugiat sed diam eu dignissim. Donec ipsum quam, sodales non felis id, condimentum
                                    placerat erat. Phasellus sit amet urna eget tortor consequat tristique.</p>
                            </div>

                            <div id="Vision">
                                <h2 class="a">Visión</h2>
                                <p class="a">Sed tincidunt euismod magna a varius. Sed maximus nec nunc ac ultricies.
                                    Suspendisse ante arcu, placerat eu vehicula sit amet, elementum eu nisi.
                                    Morbi quis laoreet felis. Integer massa velit, bibendum a risus at, rutrum
                                    scelerisque sapien. Quisque risus mauris, eleifend id massa ut,
                                    vulputate dignissim ante. Suspendisse accumsan nibh et porttitor placerat.
                                    Nullam ultricies eleifend massa sed rutrum. In consectetur, nisi at ultrices volutpat,
                                    nisl mauris ullamcorper sem, quis viverra diam libero quis sapien. Nulla eget arcu sit
                                    amet diam placerat semper in quis est. Etiam vel tristique risus. Etiam volutpat auctor
                                    lectus, eu iaculis metus posuere in. Donec posuere magna ac risus aliquam sollicitudin.
                                    Suspendisse iaculis molestie ligula vel fringilla. Suspendisse non ultricies orci.
                                    Nullam libero purus, mattis vitae hendrerit vitae, consectetur vitae lacus.</p>

                                <p class="a">Suspendisse id quam enim. Vestibulum orci felis, tincidunt nec semper vitae, pharetra
                                    ut mauris. Nunc in est mi. Nunc ut ex eget erat elementum tincidunt elementum at velit.
                                    Sed rutrum non diam vitae vehicula. Nam sed varius velit. Integer at leo neque.
                                    Nulla at volutpat ligula. Donec tristique, libero in imperdiet volutpat, urna nibh dapibus
                                    lacus, eget interdum diam orci sed magna. Morbi ultrices, leo ut rhoncus suscipit, orci
                                    risus placerat nisl, eget euismod sapien justo et urna. Sed ac lacus metus. Pellentesque
                                    habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas.
                                    Quisque nec massa quis arcu fringilla maximus.</p>
                            </div>
                        </article>
                    </div>
                </section>
                <section id="noticias">
                    <h2>Noticias</h2>
                    <span>
                        <%
                            ModeloDatos md = ModeloDatos.obtenerInstancia();
//                            for (int i = 0; i < md.getNoticias().getCantidad(); i++) {
//                                out.println(md.getNoticias().getNoticiaPosicion(i).toString());
//                            }
                        %>
                        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
                        <script>
                            $(document).ready(function () {
                                var x = 0;
                                // When the HTML DOM is ready loading, then execute the following function...
                                $('#next').click(function () {               // Locate HTML DOM element with ID "somebutton" and assign the following function to its "click" event...
                                    $.get('ServletControlC', {id: 0, id2: 1}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                        $('#tituloNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                        $.get('ServletControlC', {id: 1, id2: 1}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                            $('#fechaNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                            $.get('ServletControlC', {id: 2, id2: 1}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                                $('#contNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                            });
                                        });
                                    });
                                });
                                $('#previous').click(function () {               // Locate HTML DOM element with ID "somebutton" and assign the following function to its "click" event...
                                    $.get('ServletControlC', {id: 0, id2: 0}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                        $('#tituloNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                        $.get('ServletControlC', {id: 1, id2: 0}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                            $('#fechaNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                            $.get('ServletControlC', {id: 2, id2: 0}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                                $('#contNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                            });
                                        });
                                    });
                                });
                            });
                        </script>
                        <div id="tituloNoticia"></div>
                        <div id="fechaNoticia"></div>
                        <div id="contNoticia"></div>
                        <button id="previous">previous</button>
                        <button id="next">next</button>
                    </span>
                </section>

            </div>
            <footer></footer>
        </div>
    </body>
</html>
