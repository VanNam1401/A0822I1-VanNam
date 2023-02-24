use casestudy_jsp_servlet;

select * from nhan_vien
where ho_ten like 'H%' or ho_ten like 't%' or ho_ten like 'k%' limit 15;

SELECT *
FROM khach_hang
where ((Year(CURRENT_TIMESTAMP) - Year(ngay_sinh)) between 18 and 50) 
AND (dia_chi like '%Đà Nẵng%' or dia_chi like '%Quảng Trị%');

select khach_hang.ho_ten, count(hop_dong.ma_khach_hang) as so_lan_dat
from khach_hang join loai_khach on khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
join hop_dong on khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
where loai_khach.ten_loai_khach = 'Diamond'
group by hop_dong.ma_khach_hang
order by so_lan_dat;