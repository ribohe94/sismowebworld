SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';


CREATE SCHEMA IF NOT EXISTS `proyecto` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `proyecto` ;


CREATE TABLE IF NOT EXISTS Usuario (
`email`        VARCHAR(60)  NOT NULL,
`nombre`       VARCHAR(40)  NOT NULL,
`apellido1`  VARCHAR(40)  NOT NULL,
`apellido2`  VARCHAR(40)  NOT NULL,
`password`   VARCHAR(30)  NOT NULL,
`rutaFoto`   VARCHAR(300) NOT NULL,
`nacimiento` DATE NOT NULL,
`isAdministrador` BIT DEFAULT 0,
PRIMARY KEY (email))ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS Ingreso (
`usuario`     VARCHAR(60) NOT NULL,
`horaIngreso` DATETIME NOT NULL,
`pais`        VARCHAR(100) NOT NULL,
PRIMARY KEY (usuario, horaIngreso),
FOREIGN KEY (usuario) REFERENCES Usuario(email))ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS Noticia (
`id`     INT(4) NOT NULL,
`titulo`     VARCHAR(200) NOT NULL,
`fecha` DATETIME NOT NULL,
`contenido`        VARCHAR(5000) NOT NULL,
PRIMARY KEY (id))ENGINE = InnoDB;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

select * from Usuario;
select * from Ingreso;
select * from Noticia;

insert into Noticia (titulo, fecha, contenido, id) values ('Delincuentes roban equipos utilizados para monitorear actividad del volcán Turrialba','2014-10-14','El Observatorio Vulcanológico y Sismológico de Costa Rica (Ovsicori) denunció ante las autoridades el hurto de varios equipos que son utilizados para monitorear la actividad del volcán Turrialba.

Francisco Pacheco, vulcanólogo, dijo que ayer los especialistas se acercaron a la zona para recoger los datos que suministran dichos aparatos y se dieron cuenta que ya no estaban.

"Son equipos sumamente especializados y que solo a nosotros nos sirven, no pueden ser vendidos ni como chatarra", afirmó Pacheco.', 01);
insert into Noticia (titulo, fecha, contenido, id) values ('Volcán Turrialba aún hacer erupción','2014-10-14','Volcán Arenal aún hace erupción y caen cenizas', 02);
