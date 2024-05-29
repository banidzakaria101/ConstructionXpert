package Servlets;

import DAOImpliment.ResourceIMP;
import DAOImpliment.TaskIMP;
import dao.TaskDAO;
import model.Resource;
import model.Task;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Date;

@WebServlet("/AddResources")
public class AddResources extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.getServletContext().getRequestDispatcher("/WEB-INF/jsp/AddResources.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            ResourceIMP resourceImp = new ResourceIMP();

            int taskId = Integer.parseInt(request.getParameter("taskId"));
            String resourceName = request.getParameter("resourceName");
            String resourceDescription = request.getParameter("resourcesDescription");
            String resourceType = request.getParameter("resourceType");
            int resourceQuantity = Integer.parseInt(request.getParameter("resourceQuantity"));


            Resource resource = new Resource(taskId, resourceName, resourceDescription, resourceType, resourceQuantity);

            resourceImp.create(resource);
            response.sendRedirect("display?taskId=" + taskId);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            response.sendRedirect("error.jsp");
        }
    }
}

