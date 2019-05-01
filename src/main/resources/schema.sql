DROP TABLE IF EXISTS diretor;
 
CREATE TABLE IF NOT EXISTS diretor (
  id              INT     NOT NULL PRIMARY KEY,
  nome       	  VARCHAR(200) NOT NULL,
  datanascimento  DATE,
  nomefilme      VARCHAR(200) NOT NULL,
  anofilme		 VARCHAR(10) NOT NULL,
);