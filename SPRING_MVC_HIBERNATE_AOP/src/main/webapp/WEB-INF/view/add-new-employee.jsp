<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Add new Employee</title>
</head>
<body>

<h1>Add new Employee</h1>

<form:form action="saveEmployee" modelAttribute="employee">
    <form:hidden path="id" />
    Name <form:input path="name"/><br>
    Surname <form:input path="surname"/><br>
    Department <form:input path="department"/><br>
    Salary <form:input path="salary"/><br>
    <input type="submit" value="OK">

</form:form>

</body>
</html>