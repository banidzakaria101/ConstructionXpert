<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Add New Project</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
    <style>
        body {
            background-image: url('https://img.freepik.com/free-photo/image-engineering-objects-workplace-top-view-construction-concept-engineering-tools-vintage-tone-retro-filter-effect-soft-focus-selective-focus_1418-474.jpg?t=st=1716902346~exp=1716905946~hmac=93745313774a7019335d503160d725333e6a1a7adb892145725469a51f936e20&w=900');
            background-size: cover;
            background-position: center;
            color: #ffffff;
        }
        .form-container {
            max-width: 600px;
            margin: 50px auto;
            padding: 20px;
            background-color: rgba(0, 0, 0, 0.7);
            border-radius: 8px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
        }
        .form-container h2 {
            margin-bottom: 20px;
            color: #ffffff;
        }
        .form-group label {
            font-weight: bold;
            color: #ffffff;
        }
        .form-control {
            background-color: rgba(255, 255, 255, 0.7);
            color: #000000;
        }
        .btn-primary {
            background-color: #007bff;
            border-color: #007bff;
        }
        .btn-primary:hover {
            background-color: #0056b3;
            border-color: #004085;
        }
    </style>
</head>
<body>
<div class="container form-container">
    <h2 class="text-center">Add New Project</h2>
    <form action="save-project" method="post">
        <div class="form-group">
            <label for="projectName">Name:</label>
            <input type="text" class="form-control" id="projectName" name="projectName" required>
        </div>
        <div class="form-group">
            <label for="projectDescription">Description:</label>
            <textarea class="form-control" id="projectDescription" name="projectDescription" rows="4" required></textarea>
        </div>
        <div class="form-group">
            <label for="projectStartDate">Start Date:</label>
            <input type="date" class="form-control" id="projectStartDate" name="projectStartDate" required>
        </div>
        <div class="form-group">
            <label for="projectEndDate">End Date:</label>
            <input type="date" class="form-control" id="projectEndDate" name="projectEndDate" required>
        </div>
        <div class="form-group">
            <label for="projectBudget">Budget:</label>
            <input type="number" class="form-control" id="projectBudget" name="projectBudget" required>
        </div>
        <button type="submit" class="btn btn-primary btn-block">Add Project</button>
    </form>
</div>
<!-- Bootstrap JS and dependencies -->
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
