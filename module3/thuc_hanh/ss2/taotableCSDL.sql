-- create database QuanLyDiemThi_thss2;
use QuanLyDiemThi_thss2;
create table Hocsinh(
	MaHS varchar(20) PRIMARY KEY,
    TenHS varchar(50),
    NgaySinh datetime,
    Lop varchar(20),
    GT varchar(20)
);

create table MonHoc(
	MaMH varchar(20) primary key,
    TenMH varchar(50)
);

create table BangDiem(
	MaHS varchar(20),
    MaMH varchar(20),
    DiemThi int,
    NgayKT datetime,
    primary key (MaHS, MaMH),
    Foreign key (MaHS) references HocSinh(MaHS),
    foreign key (MaMH) references MonHoc(MaMH)
);

create table GiaoVien(
	MaGV varchar(20) primary key,
    TenGV varchar(20),
    SDT varchar(10)
);

alter table monhoc add MaGV varchar(20);
alter table monhoc add constraint fk_MaGv foreign key (MaGV) references GiaoVien(MaGv);