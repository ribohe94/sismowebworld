// <editor-fold defaultstate="collapsed" desc="Noticias">


//Carga la sección de noticias
$(document).ready(function () {
    $.ajaxSetup({async: false});
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

    //Botón para enviar y guardar noticias
    $('#enviarNoticia').click(function () {
        $.get('ServletControlC', {id: 3, valort: document.getElementById("inputTitulo").value, valorf: document.getElementById("inputFecha").value, valortime: document.getElementById("inputHora").value, valorc: document.getElementById("inputCont").value}, function (responseText) {
            document.getElementById("inputTitulo").setAttribute("value", "");
            document.getElementById("inputFecha").setAttribute("value", "");
            document.getElementById("inputCont").setAttribute("value", "");
            $('#resultado').text("Noticia Agregada");
        });
    });
});


// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Acciones de modificación de perfil">
$(document).ready(function () {
    $.ajaxSetup({async: false});
    // When the HTML DOM is ready loading, then execute the following function...
    // Locate HTML DOM element with ID "somebutton" and assign the following function to its "click" event...
    $.get('ServletControlB', {id: 0}, function (responseText) {
        $('#divnombre').text(responseText);
        $.get('ServletControlB', {id: 1}, function (responseText) {
            $('#divapellido1').text(responseText);
            $.get('ServletControlB', {id: 2}, function (responseText) {
                $('#divapellido2').text(responseText);
                $.get('ServletControlB', {id: 3}, function (responseText) {
                    $('#divemail').text(responseText);
                    $.get('ServletControlB', {id: 4}, function (responseText) {
                        $('#divnacimiento').text(responseText);
                        $.get('ServletControlB', {id: 10}, function (responseText) {
                            $('#divnadmin').text(responseText);
                        });
                    });
                });
            });
        });
    });

    //Modificamos que hace el boton modificar cuando se presiona
    $('#btnModNom').click(function () {
        $('#divnombre').text("");
        $('#divnombre').append("<input type=\"text\" id=\"inputNom\"></input>");
        document.getElementById("btnSavNom").disabled = false;
    });
    $('#btnModApe1').click(function () {
        $('#divapellido1').text("");
        $('#divapellido1').append("<input type=\"text\" id=\"inputApe1\"></input>");
        document.getElementById("btnSavApe1").disabled = false;
    });
    $('#btnModApe2').click(function () {
        $('#divapellido2').text("");
        $('#divapellido2').append("<input type=\"text\" id=\"inputApe2\"></input>");
        document.getElementById("btnSavApe2").disabled = false;
    });
    $('#btnModEmail').click(function () {
        $('#divemail').text("");
        $('#divemail').append("<input type=\"text\" id=\"inputEmail\"></input>");
        document.getElementById("btnSavEmail").disabled = false;
    });
    $('#btnModNac').click(function () {
        $('#divnacimiento').text("");
        $('#divnacimiento').append("<input type=\"date\" id=\"inputNac\"></input>");
        document.getElementById("btnSavNac").disabled = false;
    });

    //Modificamos que hace el boton guardar cuando se presiona
    $('#btnSavNom').click(function () {
        if (verificarNombre()) {
            $.get('ServletControlB', {id: 5, name: document.getElementById("inputNom").value}, function (responseText) {

                $('#divnombre').text(responseText);
                document.getElementById("btnSavNom").disabled = true;

            });
        }
    });
    $('#btnSavApe1').click(function () {
        if (verificarApe1()) {
            $.get('ServletControlB', {id: 6, ape1: document.getElementById("inputApe1").value}, function (responseText) {

                $('#divapellido1').text(responseText);
                document.getElementById("btnSavApe1").disabled = true;

            });
        }
    });
    $('#btnSavApe2').click(function () {
        if (verificarApe2()) {
            $.get('ServletControlB', {id: 7, ape2: document.getElementById("inputApe2").value}, function (responseText) {
                $('#divapellido2').text(responseText);
                document.getElementById("btnSavApe2").disabled = true;

            });
        }
    });
    $('#btnSavEmail').click(function () {
        $.get('ServletControlB', {id: 8, email: document.getElementById("inputEmail").value}, function (responseText) {
            $('#divemail').text(responseText);
            document.getElementById("btnSavEmail").disabled = true;
        });
    });
    $('#btnSavNac').click(function () {
        if (verificarFechaNac()) {
            $.get('ServletControlB', {id: 9, nac: document.getElementById("inputNac").value}, function (responseText) {
                $('#divnacimiento').text(responseText);
                document.getElementById("btnSavNac").disabled = true;

            });
        }
    });
    $.get('ServletControlB', {id: "admin"}, function (responseText01) {
        admin = responseText01;
    });

    if (admin === "1") {

        //Tabla de Usuarios
        $('#buscarUsuario').click(function () {
            $.get('ServletControlB', {id: 14, email: document.getElementById("usuarioemail").value}, function (responseText01) {
                $('#divnombreuser').text(responseText01);
                $.get('ServletControlB', {id: 15, email: document.getElementById("usuarioemail").value}, function (responseText02) {
                    $('#divapellido1user').text(responseText02);
                    $.get('ServletControlB', {id: 16, email: document.getElementById("usuarioemail").value}, function (responseText03) {
                        $('#divapellido2user').text(responseText03);
                        $.get('ServletControlB', {id: 17, email: document.getElementById("usuarioemail").value}, function (responseText04) {
                            $('#divemailuser').text(responseText04);
                            $.get('ServletControlB', {id: 18, email: document.getElementById("usuarioemail").value}, function (responseText05) {
                                $('#divnacimientouser').text(responseText05);
                                $.get('ServletControlB', {id: 19, email: document.getElementById("usuarioemail").value}, function (responseText06) {
                                    $('#divnadminuser').text(responseText06);
                                });
                            });
                        });
                    });
                });
            });
        });

        //Modificamos que hace el boton modificar cuando se presiona
        $('#btnModNomuser').click(function () {
            $('#divnombreuser').text("");
            $('#divnombreuser').append("<input type=\"text\" id=\"inputNomuser\"></input>");
            document.getElementById("btnSavNomuser").disabled = false;
        });
        $('#btnModApe1user').click(function () {
            $('#divapellido1user').text("");
            $('#divapellido1user').append("<input type=\"text\" id=\"inputApe1user\"></input>");
            document.getElementById("btnSavApe1user").disabled = false;
        });
        $('#btnModApe2user').click(function () {
            $('#divapellido2user').text("");
            $('#divapellido2user').append("<input type=\"text\" id=\"inputApe2user\"></input>");
            document.getElementById("btnSavApe2user").disabled = false;
        });
        $('#btnModEmailuser').click(function () {
            $('#divemailuser').text("");
            $('#divemailuser').append("<input type=\"text\" id=\"inputEmailuser\"></input>");
            document.getElementById("btnSavEmailuser").disabled = false;
        });
        $('#btnModNacuser').click(function () {
            $('#divnacimientouser').text("");
            $('#divnacimientouser').append("<input type=\"date\" id=\"inputNacuser\"></input>");
            document.getElementById("btnSavNacuser").disabled = false;
        });

        //Modificamos que hace el boton guardar cuando se presiona
        $('#btnSavNomuser').click(function () {
            if (verificarNombreUsuario()) {
                $.get('ServletControlB', {id: 20, name: document.getElementById("inputNomuser").value, email: document.getElementById("usuarioemail").value}, function (responseText) {
                    $('#divnombreuser').text(responseText);
                    document.getElementById("btnSavNomuser").disabled = true;
                });
            }
//                                        document.getElementById("inputNomuser").removedNode();
        });
        $('#btnSavApe1user').click(function () {
            if (verificarApe1Usuario()) {
                $.get('ServletControlB', {id: 21, ape1: document.getElementById("inputApe1user").value, email: document.getElementById("usuarioemail").value}, function (responseText) {
                    $('#divapellido1user').text(responseText);
                    document.getElementById("btnSavApe1user").disabled = true;
                });
            }
//                                        document.getElementById("inputApe1user").removedNode();
        });
        $('#btnSavApe2user').click(function () {
            if (verificarApe2Usuario()) {
                $.get('ServletControlB', {id: 22, ape2: document.getElementById("inputApe2user").value, email: document.getElementById("usuarioemail").value}, function (responseText) {
                    $('#divapellido2user').text(responseText);
                    document.getElementById("btnSavApe2user").disabled = true;
                });
            }
//                                        document.getElementById("inputApe2user").removedNode();
        });
        $('#btnSavEmailuser').click(function () {
            $.get('ServletControlB', {id: 23, email: document.getElementById("inputEmailuser").value, email01: document.getElementById("usuarioemail").value}, function (responseText) {
                $('#divemailuser').text(responseText);
                document.getElementById("btnSavEmailuser").disabled = true;
            });
//                                        document.getElementById("inputEmailuser").removedNode();
        });
        $('#btnSavNacuser').click(function () {
            if (verificarFechaNacUsuario()) {
                $.get('ServletControlB', {id: 24, nac: document.getElementById("inputNacuser").value, email: document.getElementById("usuarioemail").value}, function (responseText) {
                    $('#divnacimientouser').text(responseText);
                    document.getElementById("btnSavNacuser").disabled = true;
                });
            }
//                                        document.getElementById("inputNacuser").removedNode();
        });
    } else {
        document.getElementById("tablaUsuarios").innerHTML = "";
        $('#mensaje_usuario').text("Lo sentimos, solo usuarios administradores pueden modificar datos de otros usuarios");
    }
});
// </editor-fold>

// <editor-fold defaultstate="collapsed" desc="Gráfico de google">
function drawChart() {

// Load the Visualization API and the piechart package.
    google.load('visualization', '1.0', {'packages': ['corechart']});

// Set a callback to run when the Google Visualization API is loaded.
    google.setOnLoadCallback(drawChart);
// Callback that creates and populates a data table,
// instantiates the pie chart, passes in the data and
// draws it.
    arrayNomPais = [];
    arrayCantPais = [];

    $(document).ready(function () {
        $.ajaxSetup({async: false});
        $.get('ServletControlB', {id: 26}, function (responseText) {
            cantPais = parseInt(responseText);
        });
        for (var i = 0; i < cantPais; i++) {
            $.get('ServletControlB', {id: 27, posPais: i}, function (responseText) {
                arrayNomPais.push(responseText);
            });
            $.get('ServletControlB', {id: 28, nombrePais: arrayNomPais[i]}, function (responseText) {
                arrayCantPais.push(responseText);
            });
        }
    });

    // Create the data table.
    var data = new google.visualization.DataTable();
    data.addColumn('string', 'Pais');
    data.addColumn('number', 'Ingresos');
    for (var i = 0; i < cantPais; i++) {
        data.addRows([
            [arrayNomPais[i], parseInt(arrayCantPais[i])]
        ]);
    }

    // Set chart options
    var options = {'title': 'Porcentaje de ingresos por país',
        'width': 400,
        'height': 300};

    // Instantiate and draw our chart, passing in some options.
    var chart = new google.visualization.PieChart(document.getElementById('chart_div'));
    chart.draw(data, options);
}
// </editor-fold>

jQuery.ajax({
    url: '//freegeoip.net/json/',
    type: 'POST',
    dataType: 'jsonp',
    success: function (location) {
        // example where I update content on the page.
        jQuery('#city').html(location.city);
        jQuery('#region-code').html(location.region_code);
        jQuery('#region-name').html(location.region_name);
        jQuery('#areacode').html(location.areacode);
        jQuery('#ip').html(location.ip);
        jQuery('#zipcode').html(location.zipcode);
        jQuery('#longitude').html(location.longitude);
        jQuery('#latitude').html(location.latitude);
        jQuery('#country-name').html(location.country_name);
        jQuery('#country-code').html(location.country_code);
    }
});
