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

            </div>
            <footer></footer>
        </div>
    </body>
</html>

