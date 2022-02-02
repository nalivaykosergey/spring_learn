<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        .some_error_class {
            color: red;
        }
    </style>
    <title>Hello, Spring</title>
</head>
<body>

<h2>Dear Employee, Please enter your details</h2>
<br>

<form:form action="showDetails" modelAttribute="employee" >
    Name <form:input path="name"/> <form:errors path="name" cssClass="some_error_class"/> <br>
    Surname <form:input path="surname"/> <form:errors path="surname" cssClass="some_error_class"/> <br>
    Salary <form:input path="salary"/> <form:errors path="salary" cssClass="some_error_class"/> <br>
    Phone <form:input path="phoneNumber"/> <form:errors path="phoneNumber" cssClass="some_error_class"/> <br>
    Email <form:input path="email"/> <form:errors path="email" cssClass="some_error_class"/> <br>
    Department <form:select path="department">
    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>
    </form:select>

    <br>
    Which car do you want?

    BMW <form:radiobutton path="carBrand" value="BMW"/>
    Audi <form:radiobutton path="carBrand" value="Audi"/>
    Mersedese <form:radiobutton path="carBrand" value="Mersedese"/>

    <br>

    Lang?:
    <br>

    EN <form:checkbox path="languages" value="English"/>
    DE <form:checkbox path="languages" value="Deutch"/>
    FR <form:checkbox path="languages" value="French"/>
    <input type="submit" value="OK">
</form:form>

</body>

</html>