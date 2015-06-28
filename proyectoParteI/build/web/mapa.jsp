<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <title>Inicio</title>
        <link rel="stylesheet" type="text/css" href="default.css" />
        <script type="text/javascript" src="js/AJAX.js"></script>
        <script type="text/javascript" src="js/scripts.js"></script>    
        <script src="http://maps.google.com/maps/api/js?sensor=false"></script>  
        <script type="text/javascript" src="http://api.geonames.org/export/jsr_class.js"></script>
    </head>
    <body onload="cargarpaises();">
        <div id="wrapper">
            <header>
                <section id="encabezado">
                    <h1>
                        <a href="index.jsp">
                            <img src="images/Captura de pantalla de 2015-05-16 11_23_46.png" id="img_logo" alt="logo"/>
                        </a>
                        <a href="index.jsp">SISMO WEB WORLD</a>
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
                    <div class="links_nav"><a href="Perfil.jsp"><p>Inicio</p></a></div>
                    <div><a href="mapa.jsp"><p>Mapa</p></a></div>
                </section>

                <section id="mapa">
                    <div id="contents_mapa">
                        <div id="SBuscar">
                            <h3>Especifique una fecha y elija un Pais a consultar</h3>
                            <input id="fromDate" type="date" value="2015-05-21" >
                            <select id="SPais"></select>
                            <input type="button" onclick="Consulta();" value="enviar">
                        </div>

                        <div id="SMapa"></div>

                    </div>
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