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

                <section id="seccionRegistro">
                    <form id="formularioRegistro" name="userform" action="ServletControl" method="GET" onsubmit="return verificar();">
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
                                <td>Es administrador:</td> 
                                <td><input id="radiosi" name="isAdmin" value="isAdminY" type="radio" form="formularioRegistro" required>Si
                                    <input id="radiono" name="isAdmin" value="isAdminN" type="radio" form="formularioRegistro" required checked="true">No</td>

                            </tr>
                            <tr>
                                <td>Contraseña:</td> 
                                <td><input id="password" name="password" type="password" placeholder="Ingrese su contraseña" 
                                           form="formularioRegistro" required onkeyup="check_password(document.forms.userform.password.value)">
                                </td>
                                <td>
                                    <!-- pwd_bar is where the colored strength bar appears -->
                                    <div id="pwd_bar"></div>

                                    <!-- pwd_meter is where the strength word appears, like "weak" -->
                                    <span id="pwd_meter"></span>

                                    <!-- pwd_log is the section that debug information appears if you set DEBUG=1 above -->
                                    <span id="pwd_log"></span>
                                </td>
                            </tr>
                            <tr>
                                <td>Confirme Contraseña:</td> 
                                <td><input id="confirma" type="password" name="passwd1" placeholder="Confirme su contraseña" form="formularioRegistro" required></td>
                            </tr>
                            <tr>
                                <td colspan="2" align="center">
                                    <input id="pwdStrength" type="hidden" name="pwdStrength" value="0">
                                    <input type="submit" value="Submit">
                                </td>
                            </tr>
                            <tr>
                                <td colspan="2"><input type="submit" value="Aceptar" form="formularioRegistro"></td>
                            </tr>
                        </table>
                    </form>
                </section>

            </div>
            <footer></footer>
        </div>
    </body>
</html>
