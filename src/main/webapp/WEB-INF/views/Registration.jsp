<%--
  User: pavel
  Date: 26.06.17
  Registration page.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
    <script src="https://cdn.jsdelivr.net/jquery/1.12.4/jquery.min.js" type="text/javascript"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
    <script><%@include file="/WEB-INF/views/validation_input.js" %></script>
    <script><%@include file="/WEB-INF/views/update_location.js" %></script>
</head>
<body>

<h2>Registration</h2>

    <form id="commentForm" method="post" action="Servlet" name="add_data">

        <label for="username">First Name</label><br />
        <input type="text" name="username" id="username" /><br />
        <br />

        <label for="login">Login</label><br />
        <input type="text" name="login" id="login" /><br />
        <br />

        <label for="password">Password</label><br />
        <input type="text" name="password" id="password" /><br />
        <br /><br />

        Select Country:
        <label for="country"></label><br />
        <select id="country" name="country">
            <option value="">Select Country</option>
            <option value="USA">USA</option>
            <option value="Israel">Israel</option>
        </select>
        <br />
        <br />

        Select City:
        <label for="city"></label><br />
        <select id="city" name="city">
            <option value="">Select City</option>
        </select>

        <br />
        <br />

        <button type="submit">Register</button>

    </form>

</body>
</html>
