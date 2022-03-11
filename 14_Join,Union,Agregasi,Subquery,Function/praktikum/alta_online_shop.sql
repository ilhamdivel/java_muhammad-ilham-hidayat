-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 11, 2022 at 10:16 AM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `alta_online_shop`
--

-- --------------------------------------------------------

--
-- Table structure for table `operators`
--

CREATE TABLE `operators` (
  `id_operator` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `operators`
--

INSERT INTO `operators` (`id_operator`, `nama`, `created_at`, `updated_at`) VALUES
(1, 'Telkomsel', '2022-03-11 03:32:36', '2022-03-11 03:32:36'),
(2, 'XL', '2022-03-11 03:32:36', '2022-03-11 03:32:36'),
(3, 'Smartfren', '2022-03-11 03:32:36', '2022-03-11 03:32:36'),
(4, 'Indosat', '2022-03-11 03:32:36', '2022-03-11 03:32:36'),
(5, 'Axis', '2022-03-11 03:32:36', '2022-03-11 03:32:36');

-- --------------------------------------------------------

--
-- Table structure for table `payment_methods`
--

CREATE TABLE `payment_methods` (
  `id_payment_methods` int(11) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `status` smallint(6) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `payment_methods`
--

INSERT INTO `payment_methods` (`id_payment_methods`, `name`, `status`, `created_at`, `updated_at`) VALUES
(1, 'Dana', 200, '2022-03-11 04:30:22', '2022-03-11 04:30:22'),
(2, 'Gopay', 300, '2022-03-11 04:30:22', '2022-03-11 04:30:22'),
(3, 'OVO', 400, '2022-03-11 04:30:22', '2022-03-11 04:30:22');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id_product` int(11) NOT NULL,
  `id_product_type` int(11) DEFAULT NULL,
  `id_operator` int(11) DEFAULT NULL,
  `code` varchar(50) DEFAULT NULL,
  `name` varchar(100) DEFAULT NULL,
  `status` smallint(6) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id_product`, `id_product_type`, `id_operator`, `code`, `name`, `status`, `created_at`, `updated_at`) VALUES
(3, 2, 1, 'KPBS', 'Kartu Pascabayar Telkomsel', 330, '2022-03-11 04:19:09', '2022-03-11 04:19:09'),
(4, 2, 1, 'KPBS2', 'Kartu Pascabayar Telkomsel2', 440, '2022-03-11 04:19:09', '2022-03-11 04:19:09'),
(5, 2, 1, 'KPBS3', 'Kartu Pascabayar Telkomsel3', 550, '2022-03-11 04:19:09', '2022-03-11 04:19:09'),
(6, 3, 4, 'KPI', 'Kartu Paket Indosat', 660, '2022-03-11 04:19:09', '2022-03-11 04:19:09'),
(7, 3, 4, 'KPI2', 'Kartu Paket Indosat2', 770, '2022-03-11 04:19:09', '2022-03-11 04:19:09'),
(8, 3, 4, 'KPI3', 'Kartu Paket Indosat3', 880, '2022-03-11 04:19:09', '2022-03-11 04:19:09');

-- --------------------------------------------------------

--
-- Table structure for table `product_description`
--

CREATE TABLE `product_description` (
  `id_product_description` int(11) NOT NULL,
  `description` text DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product_description`
--

INSERT INTO `product_description` (`id_product_description`, `description`, `created_at`, `updated_at`) VALUES
(1, 'Ini Kartu Prabayar Smartfren', '2022-03-11 04:26:40', '2022-03-11 04:26:40'),
(2, 'Ini Kartu Prabayar Smartfren 2', '2022-03-11 04:26:40', '2022-03-11 04:26:40'),
(3, 'Ini Kartu Pascabayar Telkomsel', '2022-03-11 04:26:40', '2022-03-11 04:26:40'),
(4, 'Ini Kartu Pascabayar Telkomsel 2', '2022-03-11 04:26:40', '2022-03-11 04:26:40'),
(5, 'Ini Kartu Pascabayar Telkomsel 3', '2022-03-11 04:26:40', '2022-03-11 04:26:40'),
(6, 'Ini Kartu Paket Indosat', '2022-03-11 04:26:40', '2022-03-11 04:26:40'),
(7, 'Ini Kartu Paket Indosat 2', '2022-03-11 04:26:40', '2022-03-11 04:26:40'),
(8, 'Ini Kartu Paket Indosat 3', '2022-03-11 04:26:40', '2022-03-11 04:26:40');

-- --------------------------------------------------------

--
-- Table structure for table `product_types`
--

CREATE TABLE `product_types` (
  `id_product_type` int(11) NOT NULL,
  `nama` varchar(255) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `product_types`
--

INSERT INTO `product_types` (`id_product_type`, `nama`, `created_at`, `updated_at`) VALUES
(1, 'Kartu Prabayar', '2022-03-11 03:46:36', '2022-03-11 03:46:36'),
(2, 'Kartu Pascabayar', '2022-03-11 03:46:36', '2022-03-11 03:46:36'),
(3, 'Kartu Paket', '2022-03-11 03:46:36', '2022-03-11 03:46:36');

-- --------------------------------------------------------

--
-- Table structure for table `transactions`
--

CREATE TABLE `transactions` (
  `id_transaction` int(11) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `id_payment_methods` int(11) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `total_qty` int(11) DEFAULT NULL,
  `total_price` decimal(25,2) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transactions`
--

INSERT INTO `transactions` (`id_transaction`, `id_user`, `id_payment_methods`, `status`, `total_qty`, `total_price`, `created_at`, `updated_at`) VALUES
(1, 1, 1, '5', 10, '10000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(2, 1, 2, '4', 10, '20000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(3, 1, 3, '4', 20, '30000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(4, 2, 3, '4', 10, '10000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(5, 2, 1, '4', 14, '20000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(6, 2, 3, '5', 12, '30000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(7, 3, 1, '2', 12, '10000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(8, 3, 1, '2', 10, '10000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(9, 3, 2, '3', 10, '10000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(10, 4, 1, '3', 5, '10000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(11, 4, 2, '3', 5, '10000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(12, 4, 3, '2', 4, '20000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(13, 5, 1, '3', 5, '10000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(14, 5, 2, '3', 6, '10000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18'),
(15, 5, 3, '2', 6, '20000.00', '2022-03-11 07:27:18', '2022-03-11 07:27:18');

--
-- Triggers `transactions`
--
DELIMITER $$
CREATE TRIGGER `delete_transaction` BEFORE DELETE ON `transactions` FOR EACH ROW BEGIN
DECLARE v_id_trans INT;
SET v_id_trans = OLD.id_transaction;
DELETE FROM transaction_details WHERE id_transaction = v_id_trans;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `transaction_details`
--

CREATE TABLE `transaction_details` (
  `id_transaction` int(11) NOT NULL,
  `id_product` int(11) NOT NULL,
  `status` varchar(10) DEFAULT NULL,
  `qty` int(11) DEFAULT NULL,
  `price` decimal(25,2) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `transaction_details`
--

INSERT INTO `transaction_details` (`id_transaction`, `id_product`, `status`, `qty`, `price`, `created_at`, `updated_at`) VALUES
(1, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(1, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(1, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(2, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(2, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(2, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(3, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(3, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(3, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(4, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(4, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(4, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(5, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(5, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(5, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(6, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(6, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(6, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(7, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(7, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(7, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(8, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(8, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(8, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(9, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(9, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(9, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(10, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(10, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(10, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(11, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(11, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(11, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(12, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(12, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(12, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(13, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(13, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(13, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(14, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(14, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(14, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(15, 3, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(15, 4, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19'),
(15, 5, '1', 5, '10000.00', '2022-03-11 07:48:19', '2022-03-11 07:48:19');

--
-- Triggers `transaction_details`
--
DELIMITER $$
CREATE TRIGGER `updated_qty` BEFORE DELETE ON `transaction_details` FOR EACH ROW BEGIN
DECLARE v_id_trans INT;
DECLARE v_qty INT;
SET v_id_trans = OLD.id_transaction;
SET v_qty = OLD.qty;
UPDATE transactions SET total_qty = total_qty - v_qty WHERE id_transaction = v_id_transaction;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id_user` int(11) NOT NULL,
  `name` varchar(100) DEFAULT NULL,
  `status` smallint(6) DEFAULT NULL,
  `dob` date DEFAULT NULL,
  `gender` char(1) DEFAULT NULL,
  `created_at` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp(),
  `updated_at` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id_user`, `name`, `status`, `dob`, `gender`, `created_at`, `updated_at`) VALUES
(1, 'Ilham', 5, '1999-07-21', 'L', '2022-03-11 06:39:37', '2022-03-11 06:39:37'),
(2, 'Bakti', 4, '1999-07-22', 'P', '2022-03-11 06:39:37', '2022-03-11 06:39:37'),
(3, 'Felix', 3, '1999-05-24', 'L', '2022-03-11 06:39:37', '2022-03-11 06:39:37'),
(4, 'Ronal', 2, '2000-05-24', 'P', '2022-03-11 06:39:37', '2022-03-11 06:39:37'),
(5, 'David', 1, '2001-05-24', 'L', '2022-03-11 06:39:37', '2022-03-11 06:39:37');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `operators`
--
ALTER TABLE `operators`
  ADD PRIMARY KEY (`id_operator`);

--
-- Indexes for table `payment_methods`
--
ALTER TABLE `payment_methods`
  ADD PRIMARY KEY (`id_payment_methods`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id_product`),
  ADD KEY `id_product_type` (`id_product_type`),
  ADD KEY `id_operator` (`id_operator`);

--
-- Indexes for table `product_description`
--
ALTER TABLE `product_description`
  ADD PRIMARY KEY (`id_product_description`);

--
-- Indexes for table `product_types`
--
ALTER TABLE `product_types`
  ADD PRIMARY KEY (`id_product_type`);

--
-- Indexes for table `transactions`
--
ALTER TABLE `transactions`
  ADD PRIMARY KEY (`id_transaction`),
  ADD KEY `id_user` (`id_user`),
  ADD KEY `id_payment_methods` (`id_payment_methods`);

--
-- Indexes for table `transaction_details`
--
ALTER TABLE `transaction_details`
  ADD PRIMARY KEY (`id_transaction`,`id_product`),
  ADD KEY `id_product` (`id_product`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id_user`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `products_ibfk_1` FOREIGN KEY (`id_product_type`) REFERENCES `product_types` (`id_product_type`),
  ADD CONSTRAINT `products_ibfk_2` FOREIGN KEY (`id_operator`) REFERENCES `operators` (`id_operator`);

--
-- Constraints for table `transactions`
--
ALTER TABLE `transactions`
  ADD CONSTRAINT `transactions_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `user` (`id_user`),
  ADD CONSTRAINT `transactions_ibfk_2` FOREIGN KEY (`id_payment_methods`) REFERENCES `payment_methods` (`id_payment_methods`);

--
-- Constraints for table `transaction_details`
--
ALTER TABLE `transaction_details`
  ADD CONSTRAINT `transaction_details_ibfk_1` FOREIGN KEY (`id_transaction`) REFERENCES `transactions` (`id_transaction`),
  ADD CONSTRAINT `transaction_details_ibfk_2` FOREIGN KEY (`id_product`) REFERENCES `products` (`id_product`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
