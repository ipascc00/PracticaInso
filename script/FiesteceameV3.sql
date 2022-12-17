-- MySQL dump 10.13  Distrib 8.0.28, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: fiesteceamev3
-- ------------------------------------------------------
-- Server version	8.0.28

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `actors`
--

DROP TABLE IF EXISTS `actors`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `actors` (
  `idActor` varchar(45) NOT NULL,
  `actorName` varchar(45) NOT NULL,
  `actorSurname` varchar(85) DEFAULT NULL,
  `password` varchar(45) NOT NULL,
  `type` int NOT NULL,
  `email` varchar(45) NOT NULL,
  `phoneNumber` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idActor`),
  UNIQUE KEY `idUsuario_UNIQUE` (`idActor`),
  KEY `typeId_idx` (`type`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `actors`
--

LOCK TABLES `actors` WRITE;
/*!40000 ALTER TABLE `actors` DISABLE KEYS */;
/*!40000 ALTER TABLE `actors` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `admin`
--

DROP TABLE IF EXISTS `admin`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `admin` (
  `idActor` varchar(45) NOT NULL,
  `type` int NOT NULL,
  PRIMARY KEY (`type`,`idActor`),
  KEY `userId_idx` (`idActor`),
  CONSTRAINT `typeAdmin` FOREIGN KEY (`type`) REFERENCES `actors` (`type`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `userId` FOREIGN KEY (`idActor`) REFERENCES `actors` (`idActor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `admin`
--

LOCK TABLES `admin` WRITE;
/*!40000 ALTER TABLE `admin` DISABLE KEYS */;
/*!40000 ALTER TABLE `admin` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `attendance`
--

DROP TABLE IF EXISTS `attendance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `attendance` (
  `idEvent` int NOT NULL,
  `idUser` varchar(45) NOT NULL,
  PRIMARY KEY (`idEvent`,`idUser`),
  KEY `idUser_idx` (`idUser`),
  CONSTRAINT `idOfEvent` FOREIGN KEY (`idEvent`) REFERENCES `events` (`idEvents`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idOfUserA` FOREIGN KEY (`idUser`) REFERENCES `user` (`idActor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `attendance`
--

LOCK TABLES `attendance` WRITE;
/*!40000 ALTER TABLE `attendance` DISABLE KEYS */;
/*!40000 ALTER TABLE `attendance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `eventpref`
--

DROP TABLE IF EXISTS `eventpref`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `eventpref` (
  `idEvent` int NOT NULL,
  `idPreferences` int NOT NULL,
  PRIMARY KEY (`idEvent`,`idPreferences`),
  KEY `idPreferences_idx` (`idPreferences`),
  CONSTRAINT `idEvent` FOREIGN KEY (`idEvent`) REFERENCES `events` (`idEvents`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idOfPreferences` FOREIGN KEY (`idPreferences`) REFERENCES `preferences` (`idPreferences`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `eventpref`
--

LOCK TABLES `eventpref` WRITE;
/*!40000 ALTER TABLE `eventpref` DISABLE KEYS */;
/*!40000 ALTER TABLE `eventpref` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `events`
--

DROP TABLE IF EXISTS `events`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `events` (
  `idEvents` int NOT NULL,
  `eventName` varchar(45) NOT NULL,
  `eventDescription` varchar(200) NOT NULL,
  `eventAdress` varchar(45) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phoneNumber` varchar(45) DEFAULT NULL,
  `idHost` varchar(45) NOT NULL,
  PRIMARY KEY (`idEvents`),
  UNIQUE KEY `eventName_UNIQUE` (`eventName`),
  KEY `idHost_idx` (`idHost`),
  CONSTRAINT `idOfHost` FOREIGN KEY (`idHost`) REFERENCES `host` (`idHost`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `events`
--

LOCK TABLES `events` WRITE;
/*!40000 ALTER TABLE `events` DISABLE KEYS */;
/*!40000 ALTER TABLE `events` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `host`
--

DROP TABLE IF EXISTS `host`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `host` (
  `idHost` varchar(45) NOT NULL,
  `type` int NOT NULL,
  PRIMARY KEY (`idHost`,`type`),
  KEY `type_idx` (`type`),
  CONSTRAINT `idHost` FOREIGN KEY (`idHost`) REFERENCES `actors` (`idActor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `typeHost` FOREIGN KEY (`type`) REFERENCES `actors` (`type`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `host`
--

LOCK TABLES `host` WRITE;
/*!40000 ALTER TABLE `host` DISABLE KEYS */;
/*!40000 ALTER TABLE `host` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `preferences`
--

DROP TABLE IF EXISTS `preferences`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `preferences` (
  `idPreferences` int NOT NULL,
  `name` varchar(45) NOT NULL,
  `description` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idPreferences`),
  UNIQUE KEY `name_UNIQUE` (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `preferences`
--

LOCK TABLES `preferences` WRITE;
/*!40000 ALTER TABLE `preferences` DISABLE KEYS */;
/*!40000 ALTER TABLE `preferences` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `rate`
--

DROP TABLE IF EXISTS `rate`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `rate` (
  `idUser` varchar(45) NOT NULL,
  `starsRate` int NOT NULL,
  `idEvent` int NOT NULL,
  `comentRate` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`idUser`,`idEvent`),
  KEY `idEvent_idx` (`idEvent`),
  CONSTRAINT `idOfEvent2` FOREIGN KEY (`idEvent`) REFERENCES `events` (`idEvents`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `idOfUser2` FOREIGN KEY (`idUser`) REFERENCES `user` (`idActor`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `rate`
--

LOCK TABLES `rate` WRITE;
/*!40000 ALTER TABLE `rate` DISABLE KEYS */;
/*!40000 ALTER TABLE `rate` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `report`
--

DROP TABLE IF EXISTS `report`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `report` (
  `idReport` int NOT NULL,
  `idEvent` int NOT NULL,
  `idUser` varchar(45) NOT NULL,
  `annotation` varchar(500) NOT NULL,
  PRIMARY KEY (`idReport`,`idEvent`,`idUser`),
  KEY `idEvent_idx` (`idEvent`),
  KEY `idUser_idx` (`idUser`),
  CONSTRAINT `idOfEventR` FOREIGN KEY (`idEvent`) REFERENCES `events` (`idEvents`) ON DELETE RESTRICT ON UPDATE CASCADE,
  CONSTRAINT `idOfUserR` FOREIGN KEY (`idUser`) REFERENCES `user` (`idActor`) ON DELETE RESTRICT ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `report`
--

LOCK TABLES `report` WRITE;
/*!40000 ALTER TABLE `report` DISABLE KEYS */;
/*!40000 ALTER TABLE `report` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `type`
--

DROP TABLE IF EXISTS `type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `type` (
  `idType` int NOT NULL,
  `nameType` varchar(45) NOT NULL,
  PRIMARY KEY (`idType`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `type`
--

LOCK TABLES `type` WRITE;
/*!40000 ALTER TABLE `type` DISABLE KEYS */;
/*!40000 ALTER TABLE `type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `idActor` varchar(45) NOT NULL,
  `type` int NOT NULL,
  PRIMARY KEY (`type`,`idActor`),
  KEY `userId_idx` (`idActor`),
  CONSTRAINT `IdOfUser` FOREIGN KEY (`idActor`) REFERENCES `actors` (`idActor`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `typeUser` FOREIGN KEY (`type`) REFERENCES `actors` (`type`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `userpref`
--

DROP TABLE IF EXISTS `userpref`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `userpref` (
  `idUserPref` int NOT NULL,
  `idUser` varchar(45) NOT NULL,
  `idPreferences` int NOT NULL,
  PRIMARY KEY (`idUserPref`,`idPreferences`),
  KEY `idPreferences_idx` (`idPreferences`),
  KEY `idUser_idx` (`idUser`),
  CONSTRAINT `idOfPreferencesU` FOREIGN KEY (`idPreferences`) REFERENCES `preferences` (`idPreferences`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `idUser` FOREIGN KEY (`idUser`) REFERENCES `user` (`idActor`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `userpref`
--

LOCK TABLES `userpref` WRITE;
/*!40000 ALTER TABLE `userpref` DISABLE KEYS */;
/*!40000 ALTER TABLE `userpref` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-12-17 19:05:23
