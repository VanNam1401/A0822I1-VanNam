-- create database ss2_demo;
create table NhanVien(
	MaNV int primary key,
    HoTenNV nvarchar(50),
    GioiTinh bit,
    QueQuan nvarchar(100) default N'Đà Nẵng',
    Tuoi int check (Tuoi >=18)
);
create table LoaiSp(
	MaLoaiSP varchar(10),
    TenLoaiSP nvarchar(100),
	constraint pk_maloaisp primary key (MaLoaiSP)
);
alter table LoaiSp add constraint primary key (MaLoaiSP);
create table sanpham(
	MaSP int primary key,
    TenSP nvarchar(50),
    MaloaiSP varchar(10),
    GiaBan int,
    constraint fk_sanpham_loaisp foreign key (MaloaiSP)
    references loaisp(MaLoaiSP)
);
create table banhang(
	MaNV int,
    MaSP int,
    SoLuongDaBan int check (SoLuongDaBan >0),
    constraint primary key (MaNV, MaSP),
    constraint fk_banhang_sp foreign key (MaSP)
    references sanpham(MaSP)
);
alter table banhang add constraint pk_banhang_nv
foreign key (MaNV) references nhanvien(MaNV);
alter table banhang add note text;

select *from nhanvien
where HoTenNV like 'Nguyen%';
select *from nhanvien
where HoTenNV like '_____'; -- %_
