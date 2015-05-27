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
