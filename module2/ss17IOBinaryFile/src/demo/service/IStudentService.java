package demo.service;


import demo.model.Student;

public interface IStudentService {
    void display();
    Student findById(int id);
    void add();
    void delete();
    void update();
    void search();
}
