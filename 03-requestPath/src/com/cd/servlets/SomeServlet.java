package com.cd.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "servlet", urlPatterns = "/servlet")
public class SomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("==============");
        //request.getRequestDispatcher("/index2.jsp").forward(request,response);
        //特殊：不能以斜杠开头
        response.sendRedirect("index2.jsp");
    }
}
