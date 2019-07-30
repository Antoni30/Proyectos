-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-07-2019 a las 01:47:13
-- Versión del servidor: 10.3.16-MariaDB
-- Versión de PHP: 7.2.20

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `login`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `username` varchar(50) NOT NULL,
  `pass` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` varchar(50) NOT NULL,
  `id` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`username`, `pass`, `nombre`, `direccion`, `telefono`, `id`) VALUES
('artoapanta', '5675e76814f18e94f64a6d2ac16ee955371f4d06', 'Antoni', 'Quito', '0912457365', 0),
('Carlos', 'ab5e2bca84933118bbc9d48ffaccce3bac4eeb64', 'Carlos Daniel', 'Quito', '0997154630', 0),
('Gabi', '5675e76814f18e94f64a6d2ac16ee955371f4d06', 'Gabriela Alejandra', 'Calderon', '0979736067', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
