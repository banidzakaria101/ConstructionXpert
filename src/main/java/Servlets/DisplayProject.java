package Servlets;

import DAOImpliment.ProjectIMP;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/DisplayProject")
public class DisplayProject extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProjectIMP projectImp = new ProjectIMP();
        try {
            req.setAttribute("Projects", projectImp.findAll());
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        req.getRequestDispatcher("/WEB-INF/jsp/DisplayProjects.jsp").forward(req, resp);
    }
}

