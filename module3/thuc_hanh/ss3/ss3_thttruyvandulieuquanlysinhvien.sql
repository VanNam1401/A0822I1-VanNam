use ss2_thquanLySinhVien;

-- hiển thị ds tất cả các học viên
select * from student;

-- hiển thị danh sách các học viên đang theo học
select * from student 
where status = true;

-- hiển thị danh sách các môn học có thời gian học nhỏ hơn 10 giờ
select * from subject 
where Credit < 10;

-- hiển thị danh sách học viên lớp a1

select s.StudentId, s.StudentName, c.ClassName
from Student s join class c on s.ClassId = c.ClassID;

select s.StudentId, s.StudentName, c.ClassName
from Student s join class c on s.ClassId = c.ClassID
where c.ClassName = 'A1';
-- hiển thị điểm môn CF của các học viên
select s.StudentId, s.StudentName, sub.SubName, m.Mark
from student s join mark m on s.StudentId = m.StudentId join Subject sub on m.SubId = sub.SubId;

select s.StudentId, s.StudentName, sub.SubName, m.Mark
from student s join mark m on s.StudentId = m.StudentId join Subject sub on m.SubId = sub.SubId
where sub.SubName = 'CF';