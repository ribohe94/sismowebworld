<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <title>Inicio</title>
        <script type="text/javascript" src="js/AJAX.js"></script>    
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
            <div id="contents">
                <div id="datosSesion" onload="cargarDatosSesion()"></div>
                <input id="user" type="hidden" value="${sessionScope.usuario}">
                <script>
                    if (document.getElementById("user").value !== "") {
                        document.getElementById("datosSesion").innerHTML = document.getElementById("user").value + " | <a href=\"ServletCerrarSesion\">Cerrar sesion</a>";
                    }
                </script>

                <section id="navegacion">
                    <div class="links_nav"><a href="index.jsp"><p>Inicio</p></a></div>
                    <div class="links_nav"><a href="Perfil.jsp"><p>Perfil</p></a></div>
                    <div><a href="mapa.jsp"><p>Mapa</p></a></div>
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

                <div>
                    <table id="tabla_noticias">
                        <tr>
                            <td>Ingrese la información de la nueva noticia</td>
                        </tr>
                        <tr>
                            <td>Titulo: </td><td><input id="inputTitulo" type="text"/></td>
                        </tr>
                        <tr>
                            <td>Fecha: </td><td><input id="inputFecha" type="date"/> Hora: <input id="inputHora" type="time"></td>
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
            <footer style="text-align: center;">Creado por Riccardo Bove y Wilberth Sánchez</footer>
        </div>
    </body>
</html>
