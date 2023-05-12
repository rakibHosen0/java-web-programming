package com.example.eshoppers.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "ConverterServlet", value = "/convert")
public class ConverterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            request.getRequestDispatcher("/WEB-INF/convert.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String temperature = request.getParameter("temperature");
            if(temperature != null && temperature.length() > 0){
               double temperatureInC = Double.parseDouble(temperature) ;
                double temperatureInF = (temperatureInC * 9 / 5) + 32;
                request.setAttribute("result", temperatureInF);

            }
            request.getRequestDispatcher("WEB-INF/result.jsp").forward(request,response);



    }
}
