CREATE TABLE Post (
  id bigint NOT NULL AUTO_INCREMENT,
  name varchar(32) NOT NULL,
  body TEXT,
  created_at DATE NOT NULL,
  updated_at DATE NOT NULL,

  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;