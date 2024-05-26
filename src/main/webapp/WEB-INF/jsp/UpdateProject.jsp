<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Project</title>
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
    <h2>Update Project</h2>
    <form action="update-project" method="post">
        <input type="hidden" name="projectId" value="${project.projectId}">
        <div class="form-group">
            <label for="projectName">Project Name</label>
            <input type="text" class="form-control" id="projectName" name="projectName" value="${project.projectName}" required>
        </div>
        <div class="form-group">
            <label for="projectDescription">Project Description</label>
            <textarea class="form-control" id="projectDescription" name="projectDescription" rows="3" required>${project.projectDescription}</textarea>
        </div>
        <div class="form-group">
            <label for="projectStartDate">Start Date</label>
            <input type="date" class="form-control" id="projectStartDate" name="projectStartDate" value="${project.projectStartDate}" required>
        </div>
        <div class="form-group">
            <label for="projectEndDate">End Date</label>
            <input type="date" class="form-control" id="projectEndDate" name="projectEndDate" value="${project.projectEndDate}" required>
        </div>
        <div class="form-group">
            <label for="projectBudget">Budget</label>
            <input type="number" class="form-control" id="projectBudget" name="projectBudget" value="${project.projectBudget}" required>
        </div>
        <button type="submit" class="btn btn-primary">Update Project</button>
    </form>
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
