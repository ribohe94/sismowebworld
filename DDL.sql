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

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
