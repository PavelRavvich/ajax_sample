<%--
  Created by IntelliJ IDEA.
  User: pavel
  Date: 24.06.17
  Time: 19:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Populate City Dropdown Using jQuery Ajax</title>
    <script type="text/javascript" src="http://code.jquery.com/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $("select.country").change(function(){
                var selectedCountry = $(".country option:selected").val();
                $.ajax({
                    type: "POST",
                    url: "/WEB-INF/views/location.jsp",
                    data: { country : selectedCountry }
                }).done(function(data){
                    $("#response").html(data);
                });
            });
        });
    </script>
</head>
<body>
<form>
    <table>
        <tr>
            <td>
                <label>Country:</label>
                <label>
                    <select class="country">
                        <option>Select</option>
                        <option value="usa">United States</option>
                        <option value="india">India</option>
                        <option value="uk">United Kingdom</option>
                    </select>
                </label>
            </td>
            <td id="response">
                <!--Response will be inserted here-->
            </td>
        </tr>
    </table>
</form>
</body>
</html>
