package mvc.controller;

import mvc.bean.Product;
import mvc.bean.ProductType;
import mvc.service.ProductService;
import mvc.service.ProductTypeService;
import mvc.service.impl.ProductServiceImpl;
import mvc.service.impl.ProductTypeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

@WebServlet(name = "ProductController", urlPatterns = "/product")
public class ProductController extends HttpServlet {
    private ProductService service = new ProductServiceImpl();
    private ProductTypeService productTypeService = new ProductTypeServiceImpl();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null || action.trim().equals("")) {
            doGet(request, response);
            return;
        }
        switch (action) {
            case "create":
                createNewProduct(request, response);
                break;
            case "update":
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null || action.trim().equals("")) {
            action = "list";
        }
        switch (action) {
            case "create":
                showCreate(request, response);

                break;
            case "update":
            case "delete":
            case "detail":
            case "list":
            default:
                showList(request, response);
        }
    }

    private void showCreate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProductType> productTypes = Collections.EMPTY_LIST;
        try {
            productTypes = productTypeService.findAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("productTypes", productTypes);
        request.getRequestDispatcher("/WEB-INF/views/product/create.jsp").forward(request, response);
    }

    private void showList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Product> products = Collections.EMPTY_LIST;
        String sizeAsString = request.getParameter("size");
        String pageAsString = request.getParameter("page");
        int size = 5;
        int page = 1;
        if (sizeAsString != null) {
            size = Integer.parseInt(sizeAsString);
        }
        if (pageAsString != null) {
            page = Integer.parseInt(pageAsString);
        }
        int totalPage = service.countPage(size);

        try {
            if (page <= totalPage) {
                products = service.findAllWithPaging(page, size);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        if (page > 1) {
            request.setAttribute("isPrevious", true);
        }
        if (page < totalPage) {
            request.setAttribute("isNext", true);
        }

        request.setAttribute("currentPage", page);
        request.setAttribute("size", size);
        request.setAttribute("products", products);
        request.getRequestDispatcher("/WEB-INF/views/product/list.jsp").forward(request, response);
    }

    private void createNewProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        double price = Double.parseDouble(request.getParameter("price"));
        String dateAsString = request.getParameter("dateRelease");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
        String type_id = request.getParameter("type");
        ProductType type = null;
        try {
             type = productTypeService.findById(type_id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        Date dateRelease = null;
        String error = null;
        try {
            dateRelease = format.parse(dateAsString);
        } catch (ParseException e) {
            error = "Date Release sai format";
        }

        if (error == null) {
            try {
                service.create(new Product(id, name, price, dateRelease, quantity, type));
            } catch (Exception e) {
                error = e.getMessage();
            }
        }

        if (error == null) {
            response.sendRedirect("/product");
        } else {
            request.setAttribute("error", error);
            request.getRequestDispatcher("/WEB-INF/views/product/create.jsp").forward(request, response);
        }

    }
}
