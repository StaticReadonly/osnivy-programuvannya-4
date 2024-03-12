package org.example.lab24;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "indexServlet", value = "/")
public class IndexServlet extends HttpServlet {

    public void init() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        request.setAttribute("action", action);

        switch (action){
            case "all_u":{
                request.setAttribute("res", MainService.countAllStudents());
            }
            case "most":{
                request.setAttribute("res", MainService.findFacultyWithMostStudents());
            }
            case "all_g":{
                request.setAttribute("res", MainService.findStudentsWithGrade());
            }
        }

        request.getRequestDispatcher("index.jsp").forward(request, response);
    }

    public void destroy() {
    }
}