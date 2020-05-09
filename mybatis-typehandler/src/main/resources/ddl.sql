CREATE DATABASE test;

CREATE ROLE test WITH
  LOGIN
  SUPERUSER
  INHERIT
  CREATEDB
  CREATEROLE
  REPLICATION
  ENCRYPTED PASSWORD 'md505a671c66aefea124cc08b76ea6d30bb';

CREATE SCHEMA test
    AUTHORIZATION test;

CREATE TABLE test.seller
(
    name character varying(50) COLLATE pg_catalog."default" NOT NULL,
    products character varying(10) COLLATE pg_catalog."default" NOT NULL,
    id bigint NOT NULL,
    CONSTRAINT seller_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE test.seller
    OWNER to postgres;

GRANT ALL ON TABLE test.seller TO postgres WITH GRANT OPTION;