CREATE DATABASE  IF NOT EXISTS `multimediaarts2_cinefestadb` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `multimediaarts2_cinefestadb`;
-- MySQL dump 10.13  Distrib 5.6.24, for Win64 (x86_64)
--
-- Host: robb0187.publiccloud.com.br    Database: multimediaarts2_cinefestadb
-- ------------------------------------------------------
-- Server version	5.1.73-rel14.11-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cliente` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(70) NOT NULL,
  `CEP` int(11) DEFAULT NULL,
  `endereco` varchar(70) DEFAULT NULL,
  `bairro` varchar(70) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `cpf` varchar(14) NOT NULL,
  `rg` varchar(12) NOT NULL,
  `sexo` char(1) NOT NULL,
  `dtnascimento` date DEFAULT NULL,
  `dtCadastro` date NOT NULL,
  `inadimplencia` tinyint(1) DEFAULT NULL,
  `telefone` varchar(45) DEFAULT NULL,
  `celular` varchar(45) DEFAULT NULL,
  `estado` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `cpf_UNIQUE` (`cpf`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (2,'Luis Fernando Calegari',22222222,'Luiz Maranho, 170','Jd. Vale do Sol','Presidente Prudente','334.081.060-53','222222222','M','1988-07-30','2015-05-26',0,'(22) - 22222222','(33) - 333333333','São Paulo'),(3,'Vanessa Tomaello Calegari',22222222,'','','Presidente Prudente','708.716.801-06','333333333','F','1990-09-10','2015-05-27',0,'(33) - 33333333','(33) - 333333333','São Paulo'),(4,'José José',19999999,'Rua Rua,  123','Bairro Bairro','Cidade','111.111.111-11','111111111','M','1990-11-11','2015-06-15',0,'(19) - 19191919','(19) - 191919191','São Paulo');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comanda`
--

DROP TABLE IF EXISTS `comanda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comanda` (
  `numero` int(11) NOT NULL,
  `status` tinyint(1) NOT NULL,
  PRIMARY KEY (`numero`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comanda`
--

LOCK TABLES `comanda` WRITE;
/*!40000 ALTER TABLE `comanda` DISABLE KEYS */;
INSERT INTO `comanda` VALUES (1000,1),(1001,1),(1002,0),(1003,1),(1004,0),(1005,0),(1006,0),(1007,0),(1008,0),(1009,0);
/*!40000 ALTER TABLE `comanda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comandacliente`
--

DROP TABLE IF EXISTS `comandacliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comandacliente` (
  `comanda` int(11) NOT NULL,
  `cliente` int(11) NOT NULL,
  `festa` int(11) NOT NULL,
  `total` decimal(10,2) DEFAULT NULL,
  `valorPago` decimal(10,2) DEFAULT NULL,
  PRIMARY KEY (`comanda`,`cliente`,`festa`),
  KEY `fk_Comanda_has_Cliente_Cliente1_idx` (`cliente`),
  KEY `fk_Comanda_has_Cliente_Comanda1_idx` (`comanda`),
  KEY `fk_comandacliente_festa1_idx` (`festa`),
  CONSTRAINT `fk_Comanda_has_Cliente_Cliente1` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Comanda_has_Cliente_Comanda1` FOREIGN KEY (`comanda`) REFERENCES `comanda` (`numero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_comandacliente_festa1` FOREIGN KEY (`festa`) REFERENCES `festa` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comandacliente`
--

LOCK TABLES `comandacliente` WRITE;
/*!40000 ALTER TABLE `comandacliente` DISABLE KEYS */;
INSERT INTO `comandacliente` VALUES (1000,2,6,0.00,0.00),(1001,2,6,119.00,108.00),(1001,4,7,11.00,0.00),(1003,2,7,2.00,0.00);
/*!40000 ALTER TABLE `comandacliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `comandafuncionario`
--

DROP TABLE IF EXISTS `comandafuncionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `comandafuncionario` (
  `comanda` int(11) NOT NULL,
  `funcionario` int(11) NOT NULL,
  `data` datetime NOT NULL,
  PRIMARY KEY (`comanda`,`funcionario`,`data`),
  KEY `fk_Comanda_has_Funcionario_Funcionario1_idx` (`funcionario`),
  KEY `fk_Comanda_has_Funcionario_Comanda1_idx` (`comanda`),
  CONSTRAINT `fk_Comanda_has_Funcionario_Comanda1` FOREIGN KEY (`comanda`) REFERENCES `comanda` (`numero`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Comanda_has_Funcionario_Funcionario1` FOREIGN KEY (`funcionario`) REFERENCES `funcionario` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `comandafuncionario`
--

LOCK TABLES `comandafuncionario` WRITE;
/*!40000 ALTER TABLE `comandafuncionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `comandafuncionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contaspagar`
--

DROP TABLE IF EXISTS `contaspagar`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `contaspagar` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `festa` int(11) DEFAULT NULL,
  `descricao` varchar(200) DEFAULT NULL,
  `valor` decimal(10,0) NOT NULL,
  `dtVencimento` date NOT NULL,
  `dtPagamento` date DEFAULT NULL,
  `dtRegistro` date NOT NULL,
  `valorpago` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  KEY `fk_ContasPagar_Festa1_idx` (`festa`),
  CONSTRAINT `fk_ContasPagar_Festa1` FOREIGN KEY (`festa`) REFERENCES `festa` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contaspagar`
--

LOCK TABLES `contaspagar` WRITE;
/*!40000 ALTER TABLE `contaspagar` DISABLE KEYS */;
/*!40000 ALTER TABLE `contaspagar` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `empresa` (
  `codigo` int(11) NOT NULL,
  `razaosocial` varchar(45) DEFAULT NULL,
  `nomefantasia` varchar(45) DEFAULT NULL,
  `CNPJ` varchar(14) DEFAULT NULL,
  `inscrestadual` varchar(45) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  `bairro` varchar(45) DEFAULT NULL,
  `CEP` varchar(45) DEFAULT NULL,
  `cidade` varchar(45) DEFAULT NULL,
  `logotipo` varchar(200) DEFAULT NULL,
  `telefone` int(11) DEFAULT NULL,
  `contato` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`codigo`),
  UNIQUE KEY `codigo_UNIQUE` (`codigo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='			';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `festa`
--

DROP TABLE IF EXISTS `festa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `festa` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `dtEvento` date NOT NULL,
  `dtConcepcao` date DEFAULT NULL,
  `dtCadastro` date NOT NULL,
  `descricao` varchar(400) NOT NULL,
  `atracao` varchar(200) DEFAULT NULL,
  `publicoEsperado` int(11) DEFAULT NULL,
  `responsaveisEvento` varchar(140) DEFAULT NULL,
  `investimentoInicial` decimal(10,0) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `festa`
--

LOCK TABLES `festa` WRITE;
/*!40000 ALTER TABLE `festa` DISABLE KEYS */;
INSERT INTO `festa` VALUES (3,'2015-05-27','2015-05-27','2015-05-27','MINI CURSO JSF 2.2','JSF',15,'Caetano',500),(4,'2015-05-28','2015-05-28','2015-05-28','Apresentação dos cadastros basicos e funções fundamentais do projeto de Engenharia II','Apresentação Projeto Engenharia',2,'Cassia e Aglae',1500),(5,'2015-06-09','2015-06-09','2015-06-09','Aline vai fazer 39 anos','Aniversário Aline',10,'Aline',0),(6,'2015-06-15','2015-06-15','2015-06-15','Basil vc Peru','Copa América',20000,'Dunga',156),(7,'2015-06-16','2015-06-16','2015-06-16','Cine Festa','Apresentação Engenharia II',26,'Luis',21);
/*!40000 ALTER TABLE `festa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionario`
--

DROP TABLE IF EXISTS `funcionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionario` (
  `codigo` int(11) NOT NULL,
  `funcao` varchar(45) NOT NULL,
  `admin` tinyint(1) NOT NULL,
  `login` varchar(45) NOT NULL,
  `senha` varchar(45) NOT NULL,
  PRIMARY KEY (`codigo`),
  CONSTRAINT `fk_Funcionario_Cliente` FOREIGN KEY (`codigo`) REFERENCES `cliente` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionario`
--

LOCK TABLES `funcionario` WRITE;
/*!40000 ALTER TABLE `funcionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `funcionariofesta`
--

DROP TABLE IF EXISTS `funcionariofesta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `funcionariofesta` (
  `funcionario` int(11) NOT NULL,
  `festa` int(11) NOT NULL,
  `valorRecebido` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`funcionario`,`festa`),
  KEY `fk_Funcionario_has_Festa_Festa1_idx` (`festa`),
  KEY `fk_Funcionario_has_Festa_Funcionario1_idx` (`funcionario`),
  CONSTRAINT `fk_Funcionario_has_Festa_Festa1` FOREIGN KEY (`festa`) REFERENCES `festa` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Funcionario_has_Festa_Funcionario1` FOREIGN KEY (`funcionario`) REFERENCES `funcionario` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `funcionariofesta`
--

LOCK TABLES `funcionariofesta` WRITE;
/*!40000 ALTER TABLE `funcionariofesta` DISABLE KEYS */;
/*!40000 ALTER TABLE `funcionariofesta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `itensvenda`
--

DROP TABLE IF EXISTS `itensvenda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `itensvenda` (
  `venda` int(11) NOT NULL,
  `produto` int(11) NOT NULL,
  `qtde` int(11) NOT NULL,
  `valor` decimal(10,0) NOT NULL,
  PRIMARY KEY (`venda`,`produto`),
  KEY `fk_Produto_has_Venda_Venda1_idx` (`venda`),
  KEY `fk_ItensVenda_Produto1_idx` (`produto`),
  CONSTRAINT `fk_ItensVenda_Produto1` FOREIGN KEY (`produto`) REFERENCES `produto` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_has_Venda_Venda1` FOREIGN KEY (`venda`) REFERENCES `venda` (`numero`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `itensvenda`
--

LOCK TABLES `itensvenda` WRITE;
/*!40000 ALTER TABLE `itensvenda` DISABLE KEYS */;
INSERT INTO `itensvenda` VALUES (10,2,1,5),(11,1,1,1),(12,2,21,5),(13,2,6,5),(14,1,3,1),(15,1,3,1),(16,1,2,1),(17,1,1,1),(18,2,2,5);
/*!40000 ALTER TABLE `itensvenda` ENABLE KEYS */;
UNLOCK TABLES;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
/*!50003 CREATE*/ /*!50017 DEFINER=`multi_cinefestad`@`%`*/ /*!50003 TRIGGER `multimediaarts2_cinefestadb`.`atualiza_estoque` 
AFTER INSERT ON `itensvenda` FOR EACH ROW
begin    

	declare trgComanda int;
	select com.numero into trgComanda from multimediaarts2_cinefestadb.itensvenda iv
		inner join multimediaarts2_cinefestadb.venda ven on ven.numero = iv.venda
        inner join multimediaarts2_cinefestadb.comanda com on com.numero = ven.comanda
        inner join multimediaarts2_cinefestadb.comandacliente cc on cc.comanda = com.numero
        inner join multimediaarts2_cinefestadb.festa f on f.codigo = cc.festa
        where ven.numero = new.venda and curdate() in (f.dtEvento);
    
    
	update multimediaarts2_cinefestadb.produto 
		set estoque = estoque-new.qtde 
        where codigo = new.produto;
		
	update multimediaarts2_cinefestadb.comandacliente
		set total = total + new.qtde * new.valor
        where comanda = trgComanda;
end */;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto` (
  `codigo` int(11) NOT NULL AUTO_INCREMENT,
  `descricao` varchar(45) NOT NULL,
  `estoque` int(11) NOT NULL,
  `precoVenda` decimal(10,2) NOT NULL,
  `precoCompra` decimal(10,2) NOT NULL,
  `tipo` int(11) DEFAULT NULL,
  `classificacao` int(11) NOT NULL,
  PRIMARY KEY (`codigo`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'Espetinho de gato',11,1.00,5.00,1,16),(2,'Asa de morcego',4,5.33,2.60,1,16);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto_festa`
--

DROP TABLE IF EXISTS `produto_festa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `produto_festa` (
  `produto` int(11) NOT NULL,
  `festa` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`produto`,`festa`),
  KEY `fk_Produto_has_Festa_Festa1_idx` (`festa`),
  KEY `fk_Produto_has_Festa_Produto1_idx` (`produto`),
  CONSTRAINT `fk_Produto_has_Festa_Festa1` FOREIGN KEY (`festa`) REFERENCES `festa` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Produto_has_Festa_Produto1` FOREIGN KEY (`produto`) REFERENCES `produto` (`codigo`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto_festa`
--

LOCK TABLES `produto_festa` WRITE;
/*!40000 ALTER TABLE `produto_festa` DISABLE KEYS */;
/*!40000 ALTER TABLE `produto_festa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `venda` (
  `numero` int(11) NOT NULL AUTO_INCREMENT,
  `comanda` int(11) NOT NULL,
  `total` decimal(10,0) NOT NULL,
  PRIMARY KEY (`numero`),
  KEY `fk_Venda_Comanda1_idx` (`comanda`),
  CONSTRAINT `fk_Venda_Comanda1` FOREIGN KEY (`comanda`) REFERENCES `comanda` (`numero`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8 COMMENT='	';
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
INSERT INTO `venda` VALUES (10,1009,5),(11,1009,1),(12,1001,112),(13,1009,32),(14,1008,3),(15,1001,3),(16,1003,7),(17,1001,1),(18,1001,11);
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'multimediaarts2_cinefestadb'
--

--
-- Dumping routines for database 'multimediaarts2_cinefestadb'
--
/*!50003 DROP PROCEDURE IF EXISTS `PRC_VINCULAR_COMANDA` */;
/*!50003 SET @saved_cs_client      = @@character_set_client */ ;
/*!50003 SET @saved_cs_results     = @@character_set_results */ ;
/*!50003 SET @saved_col_connection = @@collation_connection */ ;
/*!50003 SET character_set_client  = utf8 */ ;
/*!50003 SET character_set_results = utf8 */ ;
/*!50003 SET collation_connection  = utf8_general_ci */ ;
/*!50003 SET @saved_sql_mode       = @@sql_mode */ ;
/*!50003 SET sql_mode              = '' */ ;
DELIMITER ;;
CREATE DEFINER=`multi_cinefestad`@`%` PROCEDURE `PRC_VINCULAR_COMANDA`(IN NUMEROCOMANDA INT, IN CODIGOCLIENTE INT, OUT ERRO INT)
BEGIN
	
	DECLARE codFesta int DEFAULT 0; 
	DECLARE numComanda int DEFAULT 0;
    DECLARE statusComanda int DEFAULT 0;
    
    SELECT codigo into codFesta FROM festa 
		WHERE CURDATE() = dtevento;
    
    SELECT numero, status into numComanda, statusComanda FROM comanda
		WHERE NUMEROCOMANDA = numero;
    
    IF (codFesta > 0) THEN
		IF (numComanda > 0) THEN
			IF (statusComanda < 1) THEN
                INSERT INTO comandacliente (comanda, cliente, festa, total, valorPago) 
					VALUES (numComanda, CODIGOCLIENTE, codFesta, 0.0, 0.0);
                            
				UPDATE comanda 
					SET status = 1
					WHERE numero = numComanda;
				
                SET ERRO = 0;
                    
			ELSE SET ERRO = 1;
            END IF;
		ELSE SET ERRO = 2;
        END IF;
	ELSE SET ERRO = 3;
    END IF;
END ;;
DELIMITER ;
/*!50003 SET sql_mode              = @saved_sql_mode */ ;
/*!50003 SET character_set_client  = @saved_cs_client */ ;
/*!50003 SET character_set_results = @saved_cs_results */ ;
/*!50003 SET collation_connection  = @saved_col_connection */ ;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2015-07-06  9:38:21
