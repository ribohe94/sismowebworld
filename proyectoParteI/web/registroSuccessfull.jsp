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

                <section id="success">
                    <h1 id="r_bienvenido">Bienvenid@</h1>
                    <p id="r_saludo">Usted se ha registrado Correctamente</br>
                        vaya a la <a href="index.jsp">Pagina principal</a> de Sismo Web World e inicie sesión</p>
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
