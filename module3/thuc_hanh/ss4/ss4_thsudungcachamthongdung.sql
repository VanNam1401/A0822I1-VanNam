use ss2_thquanLySinhVien;

-- hiển thị số lượng sinh viên ở từng nơi
select Address, count(StudentID) as 'So luong sinh vien'
from student
group by address;

--  Tính điểm trung bình các môn học của mỗi học viên
select s.studentId, s.StudentName, avg(Mark) as 'Diem trung binh'
from student s join mark m on s.StudentId = m.StudentId
group by s.StudentId, s.StudentName;

-- Hiển thị những bạn học viên co điểm trung bình các môn học lớn hơn 15
select s.StudentId, s.StudentName, avg(Mark)
from Student s join mark m on s.StudentId = m.StudentId
group by s.StudentId, s.StudentName
having avg(Mark) > 15;

-- Hiển thị thông tin các học viên có điểm trung bình lớn nhất
select s.StudentId, s.StudentName, avg(Mark)
from student s join mark m on s.StudentId = m.StudentId
group by s.StudentId, s.StudentName
having avg(Mark) >= all (select avg(Mark) from mark group by mark.StudentId);

