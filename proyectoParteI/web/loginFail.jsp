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
                    <div class="links_nav"><a href="login.jsp"><p>Ingreso</p></a></div>
                </section>

                <section id="login">
                    <h2 id="fail">El Correo y/o la Contraseña no son validos</br>Revise y vuelva a intentar</h2>
                    <form id="formularioLogin" method="GET" action="ServletControlB" onsubmit="return verificar2();"></form>
                    <table>
                        <tr>
                            <th colspan="2"><h2>Ingrese su e-mail y contraseña</h2></th>
                        </tr>

                        <tr>
                            <td>E-mail:</td>
                            <td><input id="emailLogin" name="emailLogin" type="email" placeholder="xxxx@xxx.com" form="formularioLogin" required></td>
                        </tr>
                        <tr>
                            <td>Contraseña:</td>
                            <td><input id="passwordLogin" name="passwordLogin" type="password" placeholder="contraseña" form="formularioLogin" required></td>
                        </tr>
                        <tr>
                            <td><input id="btnInput" name="bntInput" type="submit" value="Ingresar" form="formularioLogin"></td>
                        </tr>
                    </table>
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
            </div>
            <footer style="text-align: center;">Creado por Riccardo Bove y Wilberth Sánchez</footer>
        </div>
    </body>
</html>

