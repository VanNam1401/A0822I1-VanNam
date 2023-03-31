package com.example.test.controller;

import com.example.test.model.Staff;
import com.example.test.repository.StaffRepository;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "Servlet", value = "/staff")
public class Servlet extends HttpServlet {
    private StaffRepository database;

    @Override
    public void init() throws ServletException {
        database = new StaffRepository();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showNewForm(request, response);
                break;
            case "update":
                break;
            case "search":
                break;
            default:
                listAll(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void listAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Staff> staffList = database.selectAll();
        request.setAttribute("staffList", staffList);
        request.getRequestDispatcher("/staff/list.jsp").forward(request, response);
    }

    private void showNewForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/staff/create.jsp").forward(request, response);
    }
}
