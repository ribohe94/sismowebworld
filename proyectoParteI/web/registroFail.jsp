<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <title>Inicio</title>
        <script type="text/javascript" src="js/AJAX.js"></script>
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
                    <div class="links_nav"><a href="index.jsp"><p>Inicio</p></a></div>
                    <div class="links_nav"><a href="registro.jsp"><p>Registro</p></a></div>
                    <div><a href="login.jsp"><p>Ingreso</p></a></div>
                </section>
                <div id="noticias">
                    <table>
                        <tr>
                            <td><button id="previous" class="btn"><</button></td>
                            <td style="width: 100%; text-align: center"><h2>Noticias</h2></td>
                            <td><button id="next" class="btn">></button></td>
                        </tr>
                    </table>
                    <table>
                        <tr>
                            <td><div id="tituloNoticia"></div></td>
                        </tr>
                        <tr>
                            <td><div id="fechaNoticia"></div></td>
                        </tr>
                        <tr>
                            <td><div id="contNoticia"></div></td>
                        </tr>
                    </table>
                </div>
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
            <footer style="text-align: center;">Creado por Riccardo Bove y Wilberth Sánchez</footer>
        </div>
    </body>
</html>
