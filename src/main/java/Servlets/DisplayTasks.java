package Servlets;

import DAOImpliment.TaskIMP;
import model.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/DisplayTask")
public class DisplayTasks extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            int projectId = Integer.parseInt(request.getParameter("projectId"));
            TaskIMP taskImp = new TaskIMP();

            List<Task> tasks = taskImp.getAllTasks(projectId);
            request.setAttribute("tasks", tasks);
            request.setAttribute("projectId", projectId);

            this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/DisplayTask.jsp").forward(request, response);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            TaskIMP taskImp = new TaskIMP();
            int taskProjectId = Integer.parseInt(request.getParameter("taskProjectId"));
            response.sendRedirect("DisplayTask?projectId=" + taskProjectId);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}