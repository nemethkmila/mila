DROP TABLE IF EXISTS KONYV;
 
CREATE TABLE KONYV (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  cim VARCHAR(250) NOT NULL,
  szerzo VARCHAR(250) NOT NULL,
  );
 
INSERT INTO KONYV (first_name, last_name, career) VALUES
  ('TestCim1', 'TestAuthor1'),
  ('TestCim2', 'TestAuthor2'),