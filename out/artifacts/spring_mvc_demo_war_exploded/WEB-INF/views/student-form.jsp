<%--
  Created by IntelliJ IDEA.
  User: PShanka00
  Date: 10-07-2020
  Time: 06:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <title>Student Registration Form</title>
</head>
<body>
        <form:form action="processform" modelAttribute="student">
            First Name: <form:input path="firstName"/>
            <br><br>
            Last Name: <form:input path="lastName"/>


        <br><br>
            Country:
            <form:select path="country">
                <form:options items="${student.countryOptions}"/>
            </form:select>
        <br><br>
          Gender:
                Male<form:radiobutton path="gender" value="Male"/>
                Female<form:radiobutton path="gender" value="Female"/>
                Others<form:radiobutton path="gender" value="Others"/>
        <br><br>
            Sports:
                    Football<form:checkbox path="sports" value="Football"/>
                    Cricket<form:checkbox path="sports" value="Cricket"/>
                    Hockey<form:checkbox path="sports" value="Hockey"/>
                    Volleyball<form:checkbox path="sports" value="Volleyball"/>
            <br><br>
            <input type="submit" name="Submit">
        </form:form>
</body>
</html>
