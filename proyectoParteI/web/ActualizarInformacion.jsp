<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
            <script src="http://code.jquery.com/jquery-latest.min.js"></script>
            <script>
                $(document).ready(function () {
                    $.ajaxSetup({async: false});
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

                    $('#enviarNoticia').click(function () {
                        $.get('ServletControlC', {id: 3, valort: document.getElementById("inputTitulo").value, valorf: document.getElementById("inputFecha").value, valorc: document.getElementById("inputCont").value}, function (responseText) {
                            document.getElementById("inputTitulo").setAttribute("value", "");
                            document.getElementById("inputFecha").setAttribute("value", "");
                            document.getElementById("inputCont").setAttribute("value", "");
                            $('#resultado').text("Noticia Agregada");
                        });
                    });

                });
            </script>
            <div id="contents">

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

                <div>
                    <section id="noticias">
                        <h2>Noticias</h2>
                        <span>

                            <div id="tituloNoticia"></div>
                            <div id="fechaNoticia"></div>
                            <div id="contNoticia"></div>
                            <button id="previous">previous</button>
                            <button id="next">next</button>
                        </span>
                    </section>
                    <table id="tabla_noticias">
                        <tr>
                            <td>Ingrese la información de la nueva noticia</td>
                        </tr>
                        <tr>
                            <td>Titulo: </td><td><input id="inputTitulo" type="text"/></td>
                        </tr>
                        <tr>
                            <td>Fecha: </td><td><input id="inputFecha" type="date"/></td>
                        </tr>
                        <tr>
                            <td>Contenido: </td><td><textarea rows="8" cols="70" id="inputCont"></textarea></td>
                        </tr>
                        <tr>
                            <td><button id="enviarNoticia">Enviar</button></td><td id="resultado"></td>
                        </tr>
                    </table>

                </div>

            </div>
            <footer></footer>
        </div>
    </body>
</html>
