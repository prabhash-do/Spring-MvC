<%--
  Created by IntelliJ IDEA.
  User: PShanka00
  Date: 10-07-2020
  Time: 06:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Confirmation</title>
</head>
<body>
        The Student Name is: ${student.firstName} ${student.lastName}
        <br><br>
        Country : ${student.country}
        <br><br>
        Gender : ${student.gender}
        <br><br>
        Sports:
        <ul>
            <c:forEach var="temp" items="${student.sports}">
                <li>
                    ${temp}
                </li>
            </c:forEach>
        </ul>

</body>
</html>
