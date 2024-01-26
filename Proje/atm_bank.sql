-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 25 Oca 2024, 11:44:03
-- Sunucu sürümü: 10.4.32-MariaDB
-- PHP Sürümü: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `atm_bank`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kredi_tablo`
--

CREATE TABLE `kredi_tablo` (
  `id` int(11) NOT NULL,
  `kullanici_id` int(11) NOT NULL,
  `tarih` varchar(11) NOT NULL,
  `tur` varchar(20) NOT NULL,
  `borc` decimal(10,2) NOT NULL,
  `borc_durum` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kredi_tablo`
--

INSERT INTO `kredi_tablo` (`id`, `kullanici_id`, `tarih`, `tur`, `borc`, `borc_durum`) VALUES
(14, 17, '2024-01-23', 'İhtiyaç kredisi.', 500.00, 1),
(15, 19, '2024-01-23', 'İhtiyaç kredisi.', 2500.00, 1),
(16, 13, '2024-01-23', 'İhtiyaç kredisi.', 11000.00, 1),
(27, 9, '2024-01-24', 'İhtiyaç kredisi.', 7500.00, 1),
(28, 20, '2024-01-24', 'Öğrenci kredisi.', 17500.00, 1),
(29, 21, '2024-01-24', 'Öğrenci kredisi.', 0.00, 1),
(30, 22, '2024-01-24', 'Öğrenci kredisi.', 0.00, 1);

--
-- Tetikleyiciler `kredi_tablo`
--
DELIMITER $$
CREATE TRIGGER `kredi_guncelleme` BEFORE UPDATE ON `kredi_tablo` FOR EACH ROW BEGIN
    DECLARE tarih_diff INT;
    SET tarih_diff = DATEDIFF(NOW(), STR_TO_DATE(NEW.tarih, '%Y-%m-%d'));
    IF tarih_diff > 30 THEN
        SET NEW.borc = NEW.borc * 1.22; -- %22'lik faiz artışı
    END IF;
END
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanicilar`
--

CREATE TABLE `kullanicilar` (
  `kullanici_ID` int(11) NOT NULL,
  `ad_soyad` varchar(50) NOT NULL,
  `tc_no` varchar(11) NOT NULL,
  `tel_no` varchar(11) NOT NULL,
  `guvenlik_sorusu` varchar(75) NOT NULL,
  `guvenlik_cevap` varchar(75) NOT NULL,
  `musteri_no` varchar(20) NOT NULL,
  `sifre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kullanicilar`
--

INSERT INTO `kullanicilar` (`kullanici_ID`, `ad_soyad`, `tc_no`, `tel_no`, `guvenlik_sorusu`, `guvenlik_cevap`, `musteri_no`, `sifre`) VALUES
(9, 'Gürkan Şahin', '11111111111', '66666666668', 'İlkokulda en sevdiğiniz ders?', 'Matematik', '1', '1045'),
(10, 'Mehmet Gültaş', '33333333334', '55555555555', 'Evcil hayvanınızın adı?', 'Robert', '7834896', '2650'),
(11, 'Serhat Mert', '77777777777', '55555555555', 'Ya da rastgele cümle girin(önerilen)', 'deneme', '2', '3469'),
(12, 'aeaa aga', '88888888888', '99999999999', 'Evcil hayvanınızın adı?', 'sfafsa', '6047274', '5905'),
(13, 'Mehtap Ayaz', '55555555555', '33333398333', 'Evcil hayvanınızın adı?', 'toni', '3', '3'),
(14, 'aasgag asgags', '99999999999', '99999999997', 'Evcil hayvanınızın adı?', 'sfasfasf', '5624017', '4525'),
(15, 'agasg asffa', '33333333333', '23555555555', 'Evcil hayvanınızın adı?', 'asfafa', '5', '1332'),
(16, 'sacnasvk afsasf', '98877777777', '63544444444', 'Evcil hayvanınızın adı?', 'sfafasf', '8', '8'),
(17, 'Gürkan Şahin', '05344444444', '20354499999', 'Evcil hayvanınızın adı?', 'Mavi', '1045', '9363'),
(18, 'asgasg afasf', '02222222222', '03448888888', 'Evcil hayvanınızın adı?', 'asas', '5945326', '3963'),
(19, 'safas aasf', '05555555555', '65888888888', 'En sevdiğiniz nesne?', 'safasf', '11', '11'),
(20, 'Gürkan Sahinn', '07777777777', '65489999984', 'İlkokulda en sevdiğiniz ders?', 'Matematik', '9342089', '4434'),
(21, 'Ali veli', '04444444444', '5364788889', 'Evcil hayvanınızın adı?', 'Mavi', '6', '7896'),
(22, 'Mehmet Şahin', '05646666666', '88888888889', 'En sevdiğiniz nesne?', 'Matematik', '5551154', '1045'),
(23, 'Gürkan Şahin', '05469875555', '56354899997', 'Ya da rastgele cümle girin(önerilen)', 'Selam', '6317144', '6386');

--
-- Tetikleyiciler `kullanicilar`
--
DELIMITER $$
CREATE TRIGGER `bakiye_ekle` AFTER INSERT ON `kullanicilar` FOR EACH ROW INSERT INTO kullanici_bakiye(kullanici_ID,bakiye,musteri_no) VALUES(NEW.kullanici_ID,0,NEW.musteri_no)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `bakiye_sil` AFTER DELETE ON `kullanicilar` FOR EACH ROW DELETE FROM kullanici_bakiye
WHERE kullanici_id=OLD.kullanici_ID
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `fatura_ekle` AFTER INSERT ON `kullanicilar` FOR EACH ROW INSERT INTO kullanici_faturalar(kullanici_ID,elektrik,su,dogalgaz,internet)
VALUES(
NEW.kullanici_ID,
    35 +RAND()*450,
    35 +RAND()*450,
    35 +RAND()*450,
    35 +RAND()*450
)
$$
DELIMITER ;
DELIMITER $$
CREATE TRIGGER `fatura_sil` AFTER DELETE ON `kullanicilar` FOR EACH ROW DELETE FROM kullanici_faturalar
WHERE kullanici_id=OLD.kullanici_ID
$$
DELIMITER ;

-- --------------------------------------------------------

--
-- Görünüm yapısı durumu `kullanicilarr`
-- (Asıl görünüm için aşağıya bakın)
--
CREATE TABLE `kullanicilarr` (
`kullanici_ID` int(11)
,`ad_soyad` varchar(50)
,`tc_no` varchar(11)
,`tel_no` varchar(11)
,`guvenlik_sorusu` varchar(75)
,`guvenlik_cevap` varchar(75)
,`musteri_no` varchar(20)
,`sifre` varchar(50)
);

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici_bakiye`
--

CREATE TABLE `kullanici_bakiye` (
  `id` int(11) NOT NULL,
  `kullanici_id` int(11) NOT NULL,
  `bakiye` decimal(10,2) NOT NULL,
  `musteri_no` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kullanici_bakiye`
--

INSERT INTO `kullanici_bakiye` (`id`, `kullanici_id`, `bakiye`, `musteri_no`) VALUES
(3, 9, 4376.89, '8781375'),
(4, 10, 480.31, '7834896'),
(5, 11, 243.41, '9578178'),
(6, 12, 597.23, '6047274'),
(7, 13, 0.00, '4295378'),
(8, 14, 126.19, '5624017'),
(9, 15, 37.95, '1844572'),
(10, 16, 402.93, '8291405'),
(11, 17, 17513.09, '3201822'),
(12, 18, 1000.00, '5945326'),
(13, 19, 7500.00, '5916433'),
(14, 20, 5318.44, '9342089'),
(15, 21, 8428.38, '7425900'),
(16, 22, 8838.36, '5551154'),
(17, 23, 0.00, '6317144');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `kullanici_faturalar`
--

CREATE TABLE `kullanici_faturalar` (
  `id` int(11) NOT NULL,
  `kullanici_id` int(11) NOT NULL,
  `elektrik` decimal(10,2) NOT NULL,
  `su` decimal(10,2) NOT NULL,
  `dogalgaz` decimal(10,2) NOT NULL,
  `internet` decimal(10,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `kullanici_faturalar`
--

INSERT INTO `kullanici_faturalar` (`id`, `kullanici_id`, `elektrik`, `su`, `dogalgaz`, `internet`) VALUES
(2, 9, 0.00, 0.00, 0.00, 0.00),
(3, 10, 335.14, 0.00, 387.14, 0.00),
(4, 11, 0.00, 0.00, 186.68, 0.00),
(5, 12, 0.00, 0.00, 0.00, 0.00),
(6, 13, 87.32, 47.45, 390.31, 424.17),
(7, 14, 423.16, 0.00, 0.00, 0.00),
(8, 15, 0.00, 0.00, 304.57, 0.00),
(9, 16, 0.00, 0.00, 0.00, 0.00),
(10, 17, 0.00, 0.00, 0.00, 0.00),
(11, 18, 210.00, 387.49, 372.45, 214.79),
(12, 19, 314.23, 168.74, 316.02, 138.90),
(13, 20, 0.00, 0.00, 401.15, 252.93),
(14, 21, 0.00, 0.00, 128.55, 297.07),
(15, 22, 0.00, 0.00, 203.76, 431.17),
(16, 23, 178.89, 205.90, 457.84, 286.52);

-- --------------------------------------------------------

--
-- Görünüm yapısı `kullanicilarr`
--
DROP TABLE IF EXISTS `kullanicilarr`;

CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost` SQL SECURITY DEFINER VIEW `kullanicilarr`  AS SELECT `kullanicilar`.`kullanici_ID` AS `kullanici_ID`, `kullanicilar`.`ad_soyad` AS `ad_soyad`, `kullanicilar`.`tc_no` AS `tc_no`, `kullanicilar`.`tel_no` AS `tel_no`, `kullanicilar`.`guvenlik_sorusu` AS `guvenlik_sorusu`, `kullanicilar`.`guvenlik_cevap` AS `guvenlik_cevap`, `kullanicilar`.`musteri_no` AS `musteri_no`, `kullanicilar`.`sifre` AS `sifre` FROM `kullanicilar` ;

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `kredi_tablo`
--
ALTER TABLE `kredi_tablo`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kullanici_id` (`kullanici_id`);

--
-- Tablo için indeksler `kullanicilar`
--
ALTER TABLE `kullanicilar`
  ADD PRIMARY KEY (`kullanici_ID`),
  ADD UNIQUE KEY `tc_no` (`tc_no`),
  ADD UNIQUE KEY `musteri_no` (`musteri_no`);

--
-- Tablo için indeksler `kullanici_bakiye`
--
ALTER TABLE `kullanici_bakiye`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kullanici_id` (`kullanici_id`),
  ADD UNIQUE KEY `musteri_no` (`musteri_no`);

--
-- Tablo için indeksler `kullanici_faturalar`
--
ALTER TABLE `kullanici_faturalar`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `kullanici_id` (`kullanici_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `kredi_tablo`
--
ALTER TABLE `kredi_tablo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- Tablo için AUTO_INCREMENT değeri `kullanicilar`
--
ALTER TABLE `kullanicilar`
  MODIFY `kullanici_ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=24;

--
-- Tablo için AUTO_INCREMENT değeri `kullanici_bakiye`
--
ALTER TABLE `kullanici_bakiye`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- Tablo için AUTO_INCREMENT değeri `kullanici_faturalar`
--
ALTER TABLE `kullanici_faturalar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
