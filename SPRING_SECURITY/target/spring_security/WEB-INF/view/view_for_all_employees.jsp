<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

<h3>Info for all employees</h3>

<security:authorize access="hasRole('HR')">
<input type="button" value="Salary" onclick="window.location.href='hr_info'">
<p>Only for hr staff</p>
</security:authorize>


<security:authorize access="hasRole('MANAGER')">
<input type="button" value="Performance" onclick="window.location.href='manager_info'">
<p>Only for managers</p>
</security:authorize>

</body>
</html>