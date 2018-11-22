-- MySQL dump 10.13  Distrib 8.0.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: empleados_departamentos
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `departamentos`
--

DROP TABLE IF EXISTS `departamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `departamentos` (
  `codDepto` varchar(4) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `nombreDpto` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `ciudad` varchar(15) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  `codDirector` varchar(12) CHARACTER SET utf8 COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`codDepto`),
  KEY `FK_EmpDir` (`codDirector`),
  CONSTRAINT `FK_EmpDir` FOREIGN KEY (`codDirector`) REFERENCES `empleadoss` (`jefeid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `departamentos`
--

LOCK TABLES `departamentos` WRITE;
/*!40000 ALTER TABLE `departamentos` DISABLE KEYS */;
INSERT INTO `departamentos` VALUES ('1000','GERENCIA','CIUDAD REAL','31.840.269'),('1500','PRODUCCIÓN','CIUDAD REAL','16.211.383'),('2000','VENTAS','CIUDAD REAL','31.178.144'),('2100','VENTAS','BARCELONA','16.211.383'),('2200','VENTAS','VALENCIA','16.211.383'),('2300','VENTAS','MADRID','16.759.060'),('3000','INVESTIGACIÓN','CIUDAD REAL','16.759.060'),('3500','MERCADEO','CIUDAD REAL','22.222.222'),('4000','MANTENIMIENTO','CIUDAD REAL','333.333.333'),('4100','MANTENIMIENTO','BARCELONA','16.759.060'),('4200','MANTENIMIENTO','VALENCIA','16.759.060'),('4300','MANTENIMIENTO','MADRID','16.759.060');
/*!40000 ALTER TABLE `departamentos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-11-22 16:59:39
