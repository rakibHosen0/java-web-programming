package com.example.eshoppers.servlet;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "HourToSecondsServlet", value = "/second-converter")
public class HourToSecondsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/HourToSeconds/hour-form.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int hour = Integer.parseInt(request.getParameter("hour"));
        int minute = hour * 60;
        int seconds = minute * 60;
        request.setAttribute("seconds", seconds);
        request.getRequestDispatcher("/WEB-INF/HourToSeconds/seconds-result.jsp").forward(request,response);
    }
}
