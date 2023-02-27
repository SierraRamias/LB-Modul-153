# SierraRamias_LB151
Das Projekt is in JSF gemacht die Datenbanken wurden mit JDBC und Xammpp gemacht.
Das Projekt muss in NB geöffnet werden, wobei man es dann auf JDK 1.8 Umstellen muss.

Für das Erstellen der Datenbank sind Volgende Sql queryies von nöten

-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 27. Feb 2023 um 11:19
-- Server-Version: 10.4.22-MariaDB
-- PHP-Version: 8.0.13

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `glücksrad`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `scoreliste`
--

CREATE TABLE `scoreliste` (
  `sl_id` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `amount` int(11) NOT NULL,
  `tries` int(11) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `spieler`
--

CREATE TABLE `spieler` (
  `sp_id` int(11) NOT NULL,
  `username` varchar(64) NOT NULL,
  `password` varchar(255) NOT NULL,
  `betrag` int(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Daten für Tabelle `spieler`
--

INSERT INTO `spieler` (`sp_id`, `username`, `password`, `betrag`) VALUES
(2, 'admin', 'adminpassword', NULL);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `wörterliste`
--

CREATE TABLE `wörterliste` (
  `word_id` int(11) NOT NULL,
  `word` varchar(64) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `scoreliste`
--
ALTER TABLE `scoreliste`
  ADD PRIMARY KEY (`sl_id`);

--
-- Indizes für die Tabelle `spieler`
--
ALTER TABLE `spieler`
  ADD PRIMARY KEY (`sp_id`);

--
-- Indizes für die Tabelle `wörterliste`
--
ALTER TABLE `wörterliste`
  ADD PRIMARY KEY (`word_id`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `scoreliste`
--
ALTER TABLE `scoreliste`
  MODIFY `sl_id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT für Tabelle `spieler`
--
ALTER TABLE `spieler`
  MODIFY `sp_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT für Tabelle `wörterliste`
--
ALTER TABLE `wörterliste`
  MODIFY `word_id` int(11) NOT NULL AUTO_INCREMENT;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
