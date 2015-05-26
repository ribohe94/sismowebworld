<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" type="text/css" href="default.css" />
        <script type="text/javascript" src="js/scripts.js"></script>    
        <script src="http://maps.google.com/maps/api/js?sensor=false"></script>  
        <script type="text/javascript" src="http://api.geonames.org/export/jsr_class.js"></script>
    </head>
    <body onload="getLocation2();">
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
            <!--            <div id="recolectorInfo">
                            <table>
                                <tr>
                                    <th colspan="3">Selección de pedido</th>
                                </tr>
                                <tr>
                                    <td>Fecha:</td>
            <%
                java.util.Calendar ahora = java.util.Calendar.getInstance();
                int anyo = ahora.get(java.util.Calendar.YEAR);
                int mes = ahora.get(java.util.Calendar.MONTH) + 1;
                int dia = ahora.get(java.util.Calendar.DAY_OF_MONTH);
                String sAhora = "";
                if (mes < 10) {
                    sAhora = anyo + "-0" + mes;
                } else {
                    sAhora = anyo + "-" + mes;
                }
                if (dia < 10) {
                    sAhora += "-0" + dia;
                } else {
                    sAhora += "-" + dia;
                }
            %>
            <td><input id="fechaBase" type="date" value="<%=sAhora%>" ></td>
            <td colspan="2"><input type="button" value="Consultar" onclick="localizar();"></td>
        </tr>
    </table>
</div>-->
            <div id="contents">

                <section id="navegacion">
                    <article>
                        <li><a href="indexVisitantes.jsp"><p>INICIO</p></a></li>
                    </article>
                    <article>
                        <li><a href="ActualizarInformacion.jsp"><p>ACTUALIZAR INFORMACION</p></a></li>
                    </article>
                    <article>
                        <li><a href="mapaVisitantes.jsp"><p>MAPA</p></a></li>
                    </article>
                    <article>
                        <li><a href="index.jsp"><p>SALIR</p></a></li>
                    </article>
                </section>

                <section id="mapa">
                    <div id="contents_mapa">
                        <section id="SBuscar">
                            <h3>Especifique una fecha</h3>
                            <input id="fromDate" type="date" value="2015-05-21" >
                            <input type="button" onclick="getLocation2()" value="enviar">
                        </section>

                        <section id="SMapa"></section>

                    </div>
                </section>

                <section id="noticias">
                    <h2>Noticias</h2>
                    <span>
                        Praesent varius massa eget ex tempus, vitae posuere enim tristique.
                        Nullam at ante lacinia, cursus nunc ut, dictum felis.
                        Donec tempus sed sem ac auctor. Integer a nisl diam. Cras sem mauris,
                        commodo non nulla eu, placerat mattis mi. Sed imperdiet fringilla rutrum.
                        Aliquam rutrum leo id felis placerat sollicitudin. Cum sociis natoque
                        penatibus et magnis dis parturient montes, nascetur ridiculus mus.
                        Sed ornare libero bibendum mi lacinia vulputate. In pretium vulputate
                        lorem, a mattis nisl porta eget. Aliquam finibus ipsum nunc,
                        nec imperdiet magna pellentesque quis. Aliquam venenatis quam ac
                        nunc auctor maximus. Fusce posuere velit sit amet convallis egestas.
                    </span>
                </section>
            </div>
            <footer></footer>
        </div>
    </body>
</html>
