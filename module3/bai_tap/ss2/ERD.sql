-- create database ss2;
create table PHIEUXUAT (
soPX int primary key,
ngayXuat DAte
);

create table VATTU (
maVatTu int primary key,
tenVatTu varchar(45)
);

create table PHIEUNHAP (
soPN int primary key,
ngayNhap date
);

create table DONDH (
soDH int primary key,
ngayDH date
);

create table NHACC (
maNCC int primary key,
tenNCC varchar(45),
diaChi varchar(45),
soDienThoai int
);

create table chiTietphieuxuat (
sopx int,
maVatTu int,
slxuat int,
dgxuat mediumint
);

create table chitietphieunhap (
maVatTu int,
sopn int,
dgnhap mediumint,
slnhap int
);