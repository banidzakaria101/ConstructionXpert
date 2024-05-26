<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add New Project</title>
</head>
<body>
<h2>Add New Project</h2>
<form action="SaveProject" method="post">
    <label for="projectName">Name:</label><br>
    <input type="text" id="projectName" name="projectName" required><br>
    <label for="projectDescription">Description:</label><br>
    <textarea id="projectDescription" name="projectDescription" required></textarea><br>
    <label for="projectStartDate">Start Date:</label><br>
    <input type="date" id="projectStartDate" name="projectStartDate" required><br>
    <label for="projectEndDate">End Date:</label><br>
    <input type="date" id="projectEndDate" name="projectEndDate" required><br>
    <label for="projectBudget">Budget:</label><br>
    <input type="number" id="projectBudget" name="projectBudget" required><br><br>
    <input type="submit" value="Add Project">
</form>
</body>
</html>
