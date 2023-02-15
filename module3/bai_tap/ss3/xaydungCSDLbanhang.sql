-- create database ss2_btquanlybanhang;
use ss2_btquanlybanhang;
create table customer(
	cID INT NOT NULL auto_increment,
    cNAME varchar(50),
    cAGE int default 0 check (cAGE < 0),
    primary key(cID)
);
create table product(
	pID INT NOT NULL,
    pNAME varchar(50),
    pPRICE INT default 0,
    primary key (pID)
);
create table orders(
	oID INT NOT NULL,
    cID INT NOT NULL auto_increment,
    oDATE DATE,
    oTOTALPRICE mediumint,
    primary key(oID),
    foreign key (cID) references customer(cID)
);
create table OrderDetail(
	oID int not null,
    pID int not null,
    odQTY varchar(50),
    constraint pk_orderDetail primary key (oID, pID),
    foreign key (oID) references orders(oID),
    foreign key (pID) references product(pID)
);