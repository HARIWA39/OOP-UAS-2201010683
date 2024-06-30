-- Create the database
CREATE DATABASE IF NOT EXISTS laundry_manager;

-- Use the database
USE laundry_manager;

-- Table structure for table admin
CREATE TABLE IF NOT EXISTS admin (
  id_admin INT(11) NOT NULL AUTO_INCREMENT,
  nama_admin VARCHAR(50) NOT NULL,
  username VARCHAR(50) NOT NULL,
  PASSWORD VARCHAR(50) NOT NULL,
  PRIMARY KEY (id_admin)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

-- Dumping data for table admin
INSERT INTO admin (id_admin, nama_admin, username, PASSWORD) VALUES
(1, 'Hari Putra Maha Dewa', 'admin', 'admin'),
(20, 'Miku', 'admin2', 'admin2');

-- Table structure for table pelanggan
CREATE TABLE IF NOT EXISTS pelanggan (
  id_pelanggan INT(11) NOT NULL AUTO_INCREMENT,
  nama_pelanggan VARCHAR(50) NOT NULL,
  alamat_pelanggan VARCHAR(50) NOT NULL,
  nomer_hp VARCHAR(20) NOT NULL,
  jenis_kelamin VARCHAR(20) NOT NULL,
  PRIMARY KEY (id_pelanggan)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

-- Dumping data for table pelanggan
INSERT INTO pelanggan (id_pelanggan, nama_pelanggan, alamat_pelanggan, nomer_hp, jenis_kelamin) VALUES
(1, 'first', 'first', '1', 'Laki-Laki'),
(2, 'deandy', 'pupuan', '085325633101', 'Laki-Laki'),
(3, 'orka', 'pupuan', '0888', 'Laki-Laki'),
(4, 'dwdode', 'kost', '085325633101', 'Laki-Laki'),
(9, 'Dodek', 'hatsu', '0888', 'Laki-Laki'),
(10, 'bobo', 'rumahku', '0998', 'Perempuan'),
(11, 'shibo', 'rumahku', '35839434', 'Laki-Laki'),
(12, 'Final', 'Final', '0000', 'Perempuan');

-- Table structure for table cucian
CREATE TABLE IF NOT EXISTS cucian (
  id_cucian INT(11) NOT NULL AUTO_INCREMENT,
  berat INT(11) NOT NULL,
  tanggal_masuk VARCHAR(20) NOT NULL,
  harga INT(11) NOT NULL,
  statuspembayaran VARCHAR(30) NOT NULL,
  statustransaksi VARCHAR(30) NOT NULL,
  tanggal_keluar VARCHAR(20) DEFAULT NULL,
  id_pelanggan INT(11) NOT NULL,
  id_admin INT(11) NOT NULL,
  PRIMARY KEY (id_cucian),
  KEY id_pelanggan (id_pelanggan),
  KEY id_admin (id_admin),
  CONSTRAINT cucian_ibfk_1 FOREIGN KEY (id_admin) REFERENCES admin (id_admin),
  CONSTRAINT cucian_ibfk_2 FOREIGN KEY (id_pelanggan) REFERENCES pelanggan (id_pelanggan)
) ENGINE=INNODB DEFAULT CHARSET=latin1;

-- Dumping data for table cucian
INSERT INTO cucian (id_cucian, berat, tanggal_masuk, harga, statuspembayaran, statustransaksi, tanggal_keluar, id_pelanggan, id_admin) VALUES
(2, 1, '20/11/2018', 5000, 'Belum Lunas', 'On Process', NULL, 1, 1),
(3, 1, '20/11/2018', 5000, 'Lunas', 'Selesai', '23/11/2018', 2, 1),
(4, 4, '22/11/2018', 20000, 'Lunas', 'Selesai', '25/11/2018', 3, 1),
(5, 3, '27/11/2018', 15000, 'Lunas', 'Selesai', '27/11/2018', 10, 1),
(6, 5, '27/11/2018', 25000, 'Lunas', 'Selesai', '28/11/2018', 11, 1),
(7, 5, '30/11/2018', 25000, 'Lunas', 'Selesai', '30/11/2018', 12, 1);

-- Auto increment values
ALTER TABLE admin AUTO_INCREMENT=24;
ALTER TABLE cucian AUTO_INCREMENT=8;
ALTER TABLE pelanggan AUTO_INCREMENT=13;