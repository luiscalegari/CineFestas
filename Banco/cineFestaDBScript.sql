-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema cineFestaDB
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema cineFestaDB
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `cineFestaDB` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci ;
USE `cineFestaDB` ;

-- -----------------------------------------------------
-- Table `cineFestaDB`.`Cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`Cliente` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(70) NOT NULL,
  `CEP` INT(11) NULL,
  `endereco` VARCHAR(70) NULL,
  `bairro` VARCHAR(70) NULL,
  `cidade` INT(11) NULL,
  `cpf` VARCHAR(11) NOT NULL,
  `rg` VARCHAR(9) NULL,
  `sexo` CHAR(1) NOT NULL,
  `dtnascimento` DATE NULL,
  `dtCadastro` DATE NOT NULL,
  `inadinplencia` TINYINT(1) NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`Funcionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`Funcionario` (
  `codigo` INT(11) NOT NULL,
  `funcao` VARCHAR(45) NOT NULL,
  `disponivel` TINYINT(1) NOT NULL,
  `login` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`codigo`),
  CONSTRAINT `fk_Funcionario_Cliente`
    FOREIGN KEY (`codigo`)
    REFERENCES `cineFestaDB`.`Cliente` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`Festa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`Festa` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `dtEvento` DATE NOT NULL,
  `dtConcepcao` DATE NULL,
  `dtCadastro` DATE NOT NULL,
  `descricao` VARCHAR(45) NOT NULL,
  `atracao` VARCHAR(200) NULL,
  `publicoEsperado` INT(11) NULL,
  `responsaveisEvento` VARCHAR(140) NULL,
  `investimentoInicial` DECIMAL NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`ContasPagar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`ContasPagar` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `festa` INT(11) NULL,
  `descricao` VARCHAR(200) NULL,
  `valor` DECIMAL NOT NULL,
  `dtVencimento` DATE NOT NULL,
  `dtPagamento` DATE NULL,
  `dtRegistro` DATE NOT NULL,
  `valorpago` DECIMAL NULL,
  PRIMARY KEY (`codigo`),
  INDEX `fk_ContasPagar_Festa1_idx` (`festa` ASC),
  CONSTRAINT `fk_ContasPagar_Festa1`
    FOREIGN KEY (`festa`)
    REFERENCES `cineFestaDB`.`Festa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`Produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`Produto` (
  `codigo` INT(11) NOT NULL AUTO_INCREMENT,
  `descricao` VARCHAR(45) NOT NULL,
  `estoque` INT(11) NOT NULL,
  `precoVenda` DECIMAL NOT NULL,
  `precoCompra` DECIMAL NOT NULL,
  `tipo` INT(11) NULL,
  `classificacao` INT(11) NOT NULL,
  PRIMARY KEY (`codigo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`Comanda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`Comanda` (
  `numero` INT(11) NOT NULL,
  `festa` INT(11) NOT NULL,
  `status` TINYINT(1) NOT NULL,
  `total` DECIMAL NULL,
  `valorpago` DECIMAL NOT NULL,
  PRIMARY KEY (`numero`),
  INDEX `fk_Comanda_Festa1_idx` (`festa` ASC),
  CONSTRAINT `fk_Comanda_Festa1`
    FOREIGN KEY (`festa`)
    REFERENCES `cineFestaDB`.`Festa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`Venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`Venda` (
  `numero` INT(11) NOT NULL,
  `comanda` INT(11) NOT NULL,
  `total` DECIMAL NOT NULL,
  PRIMARY KEY (`numero`),
  INDEX `fk_Venda_Comanda1_idx` (`comanda` ASC),
  CONSTRAINT `fk_Venda_Comanda1`
    FOREIGN KEY (`comanda`)
    REFERENCES `cineFestaDB`.`Comanda` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
COMMENT = '	';


-- -----------------------------------------------------
-- Table `cineFestaDB`.`ComandaCliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`ComandaCliente` (
  `comanda` INT(11) NOT NULL,
  `cliente` INT(11) NOT NULL,
  `data` DATETIME NOT NULL,
  PRIMARY KEY (`comanda`, `cliente`, `data`),
  INDEX `fk_Comanda_has_Cliente_Cliente1_idx` (`cliente` ASC),
  INDEX `fk_Comanda_has_Cliente_Comanda1_idx` (`comanda` ASC),
  CONSTRAINT `fk_Comanda_has_Cliente_Comanda1`
    FOREIGN KEY (`comanda`)
    REFERENCES `cineFestaDB`.`Comanda` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Comanda_has_Cliente_Cliente1`
    FOREIGN KEY (`cliente`)
    REFERENCES `cineFestaDB`.`Cliente` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`ComandaFuncionario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`ComandaFuncionario` (
  `comanda` INT(11) NOT NULL,
  `funcionario` INT(11) NOT NULL,
  `data` DATETIME NOT NULL,
  PRIMARY KEY (`comanda`, `funcionario`, `data`),
  INDEX `fk_Comanda_has_Funcionario_Funcionario1_idx` (`funcionario` ASC),
  INDEX `fk_Comanda_has_Funcionario_Comanda1_idx` (`comanda` ASC),
  CONSTRAINT `fk_Comanda_has_Funcionario_Comanda1`
    FOREIGN KEY (`comanda`)
    REFERENCES `cineFestaDB`.`Comanda` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Comanda_has_Funcionario_Funcionario1`
    FOREIGN KEY (`funcionario`)
    REFERENCES `cineFestaDB`.`Funcionario` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`FuncionarioFesta`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`FuncionarioFesta` (
  `funcionario` INT(11) NOT NULL,
  `festa` INT(11) NOT NULL,
  `valorRecebido` DECIMAL NULL,
  PRIMARY KEY (`funcionario`, `festa`),
  INDEX `fk_Funcionario_has_Festa_Festa1_idx` (`festa` ASC),
  INDEX `fk_Funcionario_has_Festa_Funcionario1_idx` (`funcionario` ASC),
  CONSTRAINT `fk_Funcionario_has_Festa_Funcionario1`
    FOREIGN KEY (`funcionario`)
    REFERENCES `cineFestaDB`.`Funcionario` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Funcionario_has_Festa_Festa1`
    FOREIGN KEY (`festa`)
    REFERENCES `cineFestaDB`.`Festa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`ItensVenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`ItensVenda` (
  `venda` INT(11) NOT NULL,
  `produto` INT(11) NOT NULL,
  `qtde` INT(11) NOT NULL,
  `valor` DECIMAL NOT NULL,
  PRIMARY KEY (`venda`),
  INDEX `fk_Produto_has_Venda_Venda1_idx` (`venda` ASC),
  INDEX `fk_ItensVenda_Produto1_idx` (`produto` ASC),
  CONSTRAINT `fk_Produto_has_Venda_Venda1`
    FOREIGN KEY (`venda`)
    REFERENCES `cineFestaDB`.`Venda` (`numero`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_ItensVenda_Produto1`
    FOREIGN KEY (`produto`)
    REFERENCES `cineFestaDB`.`Produto` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`Produto_Festa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`Produto_Festa` (
  `produto` INT(11) NOT NULL,
  `festa` INT(11) NOT NULL,
  `quantidade` INT(11) NULL,
  PRIMARY KEY (`produto`, `festa`),
  INDEX `fk_Produto_has_Festa_Festa1_idx` (`festa` ASC),
  INDEX `fk_Produto_has_Festa_Produto1_idx` (`produto` ASC),
  CONSTRAINT `fk_Produto_has_Festa_Produto1`
    FOREIGN KEY (`produto`)
    REFERENCES `cineFestaDB`.`Produto` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_has_Festa_Festa1`
    FOREIGN KEY (`festa`)
    REFERENCES `cineFestaDB`.`Festa` (`codigo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `cineFestaDB`.`Empresa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `cineFestaDB`.`Empresa` (
  `codigo` INT(11) NOT NULL,
  `razaosocial` VARCHAR(45) NULL,
  `nomefantasia` VARCHAR(45) NULL,
  `CNPJ` VARCHAR(14) NULL,
  `inscrestadual` VARCHAR(45) NULL,
  `endereco` VARCHAR(45) NULL,
  `bairro` VARCHAR(45) NULL,
  `CEP` VARCHAR(45) NULL,
  `cidade` VARCHAR(45) NULL,
  `logotipo` VARCHAR(200) NULL,
  `telefone` INT(11) NULL,
  `contato` VARCHAR(45) NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE INDEX `codigo_UNIQUE` (`codigo` ASC))
ENGINE = InnoDB
COMMENT = '			';


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
