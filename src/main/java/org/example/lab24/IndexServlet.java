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
        request.getRequestDispatcher("main.jsp").forward(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String action = request.getParameter("action");
        request.setAttribute("action", action);

        switch (action){
            case "all_u":{
                var res = MainService.countAllStudents();
                request.setAttribute("res", res);
                break;
            }
            case "most":{
                var res = MainService.findFacultyWithMostStudents();
                request.setAttribute("res", res);
                break;
            }
            case "all_g":{
                var res = MainService.findStudentsWithGrade();
                request.setAttribute("res", res);
                break;
            }
        }

        request.getRequestDispatcher("main.jsp").forward(request, response);
    }

    public void destroy() {
    }
}