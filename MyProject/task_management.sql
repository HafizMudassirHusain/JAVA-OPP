-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 02, 2022 at 08:56 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `task management`
--

-- --------------------------------------------------------

--
-- Table structure for table `new_task`
--

CREATE TABLE `new_task` (
  `Id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `Task` varchar(50) NOT NULL,
  `Due_Date` date NOT NULL,
  `Task_Name` varchar(50) NOT NULL,
  `completed` tinyint(1) DEFAULT 0
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `new_task`
--

INSERT INTO `new_task` (`Id`, `user_id`, `Task`, `Due_Date`, `Task_Name`, `completed`) VALUES
(18, 11, 'donee', '2021-12-30', 'done', 1),
(19, 11, 'Submit', '2022-01-01', 'oops project', 1),
(20, 11, 'Work', '2021-12-29', 'Done', 1),
(23, 11, 'Done', '2022-01-31', 'Oops Project	', 1),
(24, 11, 'hdfcfhy', '2022-01-18', 'dryfhxdry', 1),
(25, 11, 'rzyhhdzdrdt', '2022-01-05', 'asfff', 1),
(26, 11, '3twFaw', '2022-01-01', 'AFAf', 1),
(27, 11, 'hello', '2022-01-04', 'world', 0),
(28, 1, 'Herooooo', '2022-01-01', 'dunyaaa', 0);

-- --------------------------------------------------------

--
-- Table structure for table `signup`
--

CREATE TABLE `signup` (
  `Id` int(11) NOT NULL,
  `Name` varchar(50) DEFAULT NULL,
  `Email Address` varchar(50) DEFAULT NULL,
  `Password` varchar(50) DEFAULT NULL,
  `Confirm Password` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `signup`
--

INSERT INTO `signup` (`Id`, `Name`, `Email Address`, `Password`, `Confirm Password`) VALUES
(1, 'Hamza Haider', 'hamzahaider@gmail.com', '12345', '12345'),
(2, 'Mohammad Asad', 'asad@gmail.com', '67890', '67890'),
(8, 'Ammar Khan', 'ammar@gmail.com', '12345', '12345'),
(10, 'Kamal Awan', 'kamal@gmail.com', '12345', '12345'),
(11, 'asad', 'asad@gmail.com', '123', '123'),
(12, 'kamal', 'kamal@gmail.com', '123', '123'),
(13, 'ali', 'ali@gmail.com', '123', '123'),
(14, 'asad', 'sas', 'sas', 'sas');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `new_task`
--
ALTER TABLE `new_task`
  ADD PRIMARY KEY (`Id`),
  ADD KEY `FOREIGN KEY` (`user_id`) USING BTREE;

--
-- Indexes for table `signup`
--
ALTER TABLE `signup`
  ADD PRIMARY KEY (`Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `new_task`
--
ALTER TABLE `new_task`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `signup`
--
ALTER TABLE `signup`
  MODIFY `Id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `new_task`
--
ALTER TABLE `new_task`
  ADD CONSTRAINT `merge` FOREIGN KEY (`user_id`) REFERENCES `signup` (`Id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
