package com.example.ex10_jsp_jstl.display_customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@WebServlet(name = "DisplayCustomerServlet", value = "/DisplayCustomerServlet")
public class DisplayCustomerServlet extends HttpServlet {
    private List<Customer> customers;

    @Override
    public void init() throws ServletException {
        super.init();
        customers = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
        try {
            customers.add(new Customer("Mai Văn Hoàn", formatter.parse("7-Jun-2013"), "Hà Nội", "https://t3.ftcdn.net/jpg/02/22/85/16/360_F_222851624_jfoMGbJxwRi5AWGdPgXKSABMnzCQo9RN.webp"));
            customers.add(new Customer("Nguyễn Văn Nam", formatter.parse("8-Jun-2013"), "Hà Nội", "https://img.freepik.com/free-photo/portrait-confident-young-hipster-male-asian-guy-denim-jacket-talking-friends-campus-cross-hands-chest-casual-pose-smiling-pleased-recommend-language-courses-white-wall_176420-37437.jpg?w=996&t=st=1678886067~exp=1678886667~hmac=cb6be076b68d21887f4cdae91e6c8158e32ac418e3bc4a90dc7809693df81e8c"));
            customers.add(new Customer("Nguyễn Thái Hòa", formatter.parse("9-Jun-2013"), "Hà Nội", "https://www.google.com/url?sa=i&url=https%3A%2F%2Fwww.istockphoto.com%2Fphotos%2Fportrait&psig=AOvVaw3AmBTfhmRUi5AsezOKiRfc&ust=1678973134878000&source=images&cd=vfe&ved=0CA8QjRxqFwoTCJierbqE3v0CFQAAAAAdAAAAABAE"));
            customers.add(new Customer("Trần Đăng Khoa", formatter.parse("10-Jun-2013"), "Hà Nội", "https://img.freepik.com/free-photo/confident-attractive-caucasian-guy-beige-pullon-smiling-broadly-while-standing-against-gray_176420-44508.jpg?size=626&ext=jpg"));
            customers.add(new Customer("Nguyễn Đình Thi", formatter.parse("11-Jun-2013"), "Hà Nội", "https://img.freepik.com/free-photo/men-s-blue-short-sleeves-tee-psd-mockup_53876-143240.jpg?size=626&ext=jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("customer", customers);
        request.getRequestDispatcher("/display_customer/index.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
