<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Project List</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.4/css/all.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('https://img.freepik.com/free-photo/image-engineering-objects-workplace-top-view-construction-concept-engineering-tools-vintage-tone-retro-filter-effect-soft-focus-selective-focus_1418-474.jpg?t=st=1716902346~exp=1716905946~hmac=93745313774a7019335d503160d725333e6a1a7adb892145725469a51f936e20&w=900');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            font-family: Arial, sans-serif;
            color: #ffffff;
        }
        .navbar {
            background-color: rgba(0, 0, 0, 0.8) !important;
        }
        .navbar-brand, .nav-link {
            color: #ffffff !important;
        }
        .container {
            margin-top: 30px;
            background-color: rgba(0, 0, 0, 0.7);
            border-radius: 10px;
            padding: 20px;
        }
        .card {
            background-color: rgba(33, 37, 41, 0.9);
            color: #ffffff;
            border: none;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            transition: all 0.3s ease-in-out;
        }
        .card:hover {
            transform: translateY(-5px);
            box-shadow: 0 6px 12px rgba(0, 0, 0, 0.1);
        }
        .card-title {
            font-weight: bold;
            color: #17a2b8;
        }
        .card-subtitle {
            color: #6c757d;
        }
        .btn {
            border-radius: 10px;
            transition: all 0.3s ease-in-out;
        }
        .btn:hover {
            transform: scale(1.05);
        }
        .footer {
            background-color: rgba(0, 0, 0, 0.8);
            padding: 10px 0;
            text-align: center;
            color: #ffffff;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark">
    <a class="navbar-brand" href="#">Project Management</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
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
<div class="container">
    <h2 class="text-center mb-4">Project List</h2>
    <div class="row">
        <c:forEach var="project" items="${Projects}">
            <div class="col-md-4 mb-4">
                <div class="card">
                    <div class="card-body">
                        <h5 class="card-title">${project.projectName}</h5>
                        <h6 class="card-subtitle mb-2"><strong>Project Id:</strong>${project.projectId}</h6>
                        <p class="card-text"><strong>Description:</strong>${project.projectDescription}</p>
                        <p class="card-text"><strong>Start Date:</strong> ${project.projectStartDate}</p>
                        <p class="card-text"><strong>End Date:</strong> ${project.projectEndDate}</p>
                        <p class="card-text"><strong>Budget:</strong> ${project.projectBudget}</p>
                        <div class="mt-3 d-flex justify-content-between">
                            <a href="display-tasks?projectId=${project.projectId}" class="btn btn-primary btn-sm"><i class="fas fa-eye mr-2"></i></a>
                            <a href="update-project?projectId=${project.projectId}" class="btn btn-warning btn-sm"><i class="fas fa-edit mr-2"></i></a>
                            <a href="delete-project?projectId=${project.projectId}" class="btn btn-danger btn-sm" onclick="return confirm('Are you sure you want to delete this project?');"><i class="fas fa-trash-alt mr-2"></i></a>
                            <a href="add-tasks?projectId=${project.projectId}" class="btn btn-success btn-sm"><i class="fas fa-plus mr-2"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </c:forEach>
    </div>
</div>
<footer class="footer">
    <div>
        <p>&copy; 2024 Project Management System. All rights reserved.</p>
    </div>
</footer>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
