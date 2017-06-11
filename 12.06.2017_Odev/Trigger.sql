create table MAAS 
(KISI_ID int not null,
NET_MAAS int, 
BRUT_MAAS int,
PRIMARY KEY(KISI_ID));

/*------------------------------
---------------------------------
---------------------------------*/

USE `test_db`;

DELIMITER $$

DROP TRIGGER IF EXISTS test_db.maas_BEFORE_INSERT$$
USE `test_db`$$
CREATE DEFINER=`root`@`localhost` TRIGGER `test_db`.`maas_BEFORE_INSERT` BEFORE INSERT ON `maas` FOR EACH ROW
BEGIN
/* Tabloya insert yapmadan önce brut maaşı hesaplar 
ve o sekilde inserteder*/
SET new.BRUT_MAAS = 
(NEW.NET_MAAS)*1.2;

END$$
DELIMITER ;
