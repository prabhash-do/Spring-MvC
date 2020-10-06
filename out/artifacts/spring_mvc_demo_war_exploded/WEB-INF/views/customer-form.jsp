<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: PShanka00
  Date: 13-07-2020
  Time: 06:43 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Customer Form</title>
    <style>
        .error{color:red}
    </style>

</head>
<body>
        <form:form action="processfrom" modelAttribute="customer">
            First Name: <form:input path="firstName"/>
            <br><br>
            Last Name: <form:input path="lastName"/>
            <form:errors path="lastName" cssClass="error"/>
            <br><br>
            Password:<form:input path="password"/>
            <form:errors path="password" cssClass="error"/>
            <br><br>
            CourseCode:<form:input path="courseCode"/>
            <form:errors path="courseCode" cssClass="error"/>
            <br><br>
            <input type="submit" name="Submit">
        </form:form>


</body>
</html>
