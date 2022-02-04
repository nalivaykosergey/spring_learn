<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>All Employees</title>
</head>
<body>
<h1>All Employees</h1>

<table>
    <tr>
        <th>Name</th>
        <th>Surname</th>
        <th>Department</th>
        <th>Salary</th>
    </tr>

    <c:forEach var="employee" items="${employees}">
        <c:url value="/update_employee" var="updateButton" >
            <c:param name="employeeId" value="${employee.id}"/>
        </c:url>
        <c:url value="/delete_employee" var="deleteButton" >
            <c:param name="employeeId" value="${employee.id}"/>
        </c:url>
        <tr>
            <td>${employee.name}</td>
            <td>${employee.surname}</td>
            <td>${employee.department}</td>
            <td>${employee.salary}</td>

            <td>
                <input type="button" value="Update" onclick="window.location.href='${updateButton}'">
            </td>
            <td>
                <input type="button" value="Delete" onclick="window.location.href='${deleteButton}'">
            </td>

        </tr>
    </c:forEach>

</table>

<input type="button" value="Add Employee" onclick="window.location.href = 'add_new_employee' ">

</body>
</html>