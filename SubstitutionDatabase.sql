-- phpMyAdmin SQL Dump
-- version 3.2.0.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 12, 2012 at 11:54 PM
-- Server version: 5.1.36
-- PHP Version: 5.3.0

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `substi`
--

-- --------------------------------------------------------

--
-- Table structure for table `teachers`
--

CREATE TABLE IF NOT EXISTS `teachers` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teach_name` varchar(60) DEFAULT NULL,
  `subject` varchar(60) DEFAULT NULL,
  `classes` varchar(200) DEFAULT NULL,
  `atendence` varchar(1) DEFAULT NULL,
  `status` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=14 ;

--
-- Dumping data for table `teachers`
--

INSERT INTO `teachers` (`id`, `teach_name`, `subject`, `classes`, `atendence`, `status`) VALUES
(1, 'Principal Sir ', 'Chemistry', '(12D)(11D)', '1', '1'),
(2, 'Vandana Dhupar', 'Biology', '(10A)(12B)(10G)(10F)(11D)(10B)', '1', '1'),
(3, 'Anita Dwivedi', 'Biology', '(9F)(10D)(10C)(9A)(11D)(12B)(10E)(9C)(10F)', '1', '1'),
(4, 'Mohit Tripathi', 'Chemistry', '(12A)(12C)(12D)(12B)(11A)', '1', '1'),
(5, 'Kiran Singh', 'Science', '(12B)(11C)(9G)(10E)(10D)', '1', '1'),
(6, 'Vidushi Dixit', 'Science', '(11B)(11D)(9D)(9G)(10A)(9A)(10G)', '1', '1'),
(7, 'Nirmala Reddy ', 'Physics', '(11A)(12B)(12A)(12C)(12D)', '1', '1'),
(8, 'Hemant Patidar ', 'Physics', '(11B)(10A)(10G)(9A)(9G)(12B)(12C)(9F)(10D)', '1', '1'),
(9, 'Arti Verma', 'Physics', '(11C)(9F)(10E)(9B)(10C)()', '1', '1'),
(10, 'Shardul Mishra', 'Physics', '(11D)(10F)(9C)(12D)(9D)(10F)(9E)(10D)', '1', '1'),
(11, 'Sargam', 'Science', '(9B)(8D)(8A)(8E)(9E)(9F)', '1', '1'),
(12, 'Swekshna Mitra', 'Science', '(10B)(9E)(8G)(9C)(10F)(10C)', '1', '1'),
(13, 'Sangeeta Wadhwa', 'Science', '(8F)(7F)(6G)(7E)(6A)', '1', '1');

-- --------------------------------------------------------

--
-- Table structure for table `timetbl`
--

CREATE TABLE IF NOT EXISTS `timetbl` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `teach_id` int(11) DEFAULT NULL,
  `day` varchar(20) DEFAULT NULL,
  `zero` varchar(10) DEFAULT NULL,
  `first` varchar(10) DEFAULT NULL,
  `second` varchar(10) DEFAULT NULL,
  `third` varchar(10) DEFAULT NULL,
  `fourth` varchar(10) DEFAULT NULL,
  `fifth` varchar(10) DEFAULT NULL,
  `sixth` varchar(10) DEFAULT NULL,
  `seventh` varchar(10) DEFAULT NULL,
  `eight` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM  DEFAULT CHARSET=latin1 AUTO_INCREMENT=66 ;

--
-- Dumping data for table `timetbl`
--

INSERT INTO `timetbl` (`id`, `teach_id`, `day`, `zero`, `first`, `second`, `third`, `fourth`, `fifth`, `sixth`, `seventh`, `eight`) VALUES
(1, 1, 'Monday', NULL, NULL, '12D', NULL, NULL, NULL, NULL, NULL, NULL),
(2, 1, 'Tuesday', '12D', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(3, 1, 'Wednesday', '11D', '11D', NULL, NULL, NULL, NULL, NULL, NULL, NULL),
(4, 1, 'Thursday', NULL, NULL, NULL, NULL, NULL, NULL, NULL, '11D', NULL),
(5, 1, 'Friday', NULL, NULL, NULL, '12D', '12D', '11D', NULL, NULL, NULL),
(6, 2, 'Monday', NULL, '10A', '10A', NULL, NULL, '12B', '12B', NULL, NULL),
(7, 2, 'Tuesday', NULL, NULL, NULL, '12B', '12B', NULL, '10A', '10G', NULL),
(8, 2, 'Wednesday', NULL, '10G', '10G', '10F', '10F', NULL, NULL, NULL, NULL),
(9, 2, 'Thursday', NULL, NULL, NULL, NULL, NULL, '11D', '11D', '10B', '10B'),
(10, 2, 'Friday', NULL, '11D', '11D', '10B', NULL, NULL, NULL, '10F', NULL),
(11, 3, 'Monday', NULL, NULL, '9F', '10D', '10D', '10C', '10C', NULL, NULL),
(12, 3, 'Tuesday', NULL, '9A', '9A', '11D', '11D', NULL, NULL, NULL, '10D'),
(13, 3, 'Wednesday', NULL, '10B', '10B', '9A', NULL, NULL, '11D', '11D', '10E'),
(14, 3, 'Thursday', NULL, '9C', '10D', '10E', '10E', NULL, NULL, '10C', NULL),
(15, 3, 'Friday', NULL, '9C', '9C', NULL, NULL, '12', '12B', '9F', '9F'),
(16, 4, 'Monday', '12A', '11A', '11A', '12C', '12C', NULL, NULL, NULL, NULL),
(17, 4, 'Tuesday', '12A', NULL, '11A', '12D', '12D', '12B', '12B', NULL, NULL),
(18, 4, 'Wednesday', NULL, NULL, '11A', '11A', '12C', '12A', '12A', NULL, NULL),
(19, 4, 'Thursday', NULL, '12D', '12D', '12A', '12A', '12B', NULL, '11A', NULL),
(20, 4, 'Friday', NULL, '12B', NULL, '12A', '12A', '11A', '11A', '12C', NULL),
(21, 5, 'Monday', NULL, '12B', '12B', '11C', '11C', '9G', '9G', NULL, NULL),
(22, 5, 'Tuesday', NULL, NULL, '12C', '12C', '11C', '11C', NULL, NULL, NULL),
(23, 5, 'Wednesday', NULL, '11C', '11C', NULL, NULL, '10E', NULL, '10D', '10D'),
(24, 5, 'Thursday', NULL, '12C', '12C', '11C', '11C', NULL, '12B', '12B', NULL),
(25, 5, 'Friday', NULL, '10E', '10E', '9G', NULL, NULL, NULL, '10D', NULL),
(26, 6, 'Monday', NULL, NULL, NULL, '11B', '11B', '11D', '11D', '9D', '9D'),
(27, 6, 'Tuesday', NULL, NULL, '11B', '9G', '9G', '11D', '11D', '9D', NULL),
(28, 6, 'Wednesday', NULL, '10A', '10A', NULL, NULL, '11D', '11D', '9A', '10G'),
(29, 6, 'Thursday', NULL, '10A', '9G', NULL, NULL, '9A', '9A', '11D', NULL),
(30, 6, 'Friday', NULL, NULL, NULL, '10G', '10G', '11D', NULL, '11B', NULL),
(31, 7, 'Monday', '12D', '12C', '12C', '12A', '12A', '11A', '11A', NULL, NULL),
(32, 7, 'Tuesday', '11A', '11A', '12D', '12A', '12A', NULL, NULL, NULL, NULL),
(33, 7, 'Wednesday', NULL, NULL, NULL, '12A', '12A', '12B', '11A', '11A', NULL),
(34, 7, 'Thursday', NULL, '11A', '11A', NULL, '12B', '12D', '12D', '12A', NULL),
(35, 7, 'Friday', NULL, '12D', '12B', '12C', '12C', NULL, NULL, '12A', NULL),
(36, 8, 'Monday', '11B', NULL, '10G', '10A', '9A', NULL, NULL, '9G', NULL),
(37, 8, 'Tuesday', NULL, '12B', '12B', NULL, '10B', '11B', '11B', NULL, NULL),
(38, 8, 'Wednesday', NULL, '9G', '9G', '11B', '11B', NULL, NULL, '10B', '10B'),
(39, 8, 'Thursday', NULL, NULL, '10C', '12C', '12C', '9F', '9F', '11C', NULL),
(40, 8, 'Friday', NULL, NULL, '12D', '10D', NULL, NULL, '11D', '11D', NULL),
(41, 9, 'Monday', NULL, '11C', '11C', '9F', NULL, '10E', '10E', NULL, NULL),
(42, 9, 'Tuesday', '11C', '12C', '12C', '9B', '9B', NULL, NULL, NULL, '10E'),
(43, 9, 'Wednesday', NULL, '10C', '10C', NULL, NULL, NULL, '11C', '11C', NULL),
(44, 9, 'Thursday', NULL, NULL, '10C', '12C', '12C', '9F', '9F', '11C', NULL),
(45, 9, 'Friday', NULL, NULL, NULL, '11C', '11C', NULL, NULL, NULL, '9B'),
(46, 10, 'Monday', '11D', NULL, NULL, '10F', '10F', '9C', '9C', NULL, NULL),
(47, 10, 'Tuesday', '11D', '12D', NULL, '9D', '9D', '10F', NULL, NULL, '9C'),
(48, 10, 'Wednesday', NULL, '9E', NULL, '11D', '11D', '12D', '12D', '9D', NULL),
(49, 10, 'Thursday', NULL, '11D', '11D', '10D', '10D', '9E', '9E', NULL, NULL),
(50, 10, 'Friday', NULL, NULL, '12D', '10D', NULL, NULL, '11D', '11D', NULL),
(51, 11, 'Monday', NULL, '9B', '9B', NULL, '8D', '8E', '8A', NULL, NULL),
(52, 11, 'Tuesday', NULL, '9E', '9E', NULL, '9F', '8E', NULL, NULL, '8A'),
(53, 11, 'Wednesday', NULL, '8D', '8E', '9E', NULL, '9F', '9F', NULL, '8A'),
(54, 11, 'Thursday', NULL, NULL, '8A', '8D', '8D', '9B', '8E', '8E', NULL),
(55, 11, 'Friday', NULL, '8D', '8D', '8A', '8A', NULL, NULL, NULL, '8E'),
(56, 12, 'Monday', NULL, '10B', '10B', '9E', NULL, NULL, NULL, '8G', '8G'),
(57, 12, 'Tuesday', NULL, '10C', '10C', NULL, '9C', NULL, '8G', NULL, '10B'),
(58, 12, 'Wednesday', NULL, '9C', '9C', NULL, NULL, '9B', '9B', '8G', '10F'),
(59, 12, 'Thursday', NULL, '8G', NULL, '10F', '10F', '9D', '9D', NULL, '9B'),
(60, 12, 'Friday', NULL, '8G', NULL, '9D', '10C', '9E', '9E', NULL, NULL),
(61, 13, 'Monday', NULL, '8F', '7F', NULL, '6G', '7E', '6A', NULL, NULL),
(62, 13, 'Tuesday', NULL, '7F', '6A', '6A', '8F', '6G', NULL, '7E', '7E'),
(63, 13, 'Wednesday', NULL, '6G', '6G', NULL, '7F', '7E', '8F', '6A', NULL),
(64, 13, 'Thursday', NULL, '8F', '8F', NULL, '6A', '7E', NULL, '6G', '7F'),
(65, 13, 'Friday', NULL, '8F', NULL, '7E', '7F', '7F', '6A', '6G', NULL);
