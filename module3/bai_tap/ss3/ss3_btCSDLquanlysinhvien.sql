use ss2_thquanLySinhVien;

-- hiển thị tát cả các sinh viên có tên bắt đầu bàng 'h'
select * from student
where StudentName like 'h%';

-- hiển thị các thông tin lớp học bắt đầu t12
select * from class
where month(StartDate) = '12';

-- Hiển thị tất cả các thông tin môn học có credit trong khoảng từ 3-5
select * from subject
where Credit > 3 AND Credit < 5;

-- Thay đổi mã lớp(ClassID) của sinh viên có tên ‘Hung’ là 2
update student
set ClassId = '2'
where StudentName = 'Hung';

-- Hiển thị các thông tin
select student.StudentName, sub.SubName, mark.Mark 
from student student , subject sub, mark mark
order by mark.Mark, student.StudentName;