-- phpMyAdmin SQL Dump
-- version 3.3.9.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Sep 21, 2012 at 02:16 PM
-- Server version: 5.5.9
-- PHP Version: 5.2.17

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `IP`
--
CREATE DATABASE `IP` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `IP`;

-- --------------------------------------------------------

--
-- Table structure for table `doc`
--

CREATE TABLE `doc` (
  `DocID` int(3) NOT NULL,
  `DocName` varchar(100) DEFAULT NULL,
  `Department` varchar(100) DEFAULT NULL,
  `OPD_Days` char(3) DEFAULT NULL,
  PRIMARY KEY (`DocID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `doc`
--

INSERT INTO `doc` VALUES(104, 'KK Sharma', 'paed', 'TTS');
INSERT INTO `doc` VALUES(201, 'CK Sharma', 'Ortho', 'MWF');
INSERT INTO `doc` VALUES(301, 'Mr. Rawat', 'ENT', 'TTS');

-- --------------------------------------------------------

--
-- Table structure for table `marks`
--

CREATE TABLE `marks` (
  `schno` int(4) NOT NULL,
  `Maths` decimal(6,2) NOT NULL,
  `Physics` decimal(6,2) NOT NULL,
  `Chemistry` decimal(6,2) NOT NULL,
  `IP` decimal(6,2) NOT NULL,
  `Average` decimal(6,2) NOT NULL,
  PRIMARY KEY (`schno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `marks`
--

INSERT INTO `marks` VALUES(111, 90.00, 76.00, 89.00, 69.00, 81.00);
INSERT INTO `marks` VALUES(123, 50.00, 87.00, 87.00, 91.00, 78.75);
INSERT INTO `marks` VALUES(323, 60.00, 78.00, 89.00, 92.00, 79.75);
INSERT INTO `marks` VALUES(839, 80.00, 65.00, 70.00, 98.75, 78.44);
INSERT INTO `marks` VALUES(2483, 85.00, 79.00, 81.00, 91.00, 84.00);
INSERT INTO `marks` VALUES(2484, 80.00, 75.00, 69.00, 97.00, 80.25);

-- --------------------------------------------------------

--
-- Table structure for table `parents`
--

CREATE TABLE `parents` (
  `schno` int(4) NOT NULL,
  `fname` varchar(200) NOT NULL,
  `mname` varchar(200) NOT NULL,
  `contact` varchar(10) NOT NULL,
  `occupation` varchar(200) NOT NULL,
  KEY `schno` (`schno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `parents`
--

INSERT INTO `parents` VALUES(839, 'Manoj Saraf', 'Sangita Saraf', '9630112361', 'Business');
INSERT INTO `parents` VALUES(2483, 'Puneet Godha', 'Shefali Godha', '968544503', 'Builder');
INSERT INTO `parents` VALUES(2484, 'Vineet Godha', 'Sangita Godha', '9685445204', 'Lawyer');
INSERT INTO `parents` VALUES(323, 'Mr. Sachdeva', 'Mrs. Sachdeva', '9845671209', 'Hotel');
INSERT INTO `parents` VALUES(123, 'Mr. Rajpal', 'Mrs. Rajpal', '9825705882', 'Business');
INSERT INTO `parents` VALUES(111, 'Mr. Saluja', 'Mrs. Saluja ', '8537783587', 'Autoparts');

-- --------------------------------------------------------

--
-- Table structure for table `pat`
--

CREATE TABLE `pat` (
  `PatNo` int(11) NOT NULL DEFAULT '0',
  `PatName` varchar(100) DEFAULT NULL,
  `DocID` int(3) DEFAULT NULL,
  PRIMARY KEY (`PatNo`),
  KEY `DocID` (`DocID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `pat`
--

INSERT INTO `pat` VALUES(1, 'Neeraj', 301);
INSERT INTO `pat` VALUES(4, 'Vijay', 104);
INSERT INTO `pat` VALUES(5, 'Nandini', 201);

-- --------------------------------------------------------

--
-- Table structure for table `students`
--

CREATE TABLE `students` (
  `schno` int(4) NOT NULL,
  `name` varchar(200) NOT NULL,
  `dob` date NOT NULL,
  `class` varchar(4) NOT NULL,
  `subject` varchar(20) NOT NULL,
  PRIMARY KEY (`schno`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `students`
--

INSERT INTO `students` VALUES(111, 'Abhiroop Saluja', '1995-10-05', '12G', 'Commerce IP');
INSERT INTO `students` VALUES(123, 'Rahul Rajpal', '1995-12-30', '12G', 'Commerce IP');
INSERT INTO `students` VALUES(323, 'Amrit Sachdeva', '1994-10-19', '12G', 'Commerce PE');
INSERT INTO `students` VALUES(839, 'Ayush Saraf', '1996-02-29', '12B', 'PCMIP');
INSERT INTO `students` VALUES(2483, 'Surbhit Godha', '1995-07-19', '12B', 'PCMPE');
INSERT INTO `students` VALUES(2484, 'Harshit Godha', '1995-07-30', '12E', 'Commerce IP');

--
-- Constraints for dumped tables
--

--
-- Constraints for table `marks`
--
ALTER TABLE `marks`
  ADD CONSTRAINT `marks_ibfk_1` FOREIGN KEY (`schno`) REFERENCES `students` (`schno`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `parents`
--
ALTER TABLE `parents`
  ADD CONSTRAINT `parents_ibfk_1` FOREIGN KEY (`schno`) REFERENCES `students` (`schno`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `pat`
--
ALTER TABLE `pat`
  ADD CONSTRAINT `pat_ibfk_1` FOREIGN KEY (`DocID`) REFERENCES `doc` (`DocID`) ON DELETE CASCADE ON UPDATE CASCADE;
