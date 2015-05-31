<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelodatos.ModeloDatos" %>
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
                <section>
                    <form action="ServletControlC" method="GET" id="formularioNoticia">
                        <input type="submit" form="formularioNoticia"/>
                    </form>
                </section>
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
                </section>

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
                <section id="noticias">
                    <h2>Noticias</h2>
                    <span>
                        <%
                            ModeloDatos md = ModeloDatos.obtenerInstancia();
//                            out.println(String.valueOf(md.getCantPaises()));
//                            out.println(String.valueOf(md.getNombrePaises().get(0)));
                        %>
                        <!--Script AJAX--> 
                        <script src="http://code.jquery.com/jquery-latest.min.js"></script>
                        <script>
                            $(document).ready(function () {
                                var x = 0;
                                // When the HTML DOM is ready loading, then execute the following function...
                                $('#next').click(function () {               // Locate HTML DOM element with ID "somebutton" and assign the following function to its "click" event...
                                    $.get('ServletControlC', {id: 0, id2: 1}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                        $('#tituloNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                        $.get('ServletControlC', {id: 1, id2: 1}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                            $('#fechaNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                            $.get('ServletControlC', {id: 2, id2: 1}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                                $('#contNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                            });
                                        });
                                    });
                                });
                                $('#previous').click(function () {               // Locate HTML DOM element with ID "somebutton" and assign the following function to its "click" event...
                                    $.get('ServletControlC', {id: 0, id2: 0}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                        $('#tituloNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                        $.get('ServletControlC', {id: 1, id2: 0}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                            $('#fechaNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                            $.get('ServletControlC', {id: 2, id2: 0}, function (responseText) { // Execute Ajax GET request on URL of "someservlet" and execute the following function with Ajax response text...
                                                $('#contNoticia').text(responseText);         // Locate HTML DOM element with ID "somediv" and set its text content with the response text.
                                            });
                                        });
                                    });
                                });
                            });
                        </script>
                        <div id="tituloNoticia"></div>
                        <div id="fechaNoticia"></div>
                        <div id="contNoticia"></div>
                        <button id="previous">previous</button>
                        <button id="next">next</button>
                    </span>
                </section>

                <section id="Graph">
                    <script type="text/javascript" src="https://www.google.com/jsapi"></script>
                    <script type="text/javascript">
                            // Load the Visualization API and the piechart package.
                            google.load('visualization', '1.0', {'packages': ['corechart']});

                            // Set a callback to run when the Google Visualization API is loaded.
                            google.setOnLoadCallback(drawChart);
                            // Callback that creates and populates a data table,
                            // instantiates the pie chart, passes in the data and
                            // draws it.
                            function drawChart() {
                                arrayNomPais = [];
                                arrayCantPais = [];

                                $(document).ready(function () {
                                    $.ajaxSetup({async: false});
                                    $.get('ServletControlB', {id: 26}, function (responseText) {
                                        cantPais = parseInt(responseText);
                                    });
                                    for (var i = 0; i < cantPais; i++) {
                                        $.get('ServletControlB', {id: 27, posPais: cantPais}, function (responseText) {
                                            arrayNomPais.push(responseText);
                                        });
                                        $.get('ServletControlB', {id: 28, nombrePais: arrayNomPais[i]}, function (responseText) {
                                            arrayCantPais.push(responseText);
                                        });
                                    }
                                });

                                document.getElementById("contNoticia").innerHTML += arrayNomPais[0];
                                document.getElementById("contNoticia").innerHTML += arrayCantPais[0];

                                // Create the data table.
                                var data = new google.visualization.DataTable();
                                data.addColumn('string', 'Pais');
                                data.addColumn('number', 'Ingresos');
                                data.addRows([
                                    ["Italia", parseInt(arrayCantPais[0])]
                                ]);

                                // Set chart options
                                var options = {'title': 'Porcentaje de ingresos por país',
                                    'width': 400,
                                    'height': 300};

                                // Instantiate and draw our chart, passing in some options.
                                var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
                                chart.draw(data, options);
                            }

                    </script>
                    <div id="chart_div" onload="drawChart()">

                    </div>
                </section>

            </div>
            <footer></footer>
        </div>
    </body>
</html>
