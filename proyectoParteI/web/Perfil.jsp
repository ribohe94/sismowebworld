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
            <section id="navegacion">
                <article>
                    <li><a href="indexVisitantes.jsp"><p>INICIO</p></a></li>
                </article>
                <article>
                    <li><a href="Perfil.jsp"><p>Perfil</p></a></li>
                </article>
                <article>
                    <li><a href="mapaVisitantes.jsp"><p>MAPA</p></a></li>
                </article>
                <article>
                    <li><a href="index.jsp"><p>SALIR</p></a></li>
                </article>
            </section>

            <table id="tabla_info">
                <section>
                    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
                    <script>
                        $(document).ready(function () {
                            // When the HTML DOM is ready loading, then execute the following function...
                            // Locate HTML DOM element with ID "somebutton" and assign the following function to its "click" event...
                            $.get('ServletControlB', {id: 0}, function (responseText) {
                                $('#divnombre').text(responseText);
                                $.get('ServletControlB', {id: 1}, function (responseText) {
                                    $('#divapellido1').text(responseText);
                                    $.get('ServletControlB', {id: 2}, function (responseText) {
                                        $('#divapellido2').text(responseText);
                                        $.get('ServletControlB', {id: 3}, function (responseText) {
                                            $('#divemail').text(responseText);
                                            $.get('ServletControlB', {id: 4}, function (responseText) {
                                                $('#divnacimiento').text(responseText);
                                            });
                                        });
                                    });
                                });
                            });

                        });
                    </script>
                </section>
                <tr>
                    <td>Nombre: </td><td id="divnombre"></td>
                </tr>
                <tr>
                    <td>Primer apellido: </td><td id="divapellido1"></td>
                </tr>
                <tr>
                    <td>Segundo apellido: </td><td id="divapellido2"></td>
                </tr>
                <tr>
                    <td>Email: </td><td id="divemail"></td>
                </tr>
                <tr>
                    <td>Fecha de nacimiento: </td><td id="divnacimiento"></td>
                </tr>
            </table>

            <footer></footer>
        </div>
    </body>
</html>
