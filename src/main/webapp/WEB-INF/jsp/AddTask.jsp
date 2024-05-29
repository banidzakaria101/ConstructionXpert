<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add Task</title>
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('https://img.freepik.com/free-photo/image-engineering-objects-workplace-top-view-construction-concept-engineering-tools-vintage-tone-retro-filter-effect-soft-focus-selective-focus_1418-474.jpg?t=st=1716902346~exp=1716905946~hmac=93745313774a7019335d503160d725333e6a1a7adb892145725469a51f936e20&w=900');
            background-size: cover;
            background-position: center;
            color: #ffffff;
        }
        .container {
            max-width: 600px;
            background: rgba(0, 0, 0, 0.7);
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
        }
        .form-group label {
            font-weight: bold;
        }
        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }
        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #004085;
        }
        h2 {
            margin-bottom: 20px;
            color: #ffffff;
        }
    </style>
</head>
<body>
<div class="container mt-4">
    <h2>Add Task</h2>
    <form action="AddTask" method="post">
        <div class="form-group">
            <label for="taskName">Task Name:</label>
            <input type="text" class="form-control" id="taskName" name="taskName" required>
        </div>
        <div class="form-group">
            <label for="taskDescription">Task Description:</label>
            <textarea class="form-control" id="taskDescription" name="taskDescription" rows="3" required></textarea>
        </div>
        <div class="form-group">
            <label for="taskStatus">Task Status:</label>
            <select class="form-control" id="taskStatus" name="taskStatus" required>
                <option value="Pending">Pending</option>
                <option value="In Progress">In Progress</option>
                <option value="Completed">Completed</option>
            </select>
        </div>
        <div class="form-group">
            <label for="taskStartDate">Start Date:</label>
            <input type="date" class="form-control" id="taskStartDate" name="taskStartDate" required>
        </div>
        <div class="form-group">
            <label for="taskEndDate">End Date:</label>
            <input type="date" class="form-control" id="taskEndDate" name="taskEndDate" required>
        </div>
        <input type="hidden" name="taskProjectId" value="${param.projectId}">
        <button type="submit" class="btn btn-primary btn-block">Add Task</button>
    </form>
</div>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
