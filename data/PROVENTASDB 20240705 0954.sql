-- MySQL Administrator dump 1.4
--
-- ------------------------------------------------------
-- Server version	5.6.49-log


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


--
-- Create schema `pro-venta-db`
--

CREATE DATABASE IF NOT EXISTS `pro-venta-db`;
USE `pro-venta-db`;

--
-- Definition of table `tab_producto`
--

DROP TABLE IF EXISTS `tab_producto`;
CREATE TABLE `tab_producto` (
  `ID_PRODUCTO` varchar(36) NOT NULL,
  `CVE_PRODUCTO` varchar(12) DEFAULT NULL,
  `NOM_PRODUCTO` varchar(255) DEFAULT NULL,
  `TS_ALTA` datetime DEFAULT NULL,
  `TS_MODIFICA` datetime DEFAULT NULL,
  `USUARIO_ALTA` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`ID_PRODUCTO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tab_producto`
--

/*!40000 ALTER TABLE `tab_producto` DISABLE KEYS */;
INSERT INTO `tab_producto` (`ID_PRODUCTO`,`CVE_PRODUCTO`,`NOM_PRODUCTO`,`TS_ALTA`,`TS_MODIFICA`,`USUARIO_ALTA`) VALUES 
 ('123e','PRO000','sdfsd','2024-07-04 20:34:13','2024-07-04 20:34:17','System'),
 ('1ea0b39e-5e42-48c6-976d-c3f5de735d85','PRO006','Producto 6','2024-07-05 07:49:05','2024-07-05 07:49:05','System'),
 ('28595078-6219-4003-a278-aefb30696a61','PRO009','Producto 9','2024-07-05 08:55:51','2024-07-05 08:55:51','System'),
 ('2dc5c6bc-7f8d-47f0-ae31-5fbd5cc34c02','PRO002','Producto 002 actualizado','2024-07-04 23:08:29','2024-07-04 23:08:29','System'),
 ('4d3c579b-fb51-4966-800c-fda7cc070f2c','PRO005','Producto 5','2024-07-05 07:25:02','2024-07-05 07:25:02','System'),
 ('8a0e9670-fb52-4bdf-b838-b6748d6d1582','PRO001','Producto de prueba 1','2024-07-04 23:19:49','2024-07-04 23:19:49','System'),
 ('8d86642f-58f4-42d6-9894-6408cd449301','PRO003','Produco de prueba 3','2024-07-05 07:22:22','2024-07-05 07:22:22','System'),
 ('a3b5d8de-0c55-493e-8c33-a1519b3c5a60','PRO008','Producto 8','2024-07-05 08:12:51','2024-07-05 08:12:51','System'),
 ('b97e3ec6-b00d-4f40-aab0-c1bd28acfb77','PRO004','Producto 4','2024-07-05 07:23:02','2024-07-05 07:23:02','System');
/*!40000 ALTER TABLE `tab_producto` ENABLE KEYS */;




/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
