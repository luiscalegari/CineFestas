-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema cinefestadb
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cinefestadb
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cinefestadb` DEFAULT CHARACTER SET utf8 ;
USE `cinefestadb` ;

-- -----------------------------------------------------
-- Table `cinefestadb`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`cliente` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(70) NOT NULL,
  `CEP` INT(11) NULL DEFAULT NULL,
  `endereco` VARCHAR(70) NULL DEFAULT NULL,
  `bairro` VARCHAR(70) NULL DEFAULT NULL,
  `cidade` VARCHAR(45) NULL DEFAULT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  `rg` VARCHAR(12) NOT NULL,
  `sexo` CHAR(1) NOT NULL,
  `dtnascimento` DATE NULL DEFAULT NULL,
  `dtCadastro` DATE NOT NULL,
  `inadinplencia` TINYINT(1) NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cinefestadb`.`festa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`festa` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `dtEvento` DATE NOT NULL,
  `dtConcepcao` DATE NULL DEFAULT NULL,
  `dtCadastro` DATE NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `atracao` VARCHAR(200) NULL DEFAULT NULL,
  `publicoEsperado` INT(11) NULL DEFAULT NULL,
  `responsaveisEvento` VARCHAR(140) NULL DEFAULT NULL,
  `investimentoInicial` DECIMAL(10,0) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cinefestadb`.`comanda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`comanda` (
  `numero` INT(11) NOT NULL,
  `festa` INT(11) NOT NULL,
  `status` TINYINT(1) NOT NULL,
  `total` DECIMAL(10,0) NULL DEFAULT NULL,
  `valorpago` DECIMAL(10,0) NOT NULL,
  PRIMARY KEY (`numero`),
  INDEX `fk_Comanda_Festa1_idx` (`festa` ASC),
  CONSTRAINT `fk_Comanda_Festa1`
    FOREIGN KEY (`festa`)
    REFERENCES `cinefestadb`.`festa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cinefestadb`.`comandacliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`comandacliente` (
  `comanda` INT(11) NOT NULL,
  `cliente` INT(11) NOT NULL,
  `data` DATETIME NOT NULL,
  PRIMARY KEY (`comanda`, `cliente`, `data`),
  INDEX `fk_Comanda_has_Cliente_Cliente1_idx` (`cliente` ASC),
  INDEX `fk_Comanda_has_Cliente_Comanda1_idx` (`comanda` ASC),
  CONSTRAINT `fk_Comanda_has_Cliente_Cliente1`
    FOREIGN KEY (`cliente`)
    REFERENCES `cinefestadb`.`cliente` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Comanda_has_Cliente_Comanda1`
    FOREIGN KEY (`comanda`)
    REFERENCES `cinefestadb`.`comanda` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cinefestadb`.`funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`funcionario` (
  `codigo` INT(11) NOT NULL,
  `funcao` VARCHAR(45) NOT NULL,
  `disponivel` TINYINT(1) NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo`),
  CONSTRAINT `fk_Funcionario_Cliente`
    FOREIGN KEY (`codigo`)
    REFERENCES `cinefestadb`.`cliente` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cinefestadb`.`comandafuncionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`comandafuncionario` (
  `comanda` INT(11) NOT NULL,
  `funcionario` INT(11) NOT NULL,
  `data` DATETIME NOT NULL,
  PRIMARY KEY (`comanda`, `funcionario`, `data`),
  INDEX `fk_Comanda_has_Funcionario_Funcionario1_idx` (`funcionario` ASC),
  INDEX `fk_Comanda_has_Funcionario_Comanda1_idx` (`comanda` ASC),
  CONSTRAINT `fk_Comanda_has_Funcionario_Comanda1`
    FOREIGN KEY (`comanda`)
    REFERENCES `cinefestadb`.`comanda` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Comanda_has_Funcionario_Funcionario1`
    FOREIGN KEY (`funcionario`)
    REFERENCES `cinefestadb`.`funcionario` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cinefestadb`.`contaspagar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`contaspagar` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `festa` INT(11) NULL DEFAULT NULL,
  `descricao` VARCHAR(200) NULL DEFAULT NULL,
  `valor` DECIMAL(10,0) NOT NULL,
  `dtVencimento` DATE NOT NULL,
  `dtPagamento` DATE NULL DEFAULT NULL,
  `dtRegistro` DATE NOT NULL,
  `valorpago` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_ContasPagar_Festa1_idx` (`festa` ASC),
  CONSTRAINT `fk_ContasPagar_Festa1`
    FOREIGN KEY (`festa`)
    REFERENCES `cinefestadb`.`festa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cinefestadb`.`empresa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`empresa` (
  `codigo` INT(11) NOT NULL,
  `razaosocial` VARCHAR(45) NULL DEFAULT NULL,
  `nomefantasia` VARCHAR(45) NULL DEFAULT NULL,
  `CNPJ` VARCHAR(14) NULL DEFAULT NULL,
  `inscrestadual` VARCHAR(45) NULL DEFAULT NULL,
  `endereco` VARCHAR(45) NULL DEFAULT NULL,
  `bairro` VARCHAR(45) NULL DEFAULT NULL,
  `CEP` VARCHAR(45) NULL DEFAULT NULL,
  `cidade` VARCHAR(45) NULL DEFAULT NULL,
  `logotipo` VARCHAR(200) NULL DEFAULT NULL,
  `telefone` INT(11) NULL DEFAULT NULL,
  `contato` VARCHAR(45) NULL DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo` ASC))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '			';


-- -----------------------------------------------------
-- Table `cinefestadb`.`funcionariofesta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`funcionariofesta` (
  `funcionario` INT(11) NOT NULL,
  `festa` INT(11) NOT NULL,
  `valorRecebido` DECIMAL(10,0) NULL DEFAULT NULL,
  PRIMARY KEY (`funcionario`, `festa`),
  INDEX `fk_Funcionario_has_Festa_Festa1_idx` (`festa` ASC),
  INDEX `fk_Funcionario_has_Festa_Funcionario1_idx` (`funcionario` ASC),
  CONSTRAINT `fk_Funcionario_has_Festa_Festa1`
    FOREIGN KEY (`festa`)
    REFERENCES `cinefestadb`.`festa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Funcionario_has_Festa_Funcionario1`
    FOREIGN KEY (`funcionario`)
    REFERENCES `cinefestadb`.`funcionario` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cinefestadb`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`produto` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `estoque` INT(11) NOT NULL,
  `precoVenda` DECIMAL(10,0) NOT NULL,
  `precoCompra` DECIMAL(10,0) NOT NULL,
  `tipo` INT(11) NULL DEFAULT NULL,
  `classificacao` INT(11) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cinefestadb`.`venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`venda` (
  `numero` INT(11) NOT NULL,
  `comanda` INT(11) NOT NULL,
  `total` DECIMAL(10,0) NOT NULL,
  PRIMARY KEY (`numero`),
  INDEX `fk_Venda_Comanda1_idx` (`comanda` ASC),
  CONSTRAINT `fk_Venda_Comanda1`
    FOREIGN KEY (`comanda`)
    REFERENCES `cinefestadb`.`comanda` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8
COMMENT = '	';


-- -----------------------------------------------------
-- Table `cinefestadb`.`itensvenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`itensvenda` (
  `venda` INT(11) NOT NULL,
  `produto` INT(11) NOT NULL,
  `qtde` INT(11) NOT NULL,
  `valor` DECIMAL(10,0) NOT NULL,
  PRIMARY KEY (`venda`),
  INDEX `fk_Produto_has_Venda_Venda1_idx` (`venda` ASC),
  INDEX `fk_ItensVenda_Produto1_idx` (`produto` ASC),
  CONSTRAINT `fk_ItensVenda_Produto1`
    FOREIGN KEY (`produto`)
    REFERENCES `cinefestadb`.`produto` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_has_Venda_Venda1`
    FOREIGN KEY (`venda`)
    REFERENCES `cinefestadb`.`venda` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


-- -----------------------------------------------------
-- Table `cinefestadb`.`produto_festa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cinefestadb`.`produto_festa` (
  `produto` INT(11) NOT NULL,
  `festa` INT(11) NOT NULL,
  `quantidade` INT(11) NULL DEFAULT NULL,
  PRIMARY KEY (`produto`, `festa`),
  INDEX `fk_Produto_has_Festa_Festa1_idx` (`festa` ASC),
  INDEX `fk_Produto_has_Festa_Produto1_idx` (`produto` ASC),
  CONSTRAINT `fk_Produto_has_Festa_Festa1`
    FOREIGN KEY (`festa`)
    REFERENCES `cinefestadb`.`festa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_has_Festa_Produto1`
    FOREIGN KEY (`produto`)
    REFERENCES `cinefestadb`.`produto` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
