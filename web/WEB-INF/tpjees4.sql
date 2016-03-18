-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Client :  127.0.0.1
-- Généré le :  Jeu 17 Mars 2016 à 11:34
-- Version du serveur :  5.6.20
-- Version de PHP :  5.5.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de données :  `tpjees4`
--
CREATE DATABASE IF NOT EXISTS `tpjees4` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `tpjees4`;

-- --------------------------------------------------------

--
-- Structure de la table `vote`
--

DROP TABLE IF EXISTS `vote`;
CREATE TABLE IF NOT EXISTS `vote` (
`vote` int(11) NOT NULL,
  `maths` int(11) NOT NULL,
  `physique` int(11) NOT NULL,
  `chimie` int(11) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=5 ;

--
-- Contenu de la table `vote`
--

INSERT INTO `vote` (`vote`, `maths`, `physique`, `chimie`) VALUES
(1, 1, 1, 3),
(2, 2, 3, 5),
(3, 2, 2, 2),
(4, 5, 1, 3);

--
-- Index pour les tables exportées
--

--
-- Index pour la table `vote`
--
ALTER TABLE `vote`
 ADD PRIMARY KEY (`vote`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `vote`
--
ALTER TABLE `vote`
MODIFY `vote` int(11) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=5;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
