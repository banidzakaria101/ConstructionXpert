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

@WebServlet("/UpdateProject")
public class UpdateProject extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProjectIMP projectImp = new ProjectIMP();
        int projectId = Integer.parseInt(req.getParameter("projectId"));
        try {
            Project project = projectImp.findById(projectId);
            req.setAttribute("project", project);
            this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/UpdateProject.jsp").forward(req, resp);
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProjectIMP projectImp = new ProjectIMP();

        try {
            String projectName = req.getParameter("projectName");
            String projectDescription = req.getParameter("projectDescription");
            Date projectStartDate = Date.valueOf(req.getParameter("projectStartDate"));
            Date projectEndDate = Date.valueOf(req.getParameter("projectEndDate"));
            Integer projectBudget = Integer.parseInt(req.getParameter("projectBudget"));

            Project project = new Project();
            project.setProjectName(projectName);
            project.setProjectDescription(projectDescription);
            project.setProjectStartDate(projectStartDate);
            project.setProjectEndDate(projectEndDate);
            project.setProjectBudget(projectBudget);

            projectImp.update(project);
            resp.sendRedirect("DisplayProject");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            resp.sendError(HttpServletResponse.SC_BAD_REQUEST, "Invalid input format.");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
