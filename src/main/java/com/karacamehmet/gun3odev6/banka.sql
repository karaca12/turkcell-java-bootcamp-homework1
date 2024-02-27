-- MySQL Workbench Synchronization
-- Generated: 2024-02-28 01:15
-- Model: New Model
-- Version: 1.0
-- Project: Name of the project
-- Author: memo_

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

ALTER SCHEMA `banka`  DEFAULT CHARACTER SET utf8  DEFAULT COLLATE utf8_general_ci ;

ALTER TABLE `banka`.`Musteriler` 
DROP FOREIGN KEY `idKanallar`;

ALTER TABLE `banka`.`GercekMusteriler` 
DROP FOREIGN KEY `idMusteriGercek`;

ALTER TABLE `banka`.`TuzelMusteriler` 
DROP FOREIGN KEY `idMusteriTuzel`;

ALTER TABLE `banka`.`Adresler` 
DROP FOREIGN KEY `idMusteriAdres`;

ALTER TABLE `banka`.`Bilancolar` 
DROP FOREIGN KEY `idMusteriBilanco`;

ALTER TABLE `banka`.`TicariFaaliyetler` 
DROP FOREIGN KEY `idMusteriTicari`;

ALTER TABLE `banka`.`Sendikalar` 
DROP FOREIGN KEY `fk_Sendikalar_Musteriler1`;

ALTER TABLE `banka`.`Musteriler` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ,
CHANGE COLUMN `idMusteri` `idMusteri` INT(11) NOT NULL ,
CHANGE COLUMN `idKanallar` `idKanallar` INT(11) NOT NULL ;

ALTER TABLE `banka`.`GercekMusteriler` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ,
CHANGE COLUMN `idMusteri` `idMusteri` INT(11) NOT NULL ;

ALTER TABLE `banka`.`TuzelMusteriler` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ,
CHANGE COLUMN `idMusteri` `idMusteri` INT(11) NOT NULL ;

ALTER TABLE `banka`.`Adresler` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ,
CHANGE COLUMN `idAdres` `idAdres` INT(11) NOT NULL ,
CHANGE COLUMN `idMusteri` `idMusteri` INT(11) NOT NULL ;

ALTER TABLE `banka`.`Bilancolar` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ,
CHANGE COLUMN `idBilancolar` `idBilancolar` INT(11) NOT NULL ,
CHANGE COLUMN `idMusteri` `idMusteri` INT(11) NOT NULL ,
CHANGE COLUMN `Tarih` `Tarih` DATETIME NOT NULL ;

ALTER TABLE `banka`.`TicariFaaliyetler` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ,
CHANGE COLUMN `idTicariFaaliyetler` `idTicariFaaliyetler` INT(11) NOT NULL ,
CHANGE COLUMN `idMusteri` `idMusteri` INT(11) NOT NULL ,
CHANGE COLUMN `BaslangicTarih` `BaslangicTarih` DATETIME NOT NULL ;

ALTER TABLE `banka`.`Kanallar` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ,
CHANGE COLUMN `idKanallar` `idKanallar` INT(11) NOT NULL ;

ALTER TABLE `banka`.`Sendikalar` 
CHARACTER SET = utf8 , COLLATE = utf8_general_ci ,
CHANGE COLUMN `idMusteri` `idMusteri` INT(11) NOT NULL ;

ALTER TABLE `banka`.`Musteriler` 
ADD CONSTRAINT `idKanallar`
  FOREIGN KEY (`idKanallar`)
  REFERENCES `banka`.`Kanallar` (`idKanallar`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `banka`.`GercekMusteriler` 
ADD CONSTRAINT `idMusteriGercek`
  FOREIGN KEY (`idMusteri`)
  REFERENCES `banka`.`Musteriler` (`idMusteri`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `banka`.`TuzelMusteriler` 
ADD CONSTRAINT `idMusteriTuzel`
  FOREIGN KEY (`idMusteri`)
  REFERENCES `banka`.`Musteriler` (`idMusteri`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `banka`.`Adresler` 
ADD CONSTRAINT `idMusteriAdres`
  FOREIGN KEY (`idMusteri`)
  REFERENCES `banka`.`Musteriler` (`idMusteri`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `banka`.`Bilancolar` 
ADD CONSTRAINT `idMusteriBilanco`
  FOREIGN KEY (`idMusteri`)
  REFERENCES `banka`.`Musteriler` (`idMusteri`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `banka`.`TicariFaaliyetler` 
ADD CONSTRAINT `idMusteriTicari`
  FOREIGN KEY (`idMusteri`)
  REFERENCES `banka`.`GercekMusteriler` (`idMusteri`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

ALTER TABLE `banka`.`Sendikalar` 
ADD CONSTRAINT `fk_Sendikalar_Musteriler1`
  FOREIGN KEY (`idMusteri`)
  REFERENCES `banka`.`Musteriler` (`idMusteri`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
