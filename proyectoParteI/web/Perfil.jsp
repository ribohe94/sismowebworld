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
                <section>
                    <script src="http://code.jquery.com/jquery-latest.min.js"></script>
                    <script>
                        $(document).ready(function () {
                            $.ajaxSetup({async: false});
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
                                                $.get('ServletControlB', {id: 10}, function (responseText) {
                                                    $('#divnadmin').text(responseText);
                                                });
                                            });
                                        });
                                    });
                                });
                            });

                            //Modificamos que hace el boton modificar cuando se presiona
                            $('#btnModNom').click(function () {
                                $('#divnombre').text("");
                                $('#divnombre').append("<input type=\"text\" id=\"inputNom\"></input>");
                                document.getElementById("btnSavNom").disabled = false;
                            });
                            $('#btnModApe1').click(function () {
                                $('#divapellido1').text("");
                                $('#divapellido1').append("<input type=\"text\" id=\"inputApe1\"></input>");
                                document.getElementById("btnSavApe1").disabled = false;
                            });
                            $('#btnModApe2').click(function () {
                                $('#divapellido2').text("");
                                $('#divapellido2').append("<input type=\"text\" id=\"inputApe2\"></input>");
                                document.getElementById("btnSavApe2").disabled = false;
                            });
                            $('#btnModEmail').click(function () {
                                $('#divemail').text("");
                                $('#divemail').append("<input type=\"text\" id=\"inputEmail\"></input>");
                                document.getElementById("btnSavEmail").disabled = false;
                            });
                            $('#btnModNac').click(function () {
                                $('#divnacimiento').text("");
                                $('#divnacimiento').append("<input type=\"date\" id=\"inputNac\"></input>");
                                document.getElementById("btnSavNac").disabled = false;
                            });

                            //Modificamos que hace el boton guardar cuando se presiona
                            $('#btnSavNom').click(function () {
                                $.get('ServletControlB', {id: 5, name: document.getElementById("inputNom").value}, function (responseText) {
                                    $('#divnombre').text(responseText);
                                    document.getElementById("btnSavNom").disabled = true;
                                });
                                document.getElementById("inputNom").removedNode();
                            });
                            $('#btnSavApe1').click(function () {
                                $.get('ServletControlB', {id: 6, ape1: document.getElementById("inputApe1").value}, function (responseText) {
                                    $('#divapellido1').text(responseText);
                                    document.getElementById("btnSavApe1").disabled = true;
                                });
                                document.getElementById("inputApe1").removedNode();
                            });
                            $('#btnSavApe2').click(function () {
                                $.get('ServletControlB', {id: 7, ape2: document.getElementById("inputApe2").value}, function (responseText) {
                                    $('#divapellido2').text(responseText);
                                    document.getElementById("btnSavApe2").disabled = true;
                                });
                                document.getElementById("inputApe2").removedNode();
                            });
                            $('#btnSavEmail').click(function () {
                                $.get('ServletControlB', {id: 8, email: document.getElementById("inputEmail").value}, function (responseText) {
                                    $('#divemail').text(responseText);
                                    document.getElementById("btnSavEmail").disabled = true;
                                });
                                document.getElementById("inputEmail").removedNode();
                            });
                            $('#btnSavNac').click(function () {
                                $.get('ServletControlB', {id: 9, nac: document.getElementById("inputNac").value}, function (responseText) {
                                    $('#divnacimiento').text(responseText);
                                    document.getElementById("btnSavNac").disabled = true;
                                });
                                document.getElementById("inputNac").removedNode();
                            });
                            $.get('ServletControlB', {id: "admin"}, function (responseText01) {
                                admin = responseText01;
                            });

                            if (admin === "1") {

                                //Tabla de Usuarios
                                $('#buscarUsuario').click(function () {
                                    $.get('ServletControlB', {id: 14, email: document.getElementById("usuarioemail").value}, function (responseText01) {
                                        $('#divnombreuser').text(responseText01);
                                        $.get('ServletControlB', {id: 15, email: document.getElementById("usuarioemail").value}, function (responseText02) {
                                            $('#divapellido1user').text(responseText02);
                                            $.get('ServletControlB', {id: 16, email: document.getElementById("usuarioemail").value}, function (responseText03) {
                                                $('#divapellido2user').text(responseText03);
                                                $.get('ServletControlB', {id: 17, email: document.getElementById("usuarioemail").value}, function (responseText04) {
                                                    $('#divemailuser').text(responseText04);
                                                    $.get('ServletControlB', {id: 18, email: document.getElementById("usuarioemail").value}, function (responseText05) {
                                                        $('#divnacimientouser').text(responseText05);
                                                        $.get('ServletControlB', {id: 19, email: document.getElementById("usuarioemail").value}, function (responseText06) {
                                                            $('#divnadminuser').text(responseText06);
                                                        });
                                                    });
                                                });
                                            });
                                        });
                                    });
                                });

                                //Modificamos que hace el boton modificar cuando se presiona
                                $('#btnModNomuser').click(function () {
                                    $('#divnombreuser').text("");
                                    $('#divnombreuser').append("<input type=\"text\" id=\"inputNomuser\"></input>");
                                    document.getElementById("btnSavNomuser").disabled = false;
                                });
                                $('#btnModApe1user').click(function () {
                                    $('#divapellido1user').text("");
                                    $('#divapellido1user').append("<input type=\"text\" id=\"inputApe1user\"></input>");
                                    document.getElementById("btnSavApe1user").disabled = false;
                                });
                                $('#btnModApe2user').click(function () {
                                    $('#divapellido2user').text("");
                                    $('#divapellido2user').append("<input type=\"text\" id=\"inputApe2user\"></input>");
                                    document.getElementById("btnSavApe2user").disabled = false;
                                });
                                $('#btnModEmailuser').click(function () {
                                    $('#divemailuser').text("");
                                    $('#divemailuser').append("<input type=\"text\" id=\"inputEmailuser\"></input>");
                                    document.getElementById("btnSavEmailuser").disabled = false;
                                });
                                $('#btnModNacuser').click(function () {
                                    $('#divnacimientouser').text("");
                                    $('#divnacimientouser').append("<input type=\"date\" id=\"inputNacuser\"></input>");
                                    document.getElementById("btnSavNacuser").disabled = false;
                                });

                                //Modificamos que hace el boton guardar cuando se presiona
                                $('#btnSavNomuser').click(function () {
                                    $.get('ServletControlB', {id: 20, name: document.getElementById("inputNomuser").value, email: document.getElementById("usuarioemail").value}, function (responseText) {
                                        $('#divnombreuser').text(responseText);
                                        document.getElementById("btnSavNomuser").disabled = true;
                                    });
                                    document.getElementById("inputNomuser").removedNode();
                                });
                                $('#btnSavApe1user').click(function () {
                                    $.get('ServletControlB', {id: 21, ape1: document.getElementById("inputApe1user").value, email: document.getElementById("usuarioemail").value}, function (responseText) {
                                        $('#divapellido1user').text(responseText);
                                        document.getElementById("btnSavApe1user").disabled = true;
                                    });
                                    document.getElementById("inputApe1user").removedNode();
                                });
                                $('#btnSavApe2user').click(function () {
                                    $.get('ServletControlB', {id: 22, ape2: document.getElementById("inputApe2user").value, email: document.getElementById("usuarioemail").value}, function (responseText) {
                                        $('#divapellido2user').text(responseText);
                                        document.getElementById("btnSavApe2user").disabled = true;
                                    });
                                    document.getElementById("inputApe2user").removedNode();
                                });
                                $('#btnSavEmailuser').click(function () {
                                    $.get('ServletControlB', {id: 23, email: document.getElementById("inputEmailuser").value, email01: document.getElementById("usuarioemail").value}, function (responseText) {
                                        $('#divemailuser').text(responseText);
                                        document.getElementById("btnSavEmailuser").disabled = true;
                                    });
                                    document.getElementById("inputEmailuser").removedNode();
                                });
                                $('#btnSavNacuser').click(function () {
                                    $.get('ServletControlB', {id: 24, nac: document.getElementById("inputNacuser").value, email: document.getElementById("usuarioemail").value}, function (responseText) {
                                        $('#divnacimientouser').text(responseText);
                                        document.getElementById("btnSavNacuser").disabled = true;
                                    });
                                    document.getElementById("inputNacuser").removedNode();
                                });
                            } else {
                                document.getElementById("tablaUsuarios").innerHTML = "";
                            }
                        });
                    </script>
                </section>
                <tr>
                    <td>Nombre: </td><td id="divnombre"></td><td><button id="btnModNom">Modificar</button></td><td><button id="btnSavNom" disabled>Guardar</button></td>
                </tr>
                <tr>
                    <td>Primer apellido: </td><td id="divapellido1"></td><td><button id="btnModApe1">Modificar</button></td><td><button id="btnSavApe1" disabled>Guardar</button></td>
                </tr>
                <tr>
                    <td>Segundo apellido: </td><td id="divapellido2"></td><td><button id="btnModApe2">Modificar</button></td><td><button id="btnSavApe2" disabled>Guardar</button></td>
                </tr>
                <tr>
                    <td>Email: </td><td id="divemail"></td>
                </tr>
                <tr>
                    <td>Fecha de nacimiento: </td><td id="divnacimiento"></td><td><button id="btnModNac">Modificar</button></td><td><button id="btnSavNac" disabled>Guardar</button></td>
                </tr>
                <tr>
                    <td>Es administrador: </td><td id="divnadmin"></td>
                </tr>
                <tr>
                </tr>
            </table>
            <table id="tablaUsuarios">
                <tr>
                    <td>Ingrese el correo del usuario que desea modificar: </td> <td><input id="usuarioemail" type="text"/></td> <td><button id="buscarUsuario">Enviar</button></td>
                </tr>
                <tr>
                    <td>Nombre: </td><td id="divnombreuser"></td><td><button id="btnModNomuser">Modificar</button></td><td><button id="btnSavNomuser" disabled>Guardar</button></td>
                </tr>
                <tr>
                    <td>Primer apellido: </td><td id="divapellido1user"></td><td><button id="btnModApe1user">Modificar</button></td><td><button id="btnSavApe1user" disabled>Guardar</button></td>
                </tr>
                <tr>
                    <td>Segundo apellido: </td><td id="divapellido2user"></td><td><button id="btnModApe2user">Modificar</button></td><td><button id="btnSavApe2user" disabled>Guardar</button></td>
                </tr>
                <tr>
                    <td>Email: </td><td id="divemailuser"></td>
                </tr>
                <tr>
                    <td>Fecha de nacimiento: </td><td id="divnacimientouser"></td><td><button id="btnModNacuser">Modificar</button></td><td><button id="btnSavNacuser" disabled>Guardar</button></td>
                </tr>
                <tr>
                    <td>Es administrador: </td><td id="divnadminuser"></td>
                </tr>
                <tr>
                    <td id="divNoticias"><a href="ActualizarInformacion.jsp">Agregar Noticias</a></td>
                </tr>
            </table>
            <footer></footer>
        </div>
    </body>
</html>
