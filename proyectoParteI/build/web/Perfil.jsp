<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelodatos.ModeloDatos" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
        <script type="text/javascript" src="https://www.google.com/jsapi"></script>
        <script src="//code.jquery.com/jquery-1.10.2.js"></script>
        <script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
        <script type="text/javascript" src="js/scripts.js"></script>    
        <script type="text/javascript" src="js/AJAX.js"></script>    
        <script>
            $(function () {
                $("#tabs").tabs();
            });
        </script>
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
                <div id="datosSesion" onload="cargarDatosSesion()"></div>
                <input id="user" type="hidden" value="${sessionScope.usuario}">
                <script>
                    if (document.getElementById("user").value !== "") {
                        document.getElementById("datosSesion").innerHTML = document.getElementById("user").value + " | <a href=\"ServletCerrarSesion\">Cerrar sesion</a>";
                    }
                </script>
            </header>
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
            <div id="tabs">

                <ul>
                    <li><a href="#tabs-1">Perfil</a></li>
                    <li><a href="#tabs-2">Modificar usuario</a></li>
                    <li><a href="#tabs-3">Gráfico de ingresos</a></li>
                </ul>

                <div id="tabs-1">
                    <table id="tabla_info">
                        <tr>
                            <td>Nombre: </td><td id="divnombre"></td><td><button id="btnModNom">Modificar</button></td><td><button id="btnSavNom" disabled>Guardar</button></td>
                        </tr>
                        <tr>
                            <td>Primer apellido: </td><td id="divapellido1"></td><td><button id="btnModApe1">Modificar</button></td><td><button id="btnSavApe1" disabled>Guardar</button></td>
                        </tr>
                        <tr>
                            <td>Segundo apellido: </td><td id="divapellido2"></td><td><button id="btnModApe2">Modificar</button></td><td><button id="btnSavApe2" disabled>Guardar</button></td>
                        </tr>
                        <tr>
                            <td>Email: </td><td id="divemail"></td>
                        </tr>
                        <tr>
                            <td>Fecha de nacimiento: </td><td id="divnacimiento"></td><td><button id="btnModNac">Modificar</button></td><td><button id="btnSavNac" disabled>Guardar</button></td>
                        </tr>
                        <tr>
                            <td>Es administrador: </td><td id="divnadmin"></td>
                        </tr>
                        <tr>
                        </tr>
                    </table>
                </div>
                <div id="tabs-2">
                    <table id="tablaUsuarios">
                        <tr>
                            <td>Ingrese el correo del usuario que desea modificar: </td> <td><input id="usuarioemail" type="text"/></td> <td><button id="buscarUsuario">Enviar</button></td>
                        </tr>
                        <tr>
                            <td>Nombre: </td><td id="divnombreuser"></td><td><button id="btnModNomuser">Modificar</button></td><td><button id="btnSavNomuser" disabled>Guardar</button></td>
                        </tr>
                        <tr>
                            <td>Primer apellido: </td><td id="divapellido1user"></td><td><button id="btnModApe1user">Modificar</button></td><td><button id="btnSavApe1user" disabled>Guardar</button></td>
                        </tr>
                        <tr>
                            <td>Segundo apellido: </td><td id="divapellido2user"></td><td><button id="btnModApe2user">Modificar</button></td><td><button id="btnSavApe2user" disabled>Guardar</button></td>
                        </tr>
                        <tr>
                            <td>Email: </td><td id="divemailuser"></td>
                        </tr>
                        <tr>
                            <td>Fecha de nacimiento: </td><td id="divnacimientouser"></td><td><button id="btnModNacuser">Modificar</button></td><td><button id="btnSavNacuser" disabled>Guardar</button></td>
                        </tr>
                        <tr>
                            <td>Es administrador: </td><td id="divnadminuser"></td>
                        </tr>
                        <tr>
                            <td id="divNoticias"><a href="ActualizarInformacion.jsp">Agregar Noticias</a></td>
                        </tr>
                    </table>
                    <div id="mensaje_usuario"></div>
                </div>
                <div id="tabs-3">
                    <div id="chart_div" onload="drawChart()">(Permita algunos segundos para cargar la información)</div>
                    <script>
                        drawChart();
                    </script>
                </div>
            </div>
            <footer style="text-align: center;">Creado por Riccardo Bove y Wilberth Sánchez</footer>
        </div>
    </body>
</html>