<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Меню</title>
    <script src="https://cdn.jsdelivr.net/jquery/1.12.4/jquery.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
    <script><%@include file="/WEB-INF/views/valid.js" %></script>
</head>
<body>
<div class="container">

    <h2>Registration</h2>
    <form id="commentForm" method="post" action="Servlet" name="add_data">

        <label for="username">First Name</label>
        <input type="text" name="username" id="username" />


        <label for="login">Login</label>
        <input type="text" name="login" id="login" />


        <label for="password">Password</label>
        <input type="text" name="password" id="password" />


        <label for="country">Country</label>
        <input type="text" name="country" id="country" />


        <label for="city">City</label>
        <input type="text" name="city" id="city" />


        <button type="submit">Register</button>

    </form>

</div>
</body>
</html>
