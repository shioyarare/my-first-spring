CREATE TABLE Post (
  id bigint NOT NULL,
  name varchar(32) NOT NULL,
  body TEXT,
  created_at DATE NOT NULL,
  updated_at DATE NOT NULL,

  PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;