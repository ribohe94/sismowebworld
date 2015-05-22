<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script type="text/javascript" src="js/scripts.js"></script>    
        <script src="http://maps.google.com/maps/api/js?sensor=false"></script>  
        <script type="text/javascript" src="http://api.geonames.org/export/jsr_class.js"></script>
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
            </div>
            
            <table id="tabla_info">
                <tr>
                    <td>Nombre:</td>
                </tr>
                <tr>
                    <td>Primer apellido:</td>
                </tr>
                <tr>
                    <td>Segundo apellido</td>
                </tr>
                <tr>
                    <td>Email:</td>
                </tr>
                <tr>
                    <td>Telefono</td>
                </tr>
                <tr>
                    <td>Fecha de nacimiento: </td>
                </tr>
            </table>
            
            <footer></footer>
        </div>
    </body>
</html>
