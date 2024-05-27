package Servlets;

import DAOImpliment.TaskIMP;
import dao.TaskDAO;
import model.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/AddTask")
public class AddTasks extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/AddTask.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            TaskIMP taskImp = new TaskIMP();

            int taskProjectId = Integer.parseInt(request.getParameter("taskProjectId"));
            String taskName = request.getParameter("taskName");
            String taskDescription = request.getParameter("taskDescription");
            String taskStatus = request.getParameter("taskStatus");
            Date taskStartDate = Date.valueOf(request.getParameter("taskStartDate"));
            Date taskEndDate = Date.valueOf(request.getParameter("taskEndDate"));

            Task task = new Task(taskName, taskDescription, taskStatus, taskStartDate, taskEndDate);

            taskImp.addTask(task);
            response.sendRedirect("display?projectId=" + taskProjectId);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
    }

