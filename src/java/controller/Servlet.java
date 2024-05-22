/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package controller;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
@WebServlet("/subjects")
public class Servlet extends HttpServlet {
    private List<Subjects> subjects = new ArrayList<>();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("subjects", subjects);
        request.getRequestDispatcher("/subjects.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String code = request.getParameter("code");
        String name = request.getParameter("name");
        String major = request.getParameter("major");

        Subjects subject = new Subjects(code, name, major);
        subjects.add(subject);

        HttpSession session = request.getSession();
        session.setAttribute("subjects", subjects);

        response.sendRedirect(request.getRequestURI());
    }
}