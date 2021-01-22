-- phpMyAdmin SQL Dump
-- version 4.9.2
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 22 jan. 2021 à 23:29
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
-- Structure de la table `api_factures`
--

DROP TABLE IF EXISTS `api_factures`;
CREATE TABLE IF NOT EXISTS `api_factures` (
  `Ref_fact` varchar(20) NOT NULL,
  `date_expiration` date NOT NULL DEFAULT current_timestamp(),
  `prix` varchar(15) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `api_factures`
--

INSERT INTO `api_factures` (`Ref_fact`, `date_expiration`, `prix`) VALUES
('123', '2021-01-10', '12.45');

-- --------------------------------------------------------

--
-- Structure de la table `card`
--

DROP TABLE IF EXISTS `card`;
CREATE TABLE IF NOT EXISTS `card` (
  `card_number` varchar(16) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cvv` varchar(3) NOT NULL,
  `date_expiration` varchar(5) NOT NULL,
  `user_id` int(11) NOT NULL,
  `solde` varchar(10) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `card_number` (`card_number`),
  KEY `user_id` (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf16;

--
-- Déchargement des données de la table `card`
--

INSERT INTO `card` (`card_number`, `id`, `cvv`, `date_expiration`, `user_id`, `solde`) VALUES
('12345', 3, '123', '07-99', 2, '987.55'),
('1234123412341234', 4, '231', '11-23', 7, '48.700035');

-- --------------------------------------------------------

--
-- Structure de la table `compte`
--

DROP TABLE IF EXISTS `compte`;
CREATE TABLE IF NOT EXISTS `compte` (
  `id` int(11) NOT NULL,
  `id_user` int(11) NOT NULL,
  `card_number` varchar(16) NOT NULL,
  `Solde` float NOT NULL,
  PRIMARY KEY (`id`),
  KEY `card_number` (`card_number`),
  KEY `id_user` (`id_user`),
  KEY `card_number_2` (`card_number`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `compte`
--

INSERT INTO `compte` (`id`, `id_user`, `card_number`, `Solde`) VALUES
(1, 2, '12345', 90);

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
(2, 'SX13477', 'Chilouh Faouzi', 'fawzichilouh@gmail.com', 'fawzi', '0706363231', 'bd lybie el arouit nador', 0, '1999-01-25'),
(7, 'Sx15218', 'Abdelhakim chamlal', 'Abdelahkimchamlal2@gmail.com', 'test', '07015162763', 'Bd hay matar nador', 0, '2002-11-18');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `card`
--
ALTER TABLE `card`
  ADD CONSTRAINT `card_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `compte`
--
ALTER TABLE `compte`
  ADD CONSTRAINT `compte_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `users` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
