<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

<body>

<h2>Dear Employee, Welcome </h2>
<br>

<p>Your name: ${employee.name}</p>
<p>Surname: ${employee.surname}</p>
<p>Salary: ${employee.salary}</p>
<p>Your department: ${employee.department}</p>
<p>Your phone number: ${employee.phoneNumber}</p>
<p>Your email: ${employee.email}</p>
<p>Your car: ${employee.carBrand}</p>
<p>Languages:</p>

<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>${lang}</li>
    </c:forEach>
</ul>

</body>

</html>