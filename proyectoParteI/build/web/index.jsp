<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="servletb" class="servicios.ServletControlB" scope="session"></jsp:useBean>
    <!DOCTYPE html>
    <html>
        <head>
            <script src="http://code.jquery.com/jquery-latest.min.js"></script>     
            <script type="text/javascript" src="js/scripts.js"></script> 
            <script type="text/javascript" src="js/AJAX.js"></script>  
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
                <div id="contents">
                    <div id="datosSesion" onload="cargarDatosSesion()"></div>
                    <div id="datosSesion1" onload="cargarDatosSesion()"></div>
                    <input id="user" type="hidden" value="${sessionScope.usuario}">

                <section id="navegacion">
                </section>

                <script>
                    if (document.getElementById("user").value !== "") {
                        document.getElementById("datosSesion").innerHTML = document.getElementById("user").value + " | <a href=\"ServletCerrarSesion\">Cerrar sesion</a>";
                        document.getElementById("navegacion").innerHTML = "<div class=\"links_nav\"><a href=\"index.jsp\"><p>Inicio</p></a></div>" +
                                "<div class=\"links_nav\"><a href=\"Perfil.jsp\"><p>Perfil</p></a></div>" +
                                "<div><a href=\"mapa.jsp\"><p>Mapa</p></a></div>";
                    } else {
                        document.getElementById("navegacion").innerHTML = "<div class=\"links_nav\"><a href=\"index.jsp\"><p>Inicio</p></a></div>" +
                                "<div class=\"links_nav\"><a href=\"registro.jsp\"><p>Registro</p></a></div>" +
                                "<div><a href=\"login.jsp\"><p>Ingreso</p></a></div>";
                    }
                </script>

                <section id="info">
                    <div id="c_info">
                        <article>
                            <div id="Mision">
                                <h2 class="a">Misión</h2>
                                <p class="a">Ejecutar y promover, permanentemente, investigaciones y estudios sismológicos destinados a atender la demanda de seguridad en la población ante la amenaza sísmica en el territorio nacional, la formación de personal especializado y divulgar los nuevos conocimientos de las ciencias. </p>
                            </div>

                            <div id="Vision">
                                <h2 class="a">Visión</h2>
                                <p class="a">Ser una organización de excelencia en el área de protección a la colectividad frente a la amenaza sísmica, de referencia nacional e internacional, distinguida por su capacidad de servicio, la calidad de su investigación y su desarrollo técnico y científico.</p>
                            </div>
                        </article>
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
