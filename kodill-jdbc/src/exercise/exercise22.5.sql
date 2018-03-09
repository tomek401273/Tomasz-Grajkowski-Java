CREATE TABLE STATS (
					STAT_ID INT(11) AUTO_INCREMENT,
                    STAT_DATE DATETIME NOT NULL,
                    STAT VARCHAR(20) NOT NULL,
                    VALUE INT(11) NOT NULL,
                    PRIMARY KEY (`STAT_ID`)
                    );
#//////////////////////////////////////////////////////////////

CREATE VIEW COUNT_BEESTSELLERS AS

  SELECT COUNT(*) AS COUNT_BESTSELLERS
  FROM BOOKS
  WHERE BESTSELLER =1;
# ////////////////////////////////////////////////////////////////
DROP PROCEDURE IF EXISTS SetBest;
DELIMITER $$

CREATE PROCEDURE SetBest()
  BEGIN
    DECLARE Result INT;

    SELECT COUNT_BESTSELLERS FROM COUNT_BEESTSELLERS
    INTO Result;

    INSERT INTO STATS(STAT_DATE, STAT, VALUE)
    VALUES
      (CURDATE(),"BESTSELLERS", Result);
    SELECT Result;
  END $$

DELIMITER ;

CALL SetBest();
# /////////////////////////////////////////////////////////////////////
USE kodilla_advanced;

CREATE EVENT UPDATE_BESTSELLERS
  ON SCHEDULE EVERY 1 MINUTE
DO CALL SetBest();
# ///////////////////////////////////////////////////////////////////
SELECT * FROM kodilla_advanced.STATS;
DROP EVENT UPDATE_BESTSELLERS;
COMMIT;
