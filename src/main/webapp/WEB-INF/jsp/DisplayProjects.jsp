<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Project List</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
    <a class="navbar-brand" href="../../index.html">Project Management</a>
    <div class="collapse navbar-collapse">
        <ul class="navbar-nav ml-auto">
            <li class="nav-item">
                <a class="nav-link" href="save-project">Add New Project</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="display">List Projects</a>
            </li>
        </ul>
    </div>
</nav>
<div class="container mt-4">
    <h2>Project List</h2>
    <div class="row">
        <c:forEach var="project" items="${Projects}">
            <div class="col-md-4 mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">${project.projectName}</h5>
                        <h6 class="card-subtitle mb-2 text-muted">ID: ${project.projectId}</h6>
                        <p class="card-text">${project.projectDescription}</p>
                        <p class="card-text"><strong>Start Date:</strong> ${project.projectStartDate}</p>
                        <p class="card-text"><strong>End Date:</strong> ${project.projectEndDate}</p>
                        <p class="card-text"><strong>Budget:</strong> ${project.projectBudget}</p>
                        <div class="mt-3">
                            <a href="display-tasks?projectId=${project.projectId}" class="btn btn-primary btn-sm">View Details</a>
                            <a href="update-project?projectId=${project.projectId}" class="btn btn-warning btn-sm">Update</a>
                            <a href="delete-project?projectId=${project.projectId}" class="btn btn-danger btn-sm" onclick="return confirm('Are you sure you want to delete this project?');">Delete</a>
                            <a href="add-tasks?projectId=${project.projectId}" class="btn btn-success btn-sm">Add Tasks</a>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
<footer class="footer mt-auto py-3 bg-light">
    <div class="container">
        <p>&copy; 2024 Project Management System. All rights reserved.</p>
    </div>
</footer>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
