package demo.service;

import ss9_mvc.model.Student;
import ss9_mvc.service.impl.IService;

public interface IStudentService extends IService<Student> {
    void display();
    Student findById(int id);
    void add();
    void delete();
    void update();
    void search();
}
