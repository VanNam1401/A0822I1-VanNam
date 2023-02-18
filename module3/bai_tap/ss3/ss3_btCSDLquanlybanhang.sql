-- create database ss3_btquanlybanhang;
use ss3_btquanlybanhang;
select * from customer;
create table customer(
	cID int primary key,
    Name varchar(25),
    cAge tinyint
);

create table Orders(
	oID int primary key,
    cID int,
    oDate datetime,
    oTotalPrice int,
    foreign key (cID) references customer(cID)
);

create table product(
	pID int primary key,
    pName varchar(25),
    pPrice int
);	
create table OrderDetail(
	oID int,
    pID int,
    odQTY int,
    foreign key (oID) references orders(oID),
    foreign key (pID) references product(pID)
);

insert into customer 
values(1, 'Minh Quan', 10),
(2, 'Ngoc Oanh', 20),
(3, 'Hong Ha', 50);
insert into orders
values(1, 1, '2006-03-21', null),
(2, 2, '2006-03-23', null),
(3, 1, '2006-03-16', null);
insert into product
values (1, 'May Giat', 3),
(2, 'Tu Lanh', 5),
(3, 'Dieu Hoa', 7),
(4, 'Quat', 1),
(5, 'Bep Dien', 2);
insert into orderdetail
values (1, 1, 3),
(1, 3, 7),
(1, 4, 2),
(2, 1, 1),
(3, 1, 8),
(2, 5, 4),
(2, 3, 3);

-- Hiển thị các thông tin  gồm oID, oDate, oPrice
select oID, oDate, oTotalPrice from orders;

-- Hiển thị danh sách các khách hàng đã mua hàng, và danh sách sản phẩm được mua
select c.Name, p.pName
from customer c join orders o on c.id = o.cID 
join  orderdetail od on o.id = od.oID 
join product p on od.pID = p.ID;

-- Hiển thị tên những khách hàng không mua bất kỳ một sản phẩm nào

-- Hiển thị mã hóa đơn, ngày bán và giá tiền của từng hóa đơn