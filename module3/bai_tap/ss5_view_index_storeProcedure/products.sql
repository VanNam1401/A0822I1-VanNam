create database ss5_btviewindexstore;
use ss5_btviewindexstore;

create table products(
	id int primary key auto_increment,
    productCode varchar(45),
    productPrice int,
    productName varchar(45),
    productAmount int,
    productDescription varchar(45),
    productStatus tinyint
);

insert into products(productCode, productName, productAmount, productDescription, productStatus)
values('1', 'name', 1234, 'hi',1),
('2', 'name2', 1234, 'hi',1),
('3', 'name2', 1234, 'hi',1),
('4', 'name2', 1234, 'hi',1),
('5', 'name2', 1234, 'hi',1);

create unique index index_product on products(productCode);
explain products;

create index index_productName on products(productName);
create index index_productPrice on products(productPrice);

create view view_name as
select productCode, productPrice, productStatus from products;
select * from view_name;

update view_name set productStatus = '1' where productCode = 'code1';
drop view view_name;

DELIMITER //
create procedure getAll()
begin 
	select * from products;
end 
// DELIMITER ;
    
call getAll();

DELIMITER //
create procedure adds(code varchar(45), name varchar(45), price double)
begin
insert into products(productCode, productName, productPrice)
values(code, name, price);
end
// DELIMITER ;

call adds('3', 'name3', 9877);

DELIMITER //
create procedure updates(id INT, code varchar(45), name varchar(45), price double, amount int, description varchar(45), status tinyint)
begin
update products
set productName = name, productCode = code, productPrice = price, 
productAmount = amount, productDescription = description, productStatus = status
where id = id;
end
// DELIMITER ;

call updates(2, 'code', 'name4', 1, 1, 'hhh', 1);

DELIMITER //
create procedure deletes(id int)
begin 
delete from products where id = id;
end
// DELIMITER ;

call deletes(1);