-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 17-10-2024 a las 02:05:48
-- Versión del servidor: 8.0.17
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_sistema_ventas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_cabecera_venta`
--

CREATE TABLE `tb_cabecera_venta` (
  `idCabeceraVenta` int(11) NOT NULL,
  `idCliente` int(11) NOT NULL,
  `valorPagar` double(10,2) NOT NULL,
  `fechaVenta` date NOT NULL,
  `estado` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `tb_cabecera_venta`
--

INSERT INTO `tb_cabecera_venta` (`idCabeceraVenta`, `idCliente`, `valorPagar`, `fechaVenta`, `estado`) VALUES
(1, 1, 50000.00, '2024-10-16', 1),
(2, 1, 15000.00, '2024-10-16', 1),
(3, 2, 30000.00, '2024-10-16', 1),
(4, 2, 30000.00, '2024-10-16', 1),
(5, 1, 20000.00, '2024-10-16', 1);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_cabecera_venta`
--
ALTER TABLE `tb_cabecera_venta`
  ADD PRIMARY KEY (`idCabeceraVenta`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_cabecera_venta`
--
ALTER TABLE `tb_cabecera_venta`
  MODIFY `idCabeceraVenta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
