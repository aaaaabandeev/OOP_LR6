package com.example.demo;

import java.io.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setCharacterEncoding("UTF-8");


        // Вычисление объемов тел
        String shape = request.getParameter("shape");
        double length = Double.parseDouble(request.getParameter("length"));
        double width = Double.parseDouble(request.getParameter("width"));
        double height = Double.parseDouble(request.getParameter("height"));
        double radius = Double.parseDouble(request.getParameter("radius"));

        double volume = 0;
        if ("parallelepiped".equalsIgnoreCase(shape)) {
            volume = calculateParallelepipedVolume(length, width, height);
        } else if ("cube".equalsIgnoreCase(shape)) {
            volume = calculateCubeVolume(length);
        } else if ("sphere".equalsIgnoreCase(shape)) {
            volume = calculateSphereVolume(radius);
        }

        // Остальная логика обработки запроса...

        // Перенаправление на index2.jsp с данными
        request.setAttribute("volume", volume);
        request.getRequestDispatcher("/index2.jsp").forward(request, response);
    }

    private double calculateParallelepipedVolume(double length, double width, double height) {
        return length * width * height;
    }

    private double calculateCubeVolume(double length) {
        return Math.pow(length, 3);
    }

    private double calculateSphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }
}
