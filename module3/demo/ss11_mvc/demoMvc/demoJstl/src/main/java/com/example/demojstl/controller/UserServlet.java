package com.example.demojstl.controller;

import com.example.demojstl.bean.Student;
import com.example.demojstl.repository.StudentRepository;
import com.example.demojstl.repository.StudentRepositoryImpl;
import com.example.demojstl.service.StudentService;
import com.example.demojstl.service.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/user/detail")
public class UserServlet extends HttpServlet {
    private StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        Student student = null;
        List<Student> students = studentService.findAll();
        for (Student s: students) {
            if (s.getId().equals(id)) {
                student = s;
            }
        }
        request.setAttribute("student", student);
        request.setAttribute("students", students);
//        request.getRequestDispatcher("/user/detail.jsp").forward(request, response);
//        request.getRequestDispatcher("/user/detail_jstl.jsp").forward(request, response);
        request.getRequestDispatcher("/user/list.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
