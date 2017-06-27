<%--
  User: pavel
  Date: 26.06.17
  Registration page.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registration</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap-theme.min.css">
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
    <script src="https://cdn.jsdelivr.net/jquery/1.12.4/jquery.min.js" type="text/javascript"></script>
    <script src="https://cdn.jsdelivr.net/jquery.validation/1.15.1/jquery.validate.min.js"></script>
    <script><%@include file="/WEB-INF/views/validation_input.js" %></script>
    <script><%@include file="/WEB-INF/views/update_location.js" %></script>
</head>
<body>

<h2>Registration</h2>

    <form class="form-horizontal" role="form" id="commentForm"
          method="post" action="Servlet" name="add_data">

        <div class="form-group">
        <label class="control-label" for="username">First Name</label><br />
        <input class="form-control" type="text" name="username" id="username" />
        </div>


        <div class="form-group">
        <label class="control-label" for="login">Login</label><br />
        <input class="form-control" type="text" name="login" id="login" />
        </div>


        <div class="form-group">
        <label class="control-label" for="password">Password</label><br />
        <input class="form-control" type="text" name="password" id="password" />
        </div>


        <div class="selected">
            <p class="help-block">Select Country:</p>
            <label class="control-label" for="country"></label><br />
            <select class="form-control" id="country" name="country">
                <option value="">Select Country</option>
                <option value="USA">USA</option>
                <option value="Israel">Israel</option>
            </select>
        </div>


        <div class="selected">
            <p class="help-block">Select City:</p>
            <label class="control-label" for="city"></label><br />
            <select  class="form-control" id="city" name="city">
                <option value="">Select City</option>
            </select>
        </div>


        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-success">Register</button>
            </div>
        </div>
    </form>


<div class="row">
    <div class="col-xs-2">
        <input type="text" class="form-control" placeholder=".col-xs-2">
    </div>
    <div class="col-xs-3">
        <input type="text" class="form-control" placeholder=".col-xs-3">
    </div>
    <div class="col-xs-4">
        <input type="text" class="form-control" placeholder=".col-xs-4">
    </div>
</div>
</body>
</html>
