function verificar() {
    var bandera = true;
    var Usuario = new Object();
    Usuario.nombre = document.getElementById("nombre").value;
    var nombre = Usuario.nombre.split(" ");
    Usuario.apellido1 = document.getElementById("apellido1").value;
    var apellido1 = Usuario.apellido1.split(" ");
    Usuario.apellido2 = document.getElementById("apellido2").value;
    var apellido2 = Usuario.apellido2.split(" ");
    Usuario.email = document.getElementById("email").value;
    Usuario.telefono = document.getElementById("telefono").value;
    Usuario.nacimiento = document.getElementById("nacimiento").value;
    fechaActual = new Date();
    fechaNacimiento = new Date(Date.parse(Usuario.nacimiento));
    Usuario.password = document.getElementById("password").value;
    Usuario.confirma = document.getElementById("confirma").value;



    /*Validaci[on de Nombre*/
    if (nombre.length === 1) {
        for (i = 0; i < nombre.length; i++) {
            if (/[0-9]/.test(nombre[i])) {
                bandera = false;
                alert("El nombre no puede contener números");
            }
        }
    } else {
        bandera = false;
        alert("El nombre debe contener solo 1 palabra");
    }
    /*Validacion Apellido 1*/
    if (apellido1.length === 1) {
        for (i = 0; i < apellido1.length; i++) {
            if (/[0-9]/.test(apellido1[i])) {
                bandera = false;
                alert("El Primer apellido no puede contener números");
            }
        }
    } else {
        bandera = false;
        alert("El Primer apellido debe contener solo 1 palabra");
    }


    /*Validacion Apellido 2*/
    if (apellido2.length === 1) {
        for (i = 0; i < apellido2.length; i++) {
            if (/[0-9]/.test(apellido2[i])) {
                bandera = false;
                alert("El Apellido 2 no puede contener números");
            }
        }
    } else {
        bandera = false;
        alert("El Apellido 2 debe contener solo 1 palabra");
    }

    /*Validacion de Correo*/
    if (/^[a-z-A-Z-0-9\-\_\.]+@+[a-z]+.+[a-z]$/.test(Usuario.email)) {


    } else {
        bandera = false;
        alert("Error al digitar el Email.\n\n Ejemplo:  xxxx@xxx.com");
    }

    /*Validacion de Telefono*/
    if (/^[0-9{4}]+-+[0-9{4}]/.test(Usuario.telefono)) {

    } else {
        alert("Error al digitar el número.\nEjemplo: 7777-7777");
        bandera = false;
    }


    /*Validacion de la Fecha*/
    if (fechaActual <= fechaNacimiento) {
        alert("La fecha de nacimiento no puede se mayor a la fecha actual");
        bandera = false;
    }

    /*Validacion del password*/
    if (/^[0-9{6}]$/.test(Usuario.password)) {
        alert("La contraseña debe de ser de 6 dígitos numéricos");
        bandera = false;
    }

    /*Validacion de la Coincidencia*/
    if (Usuario.confirma !== Usuario.password) {
        alert("Las contraseñas no coinciden ");
        bandera = false;
    }

    return bandera;
}

function verificar2() {
    var bandera = true;
    var Usuario = new Object();

    Usuario.email = document.getElementById("emailLogin").value;
    Usuario.password = document.getElementById("passwordLogin").value;

    /*Validacion de Correo*/
    if (/^[a-z-A-Z-0-9\-\_\.]+@+[a-z]+.+[a-z]$/.test(Usuario.email)) {
    } else {
        bandera = false;
        alert("Error al digitar el Email.\n\n Ejemplo:  xxxx@xxx.com");
    }
    /*Validacion del password*/
    if (/^[0-9{6}]$/.test(Usuario.password)) {
        alert("La contraseña debe de ser de 6 dígitos numéricos");
        bandera = false;
    }
    return bandera;
}


//function localizar(){
//    navigator.geolocation.getCurrentPosition(mapa, error);
//}
//
//function mapa(pos){
//    var contenedor = document.getElementById("mapa");
//    var latitud = pos.coords.latitude;
//    var longitud = pos.coords.longitude;
//    
//    var centro = new google.maps.LatLng(latitud,longitud);
//    
//    var propiedades = {
//        center: centro,
//        draggable: true,
//        KeyBoardShortcuts: true,
//        mapTypeControl : true,
//        mapTypeId: google.maps.MapTypeId.ROADMAP,
//        navigationControl: true,
//        scrollWheel: true,
//        streetViewControl: true,
//        zoom: 6
//    };
//    
//    var map = new google.maps.Map(contenedor, propiedades);
//    
//    var marcador = new google.maps.Marker({
//        draggable : true,
//        icon: 'images/1432108393_678111-map-marker-24.png',
//        position: centro,
//        map: map,
//        title: "holaaaaaaaaa"
//    });
//    
//}
//
//function error(errorC){
//    if(errorC.code === 0){
//        alert("Desconocido");
//    }else if(errorC === 1){
//        alert("No me dejaste ubicarte");
//    }else if(errorC === 2){
//        alert("Posicion no Disponible");
//    }else if(errorC === 3){
//        alert("Tiempo Agotado");
//    }
//}

/*METODOS MAPA*/

var x = document.getElementById("SMapa");
function getLocation2() {
    if (navigator.geolocation) {
        fecha = (String)(document.getElementById("fromDate").value);
        navigator.geolocation.getCurrentPosition(showPosition, showError);

    } else {
        x.innerHTML = "Su navegador no soporta geo localizacipon.";
    }
}


function showPosition(position) {
    var lat = position.coords.latitude;
    var lon = position.coords.longitude;
    centro = new google.maps.LatLng(lat, lon);
    consultaPais(lat, lon);
}

function showError(error) {
    switch (error.code) {
        case error.PERMISSION_DENIED:
            x.innerHTML = "Usuario denegado.";
            break;
        case error.POSITION_UNAVAILABLE:
            x.innerHTML = "Información invalida.";
            break;
        case error.TIMEOUT:
            x.innerHTML = "Se ha agotado el tiempo.";
            break;
        case error.UNKNOWN_ERROR:
            x.innerHTML = "Ha ocurrido un error.";
            break;
    }
}

function consultaPais(latitud, longitud) {
    var countryCode = 'http://api.geonames.org/countryCodeJSON?formatted=true&lat=' + latitud + '&lng=' + longitud + '&username=wilsame.6&style=full&callback=Code';
    tagger(countryCode);


}
function Code(jsonData) {
    var codigo = JSON.stringify(jsonData["countryCode"]);
    consultaBorde(codigo);
}

function tagger(request) {
    countryCode = new JSONscriptRequest(request);
    countryCode.buildScriptTag();
    countryCode.addScriptTag();
}

function consultaBorde(id) {
    var codigo = id.toString();
    codigo = codigo.replace("\"", "");
    codigo = codigo.replace("\"", "");
    var countryInfo = 'http://api.geonames.org/countryInfoJSON?formatted=true&lang=it&country=' + codigo + '&username=wilsame.6&style=full&callback=Bordes';
    tagger(countryInfo);
}
function Bordes(jsonData) {
    var norte = JSON.stringify(jsonData.geonames[0].north);
    var oeste = JSON.stringify(jsonData.geonames[0].west);
    var sur = JSON.stringify(jsonData.geonames[0].south);
    var este = JSON.stringify(jsonData.geonames[0].east);
    consultaSismo(norte, sur, este, oeste);

}
function consultaSismo(n, s, e, o) {

    var earthquakes = 'http://api.geonames.org/earthquakesJSON?formatted=true&north=' + n + '&south=' + s + '&east=' + e + '&west=' + o + '&username=wilsame.6&style=full&callback=sismos&date=' + fecha;
    tagger(earthquakes);
}

function sismos(jsonData) {
    var tam = JSON.stringify(jsonData.earthquakes.length);
    crearMapa();
    if (tam <= 0) {
        alert("No hay Sismos registrados en esa fecha");
    } else {

        for (i = 0; i < tam; i++) {
            var lat = JSON.stringify(jsonData.earthquakes[i]["lat"]);
            var lon = JSON.stringify(jsonData.earthquakes[i]["lng"]);
            var mag = JSON.stringify(jsonData.earthquakes[i]["magnitude"]);
            var prof = JSON.stringify(jsonData.earthquakes[i]["depth"]);
            agregarMarca(lat, lon, mag, prof);
        }
    }

}

function crearMapa() {
    mapholder = document.getElementById('SMapa');
    mapholder.style.height = '500px';
    mapholder.style.width = '500px';
    var myOptions = {
        center: centro, zoom: 8,
        mapTypeId: google.maps.MapTypeId.ROADMAP,
        mapTypeControl: false,
        navigationControlOptions: {style: google.maps.NavigationControlStyle.SMALL}
    }
    map = new google.maps.Map(document.getElementById("SMapa"), myOptions);
}
function agregarMarca(lat, lon, mag, prof) {
    var pos = new google.maps.LatLng(lat, lon);
    var marker = new google.maps.Marker({position: pos, map: map, title: "Magnitud:" + mag + "\nProfundidad:" + prof});
}

