use casestudy_jsp_servlet;
select * from nhan_vien
where ho_ten like 'H%' or ho_ten like 't%' or ho_ten like 'k%' limit 15;

SELECT Year(CURRENT_TIMESTAMP) - Year(ngay_sinh) AS years
FROM khach_hang
where ((Year(CURRENT_TIMESTAMP) - Year(ngay_sinh)) between 18 and 50) AND (dia_chi = 'Đà Nẵng' or dia_chi = 'Quảng Trị');