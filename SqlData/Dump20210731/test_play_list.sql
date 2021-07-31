-- MySQL dump 10.13  Distrib 8.0.25, for macos11 (x86_64)
--
-- Host: 127.0.0.1    Database: test
-- ------------------------------------------------------
-- Server version	8.0.25

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
-- Table structure for table `play_list`
--

DROP TABLE IF EXISTS `play_list`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `play_list` (
  `id` bigint NOT NULL,
  `image` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `name_english` varchar(255) DEFAULT NULL,
  `name_thai` varchar(255) DEFAULT NULL,
  `catagory_id` bigint DEFAULT NULL,
  `is_like` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKewudtbvbq7rq2b2avs01nnonf` (`catagory_id`),
  CONSTRAINT `FKewudtbvbq7rq2b2avs01nnonf` FOREIGN KEY (`catagory_id`) REFERENCES `catagory` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `play_list`
--

LOCK TABLES `play_list` WRITE;
/*!40000 ALTER TABLE `play_list` DISABLE KEYS */;
INSERT INTO `play_list` VALUES (65,'https://i.scdn.co/image/ab67706f00000003c6d4ef40b38b22eec5d1f253','Hot Hits Thailand',NULL,NULL,NULL,NULL),(66,'https://i.scdn.co/image/ab67706f00000003aff65ca9603c0d902f7d3aaf','เพลงไทยยอดนิยม',NULL,NULL,NULL,NULL),(67,'https://i.scdn.co/image/ab67706f00000003caa3d022a1e1baf6264e1053','ป๊อปโดนใจ',NULL,NULL,NULL,NULL),(68,'https://i.scdn.co/image/ab67706f000000030aa758d4e0dbf6069cdd95d9','ฮิตติดกระแส - ขอให้โลกนี้ใจดีกับเธอ',NULL,NULL,NULL,NULL),(69,'https://i.scdn.co/image/ab67706f000000033861dba8cceeac314da96ae2','ฟังเพลินตอนทำงาน',NULL,NULL,NULL,NULL),(70,'https://i.scdn.co/image/ab67706f00000003624e5ce7b1dfb9027e168f29','Hits & Viral',NULL,NULL,NULL,NULL),(71,'https://i.scdn.co/image/ab67706f00000003969da4648e758928d76005f6','K-Pop Daebak',NULL,NULL,NULL,NULL),(72,'https://i.scdn.co/image/ab67706f00000003dc9ce78e028c8777fb2da8a7','ชิลล์ฮอป',NULL,NULL,NULL,NULL),(73,'https://i.scdn.co/image/ab67706f000000035368ac22d333ad9a2531a7b1','RADAR Thailand',NULL,NULL,NULL,NULL),(74,'https://i.scdn.co/image/ab67706f00000003f4bfe234c8f4cd7b39dcfda6','It\'s a Hit!',NULL,NULL,NULL,NULL),(75,'https://i.scdn.co/image/ab67706f0000000351c8b41d3ca9d951bd617617','ลูกทุ่งยอดนิยม',NULL,NULL,NULL,NULL),(76,'https://i.scdn.co/image/ab67706f00000003483dbd6d86aeba95768d30de','KimBops!',NULL,NULL,NULL,NULL),(77,'https://i.scdn.co/image/ab67706f000000035081954fc2f6a443b07deb2c','ฮิปฮอป ของมันต้องฟัง',NULL,NULL,NULL,NULL),(78,'https://i.scdn.co/image/ab67706f000000038ed1a5002b96c2ea882541b2','Peaceful Guitar',NULL,NULL,NULL,NULL),(79,'https://i.scdn.co/image/ab67706f00000003526096dc64b07d27599b518b','อินดี้โดนใจ',NULL,NULL,NULL,NULL),(80,'https://i.scdn.co/image/ab67706f0000000304fdffe87ae09654caa950f8','K-Pop Rising',NULL,NULL,NULL,NULL),(81,'https://i.scdn.co/image/ab67706f00000003fbbe20c4b163232f36d39cc5','ร็อกฮิต',NULL,NULL,NULL,NULL),(82,'https://i.scdn.co/image/ab67706f000000037fce01e76700295e0ece70a2','Anime Hits',NULL,NULL,NULL,NULL),(83,'https://i.scdn.co/image/ab67706f000000035a6cc5303354d538e0f9f175','EQUAL Thailand',NULL,NULL,NULL,NULL),(84,'https://i.scdn.co/image/ab67706f000000039a5ee6ffeed4ca86f805f47e','Light & Easy',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `play_list` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-07-31 11:31:17
