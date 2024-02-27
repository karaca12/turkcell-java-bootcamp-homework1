-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Banka
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema Banka
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Banka` DEFAULT CHARACTER SET utf8 ;
USE `Banka` ;

-- -----------------------------------------------------
-- Table `Banka`.`Kanallar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Banka`.`Kanallar` (
  `idKanallar` INT NOT NULL,
  `Ad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idKanallar`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Banka`.`Musteriler`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Banka`.`Musteriler` (
  `idMusteri` INT NOT NULL,
  `MusteriNo` CHAR(10) NOT NULL,
  `idKanallar` INT NOT NULL,
  PRIMARY KEY (`idMusteri`),
  INDEX `KanalId_idx` (`idKanallar` ASC) VISIBLE,
  UNIQUE INDEX `MusteriNo_UNIQUE` (`MusteriNo` ASC) VISIBLE,
  CONSTRAINT `idKanallar`
    FOREIGN KEY (`idKanallar`)
    REFERENCES `Banka`.`Kanallar` (`idKanallar`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Banka`.`GercekMusteriler`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Banka`.`GercekMusteriler` (
  `idMusteri` INT NOT NULL,
  `Ad` VARCHAR(45) NOT NULL,
  `Soyad` VARCHAR(45) NOT NULL,
  `TCKimlikNo` CHAR(11) NOT NULL,
  PRIMARY KEY (`idMusteri`),
  UNIQUE INDEX `TCKimlikNo_UNIQUE` (`TCKimlikNo` ASC) VISIBLE,
  CONSTRAINT `idMusteriGercek`
    FOREIGN KEY (`idMusteri`)
    REFERENCES `Banka`.`Musteriler` (`idMusteri`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Banka`.`TuzelMusteriler`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Banka`.`TuzelMusteriler` (
  `idMusteri` INT NOT NULL,
  `Unvan` VARCHAR(45) NOT NULL,
  `VergiNo` CHAR(10) NOT NULL,
  PRIMARY KEY (`idMusteri`),
  UNIQUE INDEX `VergiNo_UNIQUE` (`VergiNo` ASC) VISIBLE,
  CONSTRAINT `idMusteriTuzel`
    FOREIGN KEY (`idMusteri`)
    REFERENCES `Banka`.`Musteriler` (`idMusteri`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Banka`.`Adresler`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Banka`.`Adresler` (
  `idAdres` INT NOT NULL,
  `idMusteri` INT NOT NULL,
  `AdresDetay` VARCHAR(250) NOT NULL,
  PRIMARY KEY (`idAdres`),
  INDEX `idMusteri_idx` (`idMusteri` ASC) VISIBLE,
  CONSTRAINT `idMusteriAdres`
    FOREIGN KEY (`idMusteri`)
    REFERENCES `Banka`.`Musteriler` (`idMusteri`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Banka`.`Bilancolar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Banka`.`Bilancolar` (
  `idBilancolar` INT NOT NULL,
  `idMusteri` INT NOT NULL,
  `Tarih` DATETIME NOT NULL,
  `Tutar` FLOAT NOT NULL,
  PRIMARY KEY (`idBilancolar`),
  INDEX `idMusteri_idx` (`idMusteri` ASC) VISIBLE,
  CONSTRAINT `idMusteriBilanco`
    FOREIGN KEY (`idMusteri`)
    REFERENCES `Banka`.`Musteriler` (`idMusteri`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Banka`.`TicariFaaliyetler`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Banka`.`TicariFaaliyetler` (
  `idTicariFaaliyetler` INT NOT NULL,
  `idMusteri` INT NOT NULL,
  `BaslangicTarih` DATETIME NOT NULL,
  PRIMARY KEY (`idTicariFaaliyetler`),
  INDEX `idMusteri_idx` (`idMusteri` ASC) VISIBLE,
  UNIQUE INDEX `idMusteri_UNIQUE` (`idMusteri` ASC) VISIBLE,
  CONSTRAINT `idMusteriTicari`
    FOREIGN KEY (`idMusteri`)
    REFERENCES `Banka`.`GercekMusteriler` (`idMusteri`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Banka`.`Sendikalar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `Banka`.`Sendikalar` (
  `idMusteri` INT NOT NULL,
  `Ad` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idMusteri`),
  INDEX `fk_Sendikalar_Musteriler1_idx` (`idMusteri` ASC) VISIBLE,
  CONSTRAINT `fk_Sendikalar_Musteriler1`
    FOREIGN KEY (`idMusteri`)
    REFERENCES `Banka`.`Musteriler` (`idMusteri`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
