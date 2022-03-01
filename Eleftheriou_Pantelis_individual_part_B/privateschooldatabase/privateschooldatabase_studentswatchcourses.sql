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
-- Table structure for table `studentswatchcourses`
--

DROP TABLE IF EXISTS `studentswatchcourses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `studentswatchcourses` (
  `studentsID` int NOT NULL,
  `coursesID` int NOT NULL,
  PRIMARY KEY (`studentsID`,`coursesID`),
  KEY `FK_COURSES_STUDENTS_idx` (`coursesID`),
  CONSTRAINT `FK_COURSES_STUDENTS` FOREIGN KEY (`coursesID`) REFERENCES `courses` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `FK_STUDENTS_COURSES` FOREIGN KEY (`studentsID`) REFERENCES `students` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `studentswatchcourses`
--

LOCK TABLES `studentswatchcourses` WRITE;
/*!40000 ALTER TABLE `studentswatchcourses` DISABLE KEYS */;
INSERT INTO `studentswatchcourses` VALUES (1,1),(9,1),(17,1),(1,2),(2,2),(10,2),(18,2),(2,3),(5,3),(11,3),(19,3),(3,4),(4,4),(12,4),(20,4),(4,5),(5,5),(13,5),(21,5),(5,6),(6,6),(14,6),(22,6),(7,7),(15,7),(23,7),(8,8),(16,8),(24,8);
/*!40000 ALTER TABLE `studentswatchcourses` ENABLE KEYS */;
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
