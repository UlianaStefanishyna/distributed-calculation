DROP SCHEMA distributed_calculation;
CREATE SCHEMA distributed_calculation;

CREATE TABLE IF NOT EXISTS calculated_data(
  id              SERIAL8 NOT NULL ,
  value           DECIMAL NOT NULL ,
  description     VARCHAR(255),
  date            TIMESTAMP NOT NULL ,

  CONSTRAINT calculated_data_PK PRIMARY KEY (id)
);
