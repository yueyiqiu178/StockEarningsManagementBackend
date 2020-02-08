CREATE DATABASE `stock` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

CREATE TABLE `transaction` (
  `transaction_id` int(11) NOT NULL AUTO_INCREMENT,
  `stock_id` varchar(45) DEFAULT NULL,
  `transaction_type` varchar(1) DEFAULT NULL,
  `transaction_price` decimal(10,3) DEFAULT NULL,
  `transaction_amuont` int(11) DEFAULT NULL,
  `transaction_date` date DEFAULT NULL,
  `is_ settled` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`transaction_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

CREATE TABLE `config` (
  `config_key` varchar(45) NOT NULL,
  `config_value` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`config_key`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
