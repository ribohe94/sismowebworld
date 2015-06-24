// <editor-fold defaultstate="collapsed" desc="Noticias">

function cargarNoticias() {
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
}

// </editor-fold>