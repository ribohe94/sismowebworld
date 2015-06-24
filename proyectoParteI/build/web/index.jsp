<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelodatos.ModeloDatos" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script type="text/javascript" src="js/scripts.js"></script>    
        <script type="text/ajax" src="js/AJAX.js"></script>    
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
                </section>

                <section id="info">
                    <div id="c_info">
                        <article>
                            <div id="Mision">
                                <h2 class="a">Misión</h2>
                                <p class="a">Ejecutar y promover, permanentemente, investigaciones y estudios sismológicos destinados a atender la demanda de seguridad en la población ante la amenaza sísmica en el territorio nacional, la formación de personal especializado y divulgar los nuevos conocimientos de las ciencias. </p>
                            </div>

                            <div id="Vision">
                                <h2 class="a">Visión</h2>
                                <p class="a">Ser una organización de excelencia en el área de protección a la colectividad frente a la amenaza sísmica, de referencia nacional e internacional, distinguida por su capacidad de servicio, la calidad de su investigación y su desarrollo técnico y científico.</p>
                            </div>
                        </article>
                    </div>
                </section>
                <section id="noticias" onload="cargarNoticias()">
                    <h2>Noticias</h2>

                    <div id="tituloNoticia"></div>
                    <div id="fechaNoticia"></div>
                    <div id="contNoticia"></div>
                    <button id="previous">previous</button>
                    <button id="next">next</button>
                </section>
            </div>
            <footer></footer>
        </div>
    </body>
</html>
