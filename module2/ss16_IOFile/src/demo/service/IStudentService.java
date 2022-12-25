package demo.service;

import demo.model.Student;
import demo.service.impl.IService;


public interface IStudentService extends IService<Student> {
    void display();
    Student findById(int id);
    void add();
    void delete();
    void update();
    void search();

    void create(Student student);
}
