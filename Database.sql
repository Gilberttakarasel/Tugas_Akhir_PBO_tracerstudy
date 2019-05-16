-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               10.1.37-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win32
-- HeidiSQL Version:             9.3.0.4984
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Dumping database structure for tracerstudy
CREATE DATABASE IF NOT EXISTS `tracerstudy` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `tracerstudy`;


-- Dumping structure for table tracerstudy.lulusan
CREATE TABLE IF NOT EXISTS `lulusan` (
  `id_lulusan` varchar(9) NOT NULL,
  `nama_lulusan` varchar(30) DEFAULT NULL,
  `tanggal_lahir` varchar(20) DEFAULT NULL,
  `jenjang` varchar(3) DEFAULT NULL,
  `program_studi` varchar(25) DEFAULT NULL,
  `email` varchar(35) DEFAULT NULL,
  `alamat` varchar(20) DEFAULT NULL,
  `no_tlp` varchar(13) DEFAULT NULL,
  `ipk` varchar(4) DEFAULT NULL,
  PRIMARY KEY (`id_lulusan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table tracerstudy.lulusan: ~0 rows (approximately)
DELETE FROM `lulusan`;
/*!40000 ALTER TABLE `lulusan` DISABLE KEYS */;
INSERT INTO `lulusan` (`id_lulusan`, `nama_lulusan`, `tanggal_lahir`, `jenjang`, `program_studi`, `email`, `alamat`, `no_tlp`, `ipk`) VALUES
	('1', 'Gilbert', '15 Desember 1999', 'S1', 'AI', 'gilbert@gmail.cpm', 'jalan Guru', '082290805264', '3');
/*!40000 ALTER TABLE `lulusan` ENABLE KEYS */;


-- Dumping structure for table tracerstudy.p2m
CREATE TABLE IF NOT EXISTS `p2m` (
  `id_p2m` varchar(9) NOT NULL,
  `id_lulusan` varchar(9) NOT NULL,
  `jenis_p2m` varchar(32) DEFAULT NULL,
  `tempat` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id_p2m`),
  KEY `FK_pengolahan p2m_pengolahan lulusan` (`id_lulusan`),
  CONSTRAINT `FK_pengolahan p2m_pengolahan lulusan` FOREIGN KEY (`id_lulusan`) REFERENCES `lulusan` (`id_lulusan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table tracerstudy.p2m: ~0 rows (approximately)
DELETE FROM `p2m`;
/*!40000 ALTER TABLE `p2m` DISABLE KEYS */;
/*!40000 ALTER TABLE `p2m` ENABLE KEYS */;


-- Dumping structure for table tracerstudy.pekerjaan
CREATE TABLE IF NOT EXISTS `pekerjaan` (
  `id_pekerjaan` varchar(9) NOT NULL,
  `id_lulusan` varchar(9) NOT NULL,
  `jenis_pekerjaan` varchar(35) DEFAULT NULL,
  `alamat_pekerjaan` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_pekerjaan`),
  KEY `id_lulusan` (`id_lulusan`),
  CONSTRAINT `FK_pengelohan pekerjaan_pengolahan lulusan` FOREIGN KEY (`id_lulusan`) REFERENCES `lulusan` (`id_lulusan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table tracerstudy.pekerjaan: ~0 rows (approximately)
DELETE FROM `pekerjaan`;
/*!40000 ALTER TABLE `pekerjaan` DISABLE KEYS */;
/*!40000 ALTER TABLE `pekerjaan` ENABLE KEYS */;


-- Dumping structure for table tracerstudy.prestasi
CREATE TABLE IF NOT EXISTS `prestasi` (
  `id_prestasi` varchar(9) NOT NULL,
  `id_lulusan` varchar(9) NOT NULL,
  `jenis_prestasi` varchar(32) DEFAULT NULL,
  `nama_kegiatan` varchar(32) DEFAULT NULL,
  `peringkat` varchar(2) DEFAULT NULL,
  PRIMARY KEY (`id_prestasi`),
  KEY `FK_pengolahan prestasi_pengolahan lulusan` (`id_lulusan`),
  CONSTRAINT `FK_pengolahan prestasi_pengolahan lulusan` FOREIGN KEY (`id_lulusan`) REFERENCES `lulusan` (`id_lulusan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table tracerstudy.prestasi: ~0 rows (approximately)
DELETE FROM `prestasi`;
/*!40000 ALTER TABLE `prestasi` DISABLE KEYS */;
/*!40000 ALTER TABLE `prestasi` ENABLE KEYS */;


-- Dumping structure for table tracerstudy.ta
CREATE TABLE IF NOT EXISTS `ta` (
  `id_ta` varchar(9) NOT NULL,
  `id_lulusan` varchar(9) NOT NULL,
  `judul` varchar(32) DEFAULT NULL,
  `pembimbing` varchar(32) DEFAULT NULL,
  PRIMARY KEY (`id_ta`),
  KEY `FK_pengolahan ta_pengolahan lulusan` (`id_lulusan`),
  CONSTRAINT `FK_pengolahan ta_pengolahan lulusan` FOREIGN KEY (`id_lulusan`) REFERENCES `lulusan` (`id_lulusan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table tracerstudy.ta: ~0 rows (approximately)
DELETE FROM `ta`;
/*!40000 ALTER TABLE `ta` DISABLE KEYS */;
/*!40000 ALTER TABLE `ta` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
