--liquibase formatted sql
--changeset huzefa:1
create table SUBSCRIBER
(
ID int NOT NULL PRIMARY KEY,
EMAIL varchar(255),
FIRST_NAME varchar(255),
LAST_NAME varchar(255)
)