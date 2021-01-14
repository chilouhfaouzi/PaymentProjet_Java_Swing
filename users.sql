-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 14 jan. 2021 à 23:16
-- Version du serveur :  10.4.10-MariaDB
-- Version de PHP :  7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `paymentbancaire`
--

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cin` varchar(7) NOT NULL,
  `fullname` varchar(100) NOT NULL,
  `Email` varchar(150) NOT NULL,
  `Password` varchar(50) NOT NULL,
  `phone` varchar(13) NOT NULL,
  `adresse` text NOT NULL,
  `type_user` tinyint(4) NOT NULL DEFAULT 0,
  `datenaissance` date NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`id`),
  UNIQUE KEY `cin` (`cin`),
  UNIQUE KEY `phone` (`phone`),
  UNIQUE KEY `Email` (`Email`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`id`, `cin`, `fullname`, `Email`, `Password`, `phone`, `adresse`, `type_user`, `datenaissance`) VALUES
(2, 'SX13477', 'Chilouh faouzi', 'fawzichilouh@gmail.com', 'fawzi', '0706363231', 'bd lybie el arouit nador', 0, '1999-01-25'),
(7, 'Sx15218', 'Abdelhakim chamlal', 'Abdelahkimchamlal2@gmail.com', 'test', '07015162763', 'Bd hay matar nador', 0, '2002-11-18');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
