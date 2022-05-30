-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 30, 2022 at 08:10 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `shopping_online`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_brand`
--

CREATE TABLE `tbl_brand` (
  `BrandID` int(11) NOT NULL,
  `Name` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_order`
--

CREATE TABLE `tbl_order` (
  `OrderID` int(11) NOT NULL,
  `OrderDate` int(11) NOT NULL,
  `Status` int(11) NOT NULL,
  `Delivered` tinyint(4) NOT NULL,
  `DeliveryDate` int(11) NOT NULL,
  `CustommerID` int(11) NOT NULL,
  `Discount` int(11) DEFAULT NULL,
  `total` decimal(18,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_orderdetail`
--

CREATE TABLE `tbl_orderdetail` (
  `id_product` int(11) NOT NULL,
  `id_order` int(11) NOT NULL,
  `ProductName` int(11) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_product`
--

CREATE TABLE `tbl_product` (
  `ProductID` int(11) NOT NULL,
  `Name` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SeoTilte` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Image` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `ListImages` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_bin DEFAULT NULL CHECK (json_valid(`ListImages`)),
  `Price` decimal(18,0) NOT NULL DEFAULT 0,
  `Quantity` int(11) NOT NULL DEFAULT 0,
  `VAT` int(11) NOT NULL DEFAULT 10,
  `Status` tinyint(4) NOT NULL DEFAULT 1,
  `Warranty` int(11) NOT NULL DEFAULT 0,
  `Hot` datetime DEFAULT NULL,
  `Descriptions` varchar(500) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Detail` text COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Views` int(11) NOT NULL DEFAULT 1,
  `CateID` int(11) DEFAULT NULL,
  `BrandID` int(11) DEFAULT NULL,
  `SupplierID` int(11) DEFAULT NULL,
  `MetaKeywords` int(11) DEFAULT NULL,
  `MetaDescriptions` int(11) DEFAULT NULL,
  `CreateBy` int(11) DEFAULT NULL,
  `CreateDate` datetime NOT NULL DEFAULT current_timestamp(),
  `UpdateBy` int(11) DEFAULT NULL,
  `UpdateDate` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_productcategory`
--

CREATE TABLE `tbl_productcategory` (
  `CategoryID` int(11) NOT NULL,
  `Name` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `SeoTilte` int(250) NOT NULL,
  `Status` tinyint(4) NOT NULL DEFAULT 1,
  `Sort` int(11) NOT NULL,
  `ParentID` int(11) DEFAULT NULL,
  `MetaKeywords` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `MetaDescriptions` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `CreateBy` int(11) DEFAULT NULL,
  `CreateDate` datetime NOT NULL DEFAULT current_timestamp(),
  `UpdateBy` int(11) DEFAULT NULL,
  `UpdateDate` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_supplier`
--

CREATE TABLE `tbl_supplier` (
  `SupplierID` int(11) NOT NULL,
  `Name` varchar(250) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Email` varchar(50) COLLATE utf8mb4_unicode_ci DEFAULT NULL,
  `Phones` varchar(11) COLLATE utf8mb4_unicode_ci NOT NULL,
  `Address` varchar(250) COLLATE utf8mb4_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `UserID` int(11) NOT NULL,
  `firstName` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `lastName` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `email` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` varchar(50) COLLATE utf8mb4_unicode_ci NOT NULL,
  `phone` varchar(11) COLLATE utf8mb4_unicode_ci NOT NULL,
  `status` smallint(6) NOT NULL DEFAULT 3,
  `role` smallint(6) NOT NULL,
  `createDate` datetime NOT NULL DEFAULT current_timestamp(),
  `createBy` int(11) DEFAULT NULL,
  `UpdateDate` datetime DEFAULT NULL,
  `UpdateBy` int(11) DEFAULT NULL,
  `lastLogin` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_brand`
--
ALTER TABLE `tbl_brand`
  ADD PRIMARY KEY (`BrandID`);

--
-- Indexes for table `tbl_order`
--
ALTER TABLE `tbl_order`
  ADD PRIMARY KEY (`OrderID`),
  ADD KEY `CustommerID` (`CustommerID`);

--
-- Indexes for table `tbl_orderdetail`
--
ALTER TABLE `tbl_orderdetail`
  ADD PRIMARY KEY (`id_product`),
  ADD KEY `id_product` (`id_product`,`id_order`),
  ADD KEY `id_order` (`id_order`);

--
-- Indexes for table `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD PRIMARY KEY (`ProductID`),
  ADD UNIQUE KEY `Name` (`Name`),
  ADD KEY `CateID` (`CateID`,`BrandID`,`SupplierID`),
  ADD KEY `BrandID` (`BrandID`),
  ADD KEY `SupplierID` (`SupplierID`);

--
-- Indexes for table `tbl_productcategory`
--
ALTER TABLE `tbl_productcategory`
  ADD PRIMARY KEY (`CategoryID`),
  ADD KEY `ParentID` (`ParentID`);

--
-- Indexes for table `tbl_supplier`
--
ALTER TABLE `tbl_supplier`
  ADD PRIMARY KEY (`SupplierID`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`UserID`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_brand`
--
ALTER TABLE `tbl_brand`
  MODIFY `BrandID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_order`
--
ALTER TABLE `tbl_order`
  MODIFY `OrderID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_orderdetail`
--
ALTER TABLE `tbl_orderdetail`
  MODIFY `id_product` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_product`
--
ALTER TABLE `tbl_product`
  MODIFY `ProductID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_productcategory`
--
ALTER TABLE `tbl_productcategory`
  MODIFY `CategoryID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_supplier`
--
ALTER TABLE `tbl_supplier`
  MODIFY `SupplierID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `UserID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_order`
--
ALTER TABLE `tbl_order`
  ADD CONSTRAINT `tbl_order_ibfk_1` FOREIGN KEY (`CustommerID`) REFERENCES `tbl_user` (`UserID`);

--
-- Constraints for table `tbl_orderdetail`
--
ALTER TABLE `tbl_orderdetail`
  ADD CONSTRAINT `tbl_orderdetail_ibfk_1` FOREIGN KEY (`id_order`) REFERENCES `tbl_order` (`OrderID`),
  ADD CONSTRAINT `tbl_orderdetail_ibfk_2` FOREIGN KEY (`id_product`) REFERENCES `tbl_product` (`ProductID`);

--
-- Constraints for table `tbl_product`
--
ALTER TABLE `tbl_product`
  ADD CONSTRAINT `tbl_product_ibfk_1` FOREIGN KEY (`CateID`) REFERENCES `tbl_productcategory` (`CategoryID`),
  ADD CONSTRAINT `tbl_product_ibfk_2` FOREIGN KEY (`BrandID`) REFERENCES `tbl_brand` (`BrandID`),
  ADD CONSTRAINT `tbl_product_ibfk_3` FOREIGN KEY (`SupplierID`) REFERENCES `tbl_supplier` (`SupplierID`);

--
-- Constraints for table `tbl_productcategory`
--
ALTER TABLE `tbl_productcategory`
  ADD CONSTRAINT `tbl_productcategory_ibfk_1` FOREIGN KEY (`ParentID`) REFERENCES `tbl_productcategory` (`CategoryID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
