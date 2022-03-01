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
-- Table structure for table `studentshaveassingments`
--

DROP TABLE IF EXISTS `studentshaveassingments`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentshaveassingments` (
  `studentsID` int NOT NULL,
  `assingmentsID` int NOT NULL,
  PRIMARY KEY (`studentsID`,`assingmentsID`),
  KEY `fk_students_has_assingments_assingments1_idx` (`assingmentsID`),
  KEY `fk_students_has_assingments_students1_idx` (`studentsID`),
  CONSTRAINT `fk_students_has_assingments_assingments1` FOREIGN KEY (`assingmentsID`) REFERENCES `assingments` (`id`),
  CONSTRAINT `fk_students_has_assingments_students1` FOREIGN KEY (`studentsID`) REFERENCES `students` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentshaveassingments`
--

LOCK TABLES `studentshaveassingments` WRITE;
/*!40000 ALTER TABLE `studentshaveassingments` DISABLE KEYS */;
INSERT INTO `studentshaveassingments` VALUES (1,1),(3,1),(16,1),(2,2),(4,2),(17,2),(19,3),(31,3),(4,4),(31,4),(3,5),(5,5),(15,5),(20,5),(25,5),(6,6),(9,6),(7,7),(13,7),(25,7),(8,8),(27,8),(29,8),(1,9),(20,9),(32,9),(2,10),(12,10),(14,10);
/*!40000 ALTER TABLE `studentshaveassingments` ENABLE KEYS */;
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
