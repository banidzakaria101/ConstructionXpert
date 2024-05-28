<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Update Project</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('https://img.freepik.com/free-photo/pointing-sketch_1098-14323.jpg?t=st=1716906051~exp=1716909651~hmac=e850d3443de1091007420e2384a3c32d2367ac345b447f34a30ec63da9c721fd&w=900');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            color: #ffffff;
        }
        .navbar {
            background-color: #343a40 !important;
        }
        .navbar-brand, .navbar-nav .nav-link {
            color: #ffffff !important;
        }
        .container {
            background-color: rgba(0, 0, 0, 0.75);
            border-radius: 10px;
            padding: 30px;
            margin-top: 50px;
            color: #ffffff;
        }
        .form-group label {
            font-weight: bold;
        }
        .form-control {
            border-radius: 5px;
            box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
            background-color: rgba(255, 255, 255, 0.7); /* Light semi-transparent background for input fields */
            color: #000000; /* Input text color */
        }
        .form-control:focus {
            border-color: #007bff;
            box-shadow: 0 0 8px rgba(0, 123, 255, 0.25);
        }
        .btn-primary {
            border-radius: 5px;
            background-color: #007bff;
            transition: background-color 0.3s, transform 0.3s;
        }
        .btn-primary:hover {
            background-color: #0056b3;
            transform: scale(1.05);
        }
        footer {
            background-color: #343a40;
            color: #6c757d;
            text-align: center;
            padding: 20px 0;
            margin-top: 50px;
        }
    </style>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark">
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
    <h2 class="text-center">Update Project</h2>
    <form action="UpdateProject" method="post">
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
<footer class="footer mt-auto">
    <div class="container">
        <p>&copy; 2024 Project Management System. All rights reserved.</p>
    </div>
</footer>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
