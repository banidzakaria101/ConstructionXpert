package Servlets;

import DAOImpliment.ProjectIMP;
import model.Project;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;


@WebServlet("/projects")
public class SaveProject extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProjectIMP projectImp = new ProjectIMP();
        try {
            req.setAttribute("Projects", projectImp.findAll());
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/projects.jsp").forward(req, resp);
    }

    //    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ProjectIMP projectImp = new ProjectIMP();
//        String projectName = req.getParameter("projectName");
//        String projectDescription = req.getParameter("projectDescription");
//        Date projectStartDate = Date.valueOf(req.getParameter("projectStartDate"));
//        Date projectEndDate = Date.valueOf(req.getParameter("projectEndDate"));
//        Integer projectBuget = Integer.valueOf(req.getParameter("projectBuget"));
//        Project project = new Project (projectName, projectDescription, projectStartDate, projectEndDate, projectBuget);
//
//        try {
//            projectImp.save(project);
//        } catch (SQLException | ClassNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/projects.jsp").forward(req, resp);
//
//    }
//}
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProjectIMP projectImp = new ProjectIMP();

        String projectName = req.getParameter("projectName");
        String projectDescription = req.getParameter("projectDescription");
        Date projectStartDate = Date.valueOf(req.getParameter("projectStartDate"));
        Date projectEndDate = Date.valueOf(req.getParameter("projectEndDate"));
        Integer projectBudget = Integer.valueOf(req.getParameter("projectBudget"));



        Project project = new Project(projectName, projectDescription, projectStartDate, projectEndDate, projectBudget);

        try {
            projectImp.save(project);
            resp.sendRedirect("DisplayProject");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}