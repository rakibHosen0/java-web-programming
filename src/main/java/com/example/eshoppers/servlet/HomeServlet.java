package com.example.eshoppers.servlet;

import com.example.eshoppers.dto.ProductDTO;
import com.example.eshoppers.repository.DummyProductRepositoryImp;
import com.example.eshoppers.services.ProductService;
import com.example.eshoppers.services.imp.ProductServiceImpl;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "/home")
public class HomeServlet extends HttpServlet {
    private final ProductService productService
            = new ProductServiceImpl(new DummyProductRepositoryImp());

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<ProductDTO> allProducts
                = productService.findAllProductSortedByName();
        request.setAttribute("products", allProducts);
        request.getRequestDispatcher("home.jsp")
                .forward(request,response);
    }
}
