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
-- Table structure for table `students`
--

DROP TABLE IF EXISTS `students`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `students` (
  `id` int NOT NULL AUTO_INCREMENT,
  `firstName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `lastName` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `tuitionFees` float NOT NULL,
  `birthday` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `students`
--

LOCK TABLES `students` WRITE;
/*!40000 ALTER TABLE `students` DISABLE KEYS */;
INSERT INTO `students` VALUES (1,'Janie','Sammes',1616.16,'1996-07-31'),(2,'Rosco','Cheltnam',2408.85,'1987-01-03'),(3,'Alix','Burnell',355.44,'1976-07-02'),(4,'Allina','Sheaf',531.15,'1981-09-12'),(5,'Becky','Vauter',1297.68,'1992-12-14'),(6,'Margareta','Roo',418.13,'1976-07-14'),(7,'Ellery','Slater',153.16,'1975-07-28'),(8,'Nanete','Upstell',1251.77,'2001-05-31'),(9,'Rourke','Shulver',1966.65,'1985-06-05'),(10,'Mannie','Dannehl',870.6,'1970-03-21'),(11,'Jeanette','Stichall',492.26,'1991-02-16'),(12,'Marsiella','Baudy',2121.89,'1994-05-23'),(13,'Sileas','Labes',2008.79,'2000-12-07'),(14,'Edlin','Padilla',211.77,'1993-10-19'),(15,'Melissa','Fairey',356.19,'1982-04-06'),(16,'Verne','Doley',1439.66,'1998-06-23'),(17,'Lyda','Taylder',1847.24,'1977-10-11'),(18,'Gwendolyn','Botley',1048.37,'1974-03-09'),(19,'Gabie','Copsey',2278.67,'1981-08-31'),(20,'Doralynne','Mulqueen',1517.8,'1997-03-16'),(21,'Loren','Liddiard',335.97,'1986-11-09'),(22,'Ashli','South',1064.63,'1992-08-04'),(23,'Lloyd','Skally',2038.57,'1970-01-13'),(24,'Leila','Goodman',676.47,'1973-03-10'),(25,'Zacharias','Pilgrim',310.37,'1986-07-07'),(26,'Maryann','Fleote',1433.37,'1970-05-14'),(27,'Irene','Schurcke',75.68,'1995-04-14'),(28,'Iosep','Smieton',1678.81,'1971-03-21'),(29,'Berky','Hannaby',492.6,'1990-05-25'),(30,'Hadlee','Braund',2071.91,'1986-12-27'),(31,'Elonore','Cadany',1227.99,'2000-07-24'),(32,'Bill','Kingaby',679.06,'1976-02-13');
/*!40000 ALTER TABLE `students` ENABLE KEYS */;
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
