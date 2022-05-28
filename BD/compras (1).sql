-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 28-05-2022 a las 05:42:19
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `compras`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `purchase`
--

CREATE TABLE `purchase` (
  `Code` int(11) NOT NULL,
  `Product` varchar(50) NOT NULL,
  `UOM` varchar(50) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `purchase`
--

INSERT INTO `purchase` (`Code`, `Product`, `UOM`, `Quantity`, `Price`) VALUES
(1, 'niños', 'libras', -5, 15),
(2344, 'Carne', 'LB', 1480, 200),
(23449, 'Fresas', 'LB', 0, 5),
(23451, 'Manzanas', 'LB', 10, 2),
(23452, 'J', 'LB', 15, 12),
(23453, 'lok', 'LB', 30, 12),
(23454, 'MM', 'LB', 30, 2.23),
(23455, 'Cajas', 'PS', 25, 10.58);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sales`
--

CREATE TABLE `sales` (
  `Customer` varchar(200) NOT NULL,
  `Number` varchar(50) NOT NULL,
  `Remarks` varchar(200) NOT NULL,
  `Money` varchar(50) NOT NULL,
  `Total` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `sales`
--

INSERT INTO `sales` (`Customer`, `Number`, `Remarks`, `Money`, `Total`) VALUES
('Julio', '12345678', 'Toddddddddddddddddddd', '0', 155.36),
('Julio', '12345678', 'Tododdddddddddddddddddddd', 'Credit', 155.36);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`Code`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `purchase`
--
ALTER TABLE `purchase`
  MODIFY `Code` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=23456;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
