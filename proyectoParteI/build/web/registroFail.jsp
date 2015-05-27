<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inicio</title>
        <link rel="stylesheet" type="text/css" href="default.css" />
        <script type="text/javascript" src="js/scripts.js"></script>

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
                    <article>
                        <li><a href="index.jsp"><p>INICIO</p></a></li>
                    </article>
                    <article>
                        <li><a href="registro.jsp"><p>REGISTRO</p></a></li>
                    </article>
                    <article>
                        <li><a href="login.jsp"><p>INGRESO</p></a></li>
                    </article>
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
                <section id="seccionRegistro">
                    <h3 id="fail">Ocurrierón Errores al Procesar los datos Intentelo de Nuevo</br>
                        Si el error persiste intente utilizar otra cuenta de correo ya que</br>
                        puede que la cuenta que este utilizando ya fue registrada</h3>
                    <form id="formularioRegistro" action="ServletControl" method="GET" onsubmit="return verificar();"></form>
                    <table>
                        <tr><th colspan="2"><h2>Ingrese los datos Solicitados</h2></th></tr>
                        <tr>
                            <td>Nombre:</td> 
                            <td><input id="nombre" name="nombre" type="text" placeholder="Ingrese su nombre" form="formularioRegistro" required></td>
                        </tr>
                        <tr>
                            <td>Primer Apellido:</td> 
                            <td><input id="apellido1" name="apellido1" type="text" placeholder="Apellido 1" form="formularioRegistro" required></td>
                        </tr>
                        <tr>
                            <td>Segundo Apellido:</td> 
                            <td><input id="apellido2" name="apellido2" type="text" placeholder="Apellido 2" form="formularioRegistro" required></td>
                        </tr>
                        <tr>
                            <td>E-mail:</td> 
                            <td><input id="email" name="email" type="email" placeholder="xxx@xxx.xxx"form="formularioRegistro" required></td>
                        </tr>
                        <tr>
                            <td>Teléfono:</td> 
                            <td><input id="telefono" name="telefono" type="tel" placeholder="####-####" form="formularioRegistro" required></td>
                        </tr>
                        <tr>
                            <td>Fecha Nacimiento:</td> 
                            <td><input id="nacimiento" name="nacimiento" type="date" form="formularioRegistro" required></td>
                        </tr>
                        <tr>
                            <td>Contraseña:</td> 
                            <td><input id="password" name="password" type="password" placeholder="Ingrese su contraseña" form="formularioRegistro" required></td>
                        </tr>
                        <tr>
                            <td>Confirme Contraseña:</td> 
                            <td><input id="confirma" type="password" placeholder="Confirme su contraseña" form="formularioRegistro" required></td>
                        </tr>
                        <tr>
                            <td colspan="2"><input type="submit" value="Aceptar" form="formularioRegistro"></td>
                        </tr>
                    </table>
                </section>

            </div>
            <footer></footer>
        </div>
    </body>
</html>
