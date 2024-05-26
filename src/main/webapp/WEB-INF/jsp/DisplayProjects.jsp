<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Project List</title>
</head>
<body>
<h2>Project List</h2>
<form action="display-project" method="get">
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Budget</th>
    </tr>
    <c:forEach var="project" items="${Projects}">
        <tr>
            <td>${project.projectId}</td>
            <td>${project.projectName}</td>
            <td>${project.projectDescription}</td>
            <td>${project.projectStartDate}</td>
            <td>${project.projectEndDate}</td>
            <td>${project.projectBuget}</td>
        </tr>
    </c:forEach>
</table>
</form>
<a href="projects.jsp">Add New Project</a>
</body>
</html>
