-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 15, 2023 at 06:21 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `school_management`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `id` int(11) NOT NULL,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`id`, `username`, `password`) VALUES
(1, 'kapil', '12345'),
(2, 'admin', '12345');

-- --------------------------------------------------------

--
-- Table structure for table `staff`
--

CREATE TABLE `staff` (
  `id` int(11) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `date_of_birth` date NOT NULL,
  `gender` varchar(10) NOT NULL,
  `father_name` varchar(100) NOT NULL,
  `mother_name` varchar(100) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `join_date` date NOT NULL,
  `designation` varchar(200) NOT NULL,
  `salary` varchar(45) NOT NULL,
  `aca_quali` text NOT NULL,
  `experience` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `staff`
--

INSERT INTO `staff` (`id`, `first_name`, `last_name`, `date_of_birth`, `gender`, `father_name`, `mother_name`, `contact`, `email`, `address`, `join_date`, `designation`, `salary`, `aca_quali`, `experience`) VALUES
(1, 'kapil', 'dev', '2002-08-10', 'Male', 'khenraj', 'jhdjfkh', '03353020056', 'kapil@gmail.com', 'shewani mohalla', '2022-02-05', 'student', '100000000', 'bachelors', 2),
(2, 'ammad', 'sheikh', '0000-00-00', 'Male', 'jhskjfh', 'khskjdhf', '00000000000', 'hkdfjh@gmail.com', 'n,fnsd,mnfds,mnf', '2022-05-20', 'student', '2000000', 'bacherlors', 2);

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `id` int(11) NOT NULL,
  `class_roll` varchar(45) DEFAULT NULL,
  `first_name` varchar(45) NOT NULL,
  `last_name` varchar(45) NOT NULL,
  `date_of_birth` date NOT NULL,
  `gender` varchar(45) NOT NULL,
  `father_name` varchar(100) NOT NULL,
  `father_occu` varchar(100) NOT NULL,
  `mother_name` varchar(100) NOT NULL,
  `mother_occu` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `date_of_adm` date NOT NULL,
  `adm_class` varchar(100) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `photo_path` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `student`
--

INSERT INTO `student` (`id`, `class_roll`, `first_name`, `last_name`, `date_of_birth`, `gender`, `father_name`, `father_occu`, `mother_name`, `mother_occu`, `address`, `date_of_adm`, `adm_class`, `contact`, `photo_path`) VALUES
(1, '1', 'kapil', 'malhi', '2002-08-10', 'Male', 'khenraj', 'teacher', 'kamla', 'housewife', 'umerkot', '2023-01-01', 'Class 1', '03353820053', 'C:\\Users\\kapil\\Desktop\\images.jpg'),
(2, '1', 'jfdshj', 'jkhfkjsdh', '2024-05-20', 'Male', 'jdshkjfh', 'jkhsdkjfh', 'kjshdkjfhwq', 'jhkjsdh', 'jhskdjfhkjs	', '2023-05-05', 'Class 10', '03353003556', 'C:\\Users\\kapil\\Downloads\\IMG20221220124703 (1).jpg');

-- --------------------------------------------------------

--
-- Table structure for table `teacher`
--

CREATE TABLE `teacher` (
  `id` int(11) NOT NULL,
  `first_name` varchar(100) NOT NULL,
  `last_name` varchar(100) NOT NULL,
  `date_of_birth` date NOT NULL,
  `gender` varchar(10) NOT NULL,
  `father_name` varchar(100) NOT NULL,
  `mother_name` varchar(100) NOT NULL,
  `contact` varchar(15) NOT NULL,
  `email` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `join_date` date NOT NULL,
  `designation` varchar(200) NOT NULL,
  `salary` varchar(45) NOT NULL,
  `aca_quali` text NOT NULL,
  `experience` int(11) NOT NULL,
  `graduate` varchar(300) DEFAULT NULL,
  `postgraduate` varchar(300) DEFAULT NULL,
  `doctorate` varchar(300) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Dumping data for table `teacher`
--

INSERT INTO `teacher` (`id`, `first_name`, `last_name`, `date_of_birth`, `gender`, `father_name`, `mother_name`, `contact`, `email`, `address`, `join_date`, `designation`, `salary`, `aca_quali`, `experience`, `graduate`, `postgraduate`, `doctorate`) VALUES
(1, 'djhafkh', 'jhkfjdshf', '2002-08-10', 'Male', 'kdsfkjlj', 'kjdslkfjl', '03353002556', 'shdkjah@gmail.com', 'kjdslfjlsdjl', '2023-01-14', 'jklsdjfklj', '4545', 'sdfdff', 445, 'NA', 'NA', 'NA'),
(2, 'fdsfadshfakj', 'hfksdhfkhj', '2005-04-05', 'Male', 'dafkj', 'kjlsdjflk', '000000000000', 'jsfljs@gmail.com', 'lkjdslkflksdlkf', '2022-05-06', 'dsfdsdf', '45465', 'kjdsafljda', 5, 'sfdsfsdfsd', 'NA', 'NA');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `staff`
--
ALTER TABLE `staff`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `teacher`
--
ALTER TABLE `teacher`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `staff`
--
ALTER TABLE `staff`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT for table `student`
--
ALTER TABLE `student`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `teacher`
--
ALTER TABLE `teacher`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
