create database ss2_thquanLySinhVien;
use ss2_thquanLySinhVien;
create table class(
	ClassID int not null auto_increment primary key,
    ClassName varchar(60) not null,
    StartDate datetime not null,
    Status bit
);


create table Student(
	StudentId int not null auto_increment primary key,
    StudentName varchar(30) not null,
    Address varchar(50),
    Phone varchar(20),
    Status bit,
    ClassId int not null,
    foreign key (ClassId) references Class(ClassID)
);

create table Subject(
	SubId int not null auto_increment primary key,
    SubName varchar(30) not null,
    Credit tinyint not null default 1 check (Credit >= 1),
    Status bit default 1
);

create table Mark(
	MarkId int not null auto_increment primary key,
    SubId int not null,
    StudentId int not null,
    Mark float default  0 check (Mark between 0 and 100),
    ExamTimes tinyint default 1,
    Unique (SubId, StudentId),
    foreign key (SubId) references Subject (SubId),
    Foreign key (StudentId) references Student(StudentId)
);
