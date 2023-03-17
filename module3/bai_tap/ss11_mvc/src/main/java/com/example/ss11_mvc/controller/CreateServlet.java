package com.example.ss11_mvc.controller;

import com.example.ss11_mvc.bean.Product;
import com.example.ss11_mvc.service.ProductService;
import com.example.ss11_mvc.service.ProductServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CreateServlet", value = "/create")
public class CreateServlet extends HttpServlet {
    private ProductService productService = new ProductServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    // id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất.
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String nameProduct = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String describe = request.getParameter("describe");
        String producer = request.getParameter("producer");
        Product product = new Product(id, nameProduct, price, describe, producer);
        productService.create(product);
    }
}
