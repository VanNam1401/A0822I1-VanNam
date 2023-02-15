create database a0822i1;
-- use a0822i1;
create table SinhVien(
	MaSV varchar(10) primary key,
    HoTenSV varchar(50),
    GioiTinh bit,
    NgaySinh date,
    GhiChu text
);
insert into SinhVien value
('SV001', 'Tan', 0,'1998-06-02', null);
select * from sinhvien;
update sinhvien
set NgaySinh = '1996-06-02'
where MaSV = 'SV001';

delete from sinhvien
where MaSV = 'SV001';