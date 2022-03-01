-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: privateschooldatabase
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `assingments`
--

DROP TABLE IF EXISTS `assingments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `assingments` (
  `id` int NOT NULL AUTO_INCREMENT,
  `title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `description` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `oralMark` float NOT NULL,
  `totalMark` float NOT NULL,
  `subDateTime` datetime NOT NULL,
  `courseID` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_ASSINGMENTS_COURSES_idx` (`courseID`),
  CONSTRAINT `FK_ASSINGMENTS_COURSES` FOREIGN KEY (`courseID`) REFERENCES `courses` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `assingments`
--

LOCK TABLES `assingments` WRITE;
/*!40000 ALTER TABLE `assingments` DISABLE KEYS */;
INSERT INTO `assingments` VALUES (1,'INDIVIDUAL PROJECT','During the development of this project you need to do the implementation of a private school structure.',100,100,'2020-11-18 23:59:59',1),(2,'SPRING PROJECT','During the development of this project you need to do the implementation of a private school structure.',100,100,'2020-12-19 23:59:59',1),(3,'TEAM PROJECT','During the development of this project you need to do the implementation of a private school structure.',100,100,'2021-11-30 23:59:59',2),(4,'PETSHOP FRONT END IN JAVASCRIPT','During the development of this project you need to do the implementation of a private school structure.',100,100,'2020-11-25 23:59:59',4),(5,'HANGMAN IN JAVA','During the development of this project you need to do the implementation of a private school structure.',100,100,'2020-11-25 23:59:59',1),(6,'BOOKSTORE IN PYTHON','During the development of this project you need to do the implementation of a private school structure.',100,100,'2020-11-25 23:59:59',2),(7,'PRIVATE SCHOOL IN C#','During the development of this project you need to do the implementation of a private school structure.',100,100,'2020-11-25 23:59:59',5),(8,'PACMAN IN HTML','During the development of this project you need to do the implementation of a private school structure.',100,100,'2020-11-25 23:59:59',3),(9,'CONSTUCT A DATABASE IN MYSQL','During the development of this project you need to do the implementation of a private school structure.',100,100,'2020-11-25 23:59:59',7),(10,'PROJECT C++','During the development of this project you need to do the implementation of a private school structure.',100,100,'2020-11-25 23:59:59',6),(11,'CALCULATOR IN PASCAL','During the development of this project you need to do the implementation of a private school structure.',100,100,'2020-11-25 23:59:59',8);
/*!40000 ALTER TABLE `assingments` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-10-08 15:25:06
