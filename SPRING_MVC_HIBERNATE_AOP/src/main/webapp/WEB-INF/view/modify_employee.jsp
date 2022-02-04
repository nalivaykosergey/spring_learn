<%@ taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Modify employee</title>

    <style>
        .some_errors_class {
            color: red;
        }
    </style>

</head>
<body>

<h1>Modify employee</h1>

<form:form action="/save_employee" modelAttribute="employee">
    <c:hidden path="id" />
    Name <c:input path="name" /> <c:errors path="name" cssClass="some_errors_class" /> <br>
    Surname <c:input path="surname" /> <c:errors path="surname" cssClass="some_errors_class" /> <br>
    Department <c:input path="department" /> <c:errors path="department" cssClass="some_errors_class" /> <br>
    Salary <c:input path="salary" /> <c:errors path="salary" cssClass="some_errors_class" />  <br>
    <input type="submit" value="Add Employee">
</form:form>



</body>
</html>