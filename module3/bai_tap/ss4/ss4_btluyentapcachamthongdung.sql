use ss2_thquanLySinhVien;
-- Hiển thị tất cả các thông tin môn học (bảng subject) có credit lớn nhất.
select s.SubName as 'Ten mon hoc' , 
max(s.Credit) as 'Credit'
from subject s
group by s.SubName;

-- Hiển thị các thông tin môn học có điểm thi lớn nhất.
select s.SubName as 'Ten mon hoc', max(m.Mark) as 'Diem cao nhat'
from subject s join mark m on s.SubId = m.SubId
group by s.SubName;

-- Hiển thị các thông tin sinh viên và điểm trung bình của mỗi sinh viên, xếp hạng theo thứ tự điểm giảm dần
select s.StudentName, avg(Mark)
from student s join mark m on m.StudentId = s.StudentId
group by s.StudentName
order by avg(Mark) desc;