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

@WebServlet(name = "CreateServlet", value = "/create")
public class CreateServlet extends HttpServlet {
    private StudentService studentService = new StudentServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/user/create.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        int sex = Integer.parseInt(request.getParameter("sex"));
        Student student = new Student(id, name, sex);
        studentService.create(student);
        response.sendRedirect("/user/detail");
    }
}
