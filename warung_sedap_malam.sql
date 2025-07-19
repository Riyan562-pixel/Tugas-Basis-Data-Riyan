-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 19 Jul 2025 pada 21.14
-- Versi server: 10.4.32-MariaDB
-- Versi PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `warung_sedap_malam`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `datakasir`
--

CREATE TABLE `datakasir` (
  `no_faktur` varchar(20) NOT NULL,
  `tanggal` varchar(20) NOT NULL,
  `nama_custemer` varchar(30) NOT NULL,
  `total_beli` decimal(11,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `datakasir`
--

INSERT INTO `datakasir` (`no_faktur`, `tanggal`, `nama_custemer`, `total_beli`) VALUES
('007', '19-07-2025', 'rahman', 65000),
('AW009', '20-07-2025', 'Fadil', 291000),
('PO0111', '20-07-2025', 'Rafli', 516000),
('rafyshis', '25-07-2025', 'Udin', 2460000),
('rau8y578', '25-07-2025', 'Fitri', 1900000),
('rd002', '21-07-2025', 'turiman', 60000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `detail_pembelian`
--

CREATE TABLE `detail_pembelian` (
  `id_detail` int(12) NOT NULL,
  `kode_masakan` varchar(11) NOT NULL,
  `nama_masakan` varchar(20) NOT NULL,
  `jumlah` decimal(20,0) NOT NULL,
  `harga` decimal(20,0) NOT NULL,
  `total` decimal(20,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `detail_pembelian`
--

INSERT INTO `detail_pembelian` (`id_detail`, `kode_masakan`, `nama_masakan`, `jumlah`, `harga`, `total`) VALUES
(1, 'KD002', 'AYAM BAKAR', 2, 20000, 40000),
(2, 'KD003', 'AYAM MADU', 12, 20000, 240000),
(3, 'KD001', 'AYAM PENYET', 12, 15000, 180000),
(6, 'KD003', 'AYAM MADU', 12, 20000, 240000),
(8, 'KD002', 'AYAM BAKAR', 12, 20000, 240000),
(11, 'KD003', 'AYAM MADU', 23, 20000, 460000),
(13, 'KD016', 'TEH TARIK', 12, 7000, 84000),
(14, 'KD011', 'ES CAMPUR', 12, 8000, 96000),
(15, 'KD009', 'MIE GORENG SPESIAL', 13, 15000, 195000),
(16, 'AY002', 'AYAM GORENG', 12, 25000, 300000),
(17, 'KD001', 'AYAM PENYET', 12, 15000, 180000),
(18, 'KD015', 'TEH COYO', 12, 3000, 36000),
(19, 'KD018', 'ES KELAPA', 12, 7000, 84000),
(20, 'KD004', 'NASI GORENG', 12, 10000, 120000),
(21, 'KD009', 'MIE GORENG SPESIAL', 3, 15000, 45000),
(22, 'KD014', 'JUS ALPUKAT', 2, 10000, 20000),
(23, 'AY00101', 'WAGYU A', 3, 1200000, 3600000);

-- --------------------------------------------------------

--
-- Struktur dari tabel `karyawan`
--

CREATE TABLE `karyawan` (
  `id_karyawan` int(11) NOT NULL,
  `nama_karyawan` varchar(20) NOT NULL,
  `ussername` varchar(12) NOT NULL,
  `shift` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `karyawan`
--

INSERT INTO `karyawan` (`id_karyawan`, `nama_karyawan`, `ussername`, `shift`) VALUES
(1, 'Riyan', 'KASIRSHIFT1', 1),
(5, 'LUTFI', 'PI1', 1),
(6, 'TIAN', 'NJANG', 2),
(7, 'INDRI', 'DRY', 2),
(8, 'ASEP', 'ASIAP', 2);

-- --------------------------------------------------------

--
-- Struktur dari tabel `login`
--

CREATE TABLE `login` (
  `id` int(20) NOT NULL,
  `id_karyawan` int(20) NOT NULL,
  `Ussername` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `login`
--

INSERT INTO `login` (`id`, `id_karyawan`, `Ussername`, `password`) VALUES
(14, 4, 'Riyan', '123'),
(16, 21, 'rahman', '123'),
(17, 34, 'kei', '123'),
(18, 9, 'yan', '123');

-- --------------------------------------------------------

--
-- Struktur dari tabel `menu_masakan`
--

CREATE TABLE `menu_masakan` (
  `id_menu` int(11) NOT NULL,
  `id_masakan` int(11) NOT NULL,
  `kode_masakan` varchar(15) NOT NULL,
  `nama_masakan` varchar(50) NOT NULL,
  `harga` int(11) NOT NULL,
  `stock` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data untuk tabel `menu_masakan`
--

INSERT INTO `menu_masakan` (`id_menu`, `id_masakan`, `kode_masakan`, `nama_masakan`, `harga`, `stock`) VALUES
(11, 1, 'KD001', 'AYAM PENYET', 15000, 9),
(12, 2, 'KD002', 'AYAM BAKAR', 20000, 9),
(13, 3, 'KD003', 'AYAM MADU', 20000, 9),
(14, 12, 'AY009', 'AYAM KAMPUS', 120000, 9),
(15, 4, 'KD004', 'NASI GORENG', 10000, 30),
(16, 5, 'KD005', 'NASI LEMAK', 10000, 30),
(17, 6, 'KD006', 'NASI KEBULI', 20000, 30),
(18, 7, 'KD007', 'CAPCAY', 12000, 30),
(19, 8, 'KD008', 'MIE GORENG BIASA', 12000, 30),
(20, 9, 'KD009', 'MIE GORENG SPESIAL', 15000, 30),
(21, 10, 'KD010', 'TAKOYAKI', 10000, 30),
(22, 11, 'KD011', 'ES CAMPUR', 8000, 40),
(23, 12, 'KD012', 'ES JERUK', 7000, 40),
(24, 13, 'KD013', 'JUS MANGGA', 8000, 40),
(25, 14, 'KD014', 'JUS ALPUKAT', 10000, 40),
(26, 15, 'KD015', 'TEH COYO', 3000, 50),
(27, 16, 'KD016', 'TEH TARIK', 7000, 40),
(28, 17, 'KD017', 'ES KUWUT', 5000, 40),
(29, 18, 'KD018', 'ES KELAPA', 7000, 40),
(30, 2, 'AY002', 'ayam goreng', 25000, 10),
(32, 1011, 'AY00101', 'WAGYU A', 1200000, 2),
(36, 21, '8', 'SATE', 10000, 5);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `datakasir`
--
ALTER TABLE `datakasir`
  ADD PRIMARY KEY (`no_faktur`);

--
-- Indeks untuk tabel `detail_pembelian`
--
ALTER TABLE `detail_pembelian`
  ADD PRIMARY KEY (`id_detail`);

--
-- Indeks untuk tabel `karyawan`
--
ALTER TABLE `karyawan`
  ADD PRIMARY KEY (`id_karyawan`);

--
-- Indeks untuk tabel `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`id`),
  ADD KEY `Ussername` (`Ussername`),
  ADD KEY `Ussername_2` (`Ussername`);

--
-- Indeks untuk tabel `menu_masakan`
--
ALTER TABLE `menu_masakan`
  ADD PRIMARY KEY (`id_menu`),
  ADD UNIQUE KEY `kode_masakan` (`kode_masakan`),
  ADD KEY `kode_masakan_2` (`kode_masakan`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `detail_pembelian`
--
ALTER TABLE `detail_pembelian`
  MODIFY `id_detail` int(12) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT untuk tabel `karyawan`
--
ALTER TABLE `karyawan`
  MODIFY `id_karyawan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT untuk tabel `login`
--
ALTER TABLE `login`
  MODIFY `id` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT untuk tabel `menu_masakan`
--
ALTER TABLE `menu_masakan`
  MODIFY `id_menu` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
