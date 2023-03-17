package com.example.ex10_jsp_jstl.calculator;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculatorServlet", value = "/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float first = Float.parseFloat(request.getParameter("first"));
        float second = Float.parseFloat(request.getParameter("second"));
        char operator = request.getParameter("operator").charAt(0);
        try {
            float result = Calculator.calculate(first, second, operator);
            request.setAttribute("result", result);
            request.getRequestDispatcher("/calculator/output.jsp").forward(request, response);
        } catch (Exception ex) {
            ex.getStackTrace();
        }
    }
}