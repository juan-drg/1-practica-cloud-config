-- MySQL Script generated by MySQL Workbench
-- Mon Oct  7 22:52:26 2019
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema productoventa
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema productoventa
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `productoventa` DEFAULT CHARACTER SET utf8 ;
USE `productoventa` ;

-- -----------------------------------------------------
-- Table `productoventa`.`producto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `productoventa`.`producto` (
  `idproducto` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(100) NOT NULL,
  `descripcion` VARCHAR(200) NOT NULL,
  `imagen` VARCHAR(200) NOT NULL,
  `precio` DOUBLE NOT NULL,
  `stock` INT NOT NULL,
  PRIMARY KEY (`idproducto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `productoventa`.`almacen`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `productoventa`.`almacen` (
  `idalmacen` INT NOT NULL AUTO_INCREMENT,
  `cantidad` INT NULL,
  `fechahora` DATETIME NULL,
  `idproducto` INT NOT NULL,
  PRIMARY KEY (`idalmacen`),
  INDEX `fk_almacen_producto_idx` (`idproducto` ASC),
  CONSTRAINT `fk_almacen_producto`
    FOREIGN KEY (`idproducto`)
    REFERENCES `productoventa`.`producto` (`idproducto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
