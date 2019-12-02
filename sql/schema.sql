USE DATABASE  books;
CREATE TABLE publishers
(
    publisher_id integer auto_increment primary key,
    name         VARCHAR(255) NOT NULL
);