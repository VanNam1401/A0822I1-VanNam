package com.example.exercise;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountServlet", value = "/DiscountServlet")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            Double price = Double.parseDouble(request.getParameter("price"));
            Integer discount = Integer.parseInt(request.getParameter("discount"));
            String description = request.getParameter("description");
            PrintWriter writer = response.getWriter();
            if (price != null && discount != null) {
                Double discountAmount = price * discount * 0.01;
                Double discountPrice = price - discountAmount;

                writer.println("<div>Description: " + description + "</div>");
                writer.println("<div>Discount Amount: " + discountAmount + "</div>");
                writer.println("<div>Discount Price: " + discountPrice + "</div>");
            } else {
                writer.println("Error");
            }
    }
}
