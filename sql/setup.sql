create database books;
create user if not exists books identified by 'books';
grant all on books.* to 'books'@'%';
