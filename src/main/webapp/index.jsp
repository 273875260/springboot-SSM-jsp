<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/24
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="webjars/jquery/1.8.3/jquery.js">
    </script>
    <script type="text/javascript">
        $(function () {
            $("#button").click(function () {
                var id=$("input[name='bookId']").val();
                $("#form1").attr("action","book/"+id).submit();
            })
        })
    </script>
</head>
<body>
welcome
<form id="form1" action="" method="post">
    <input type="text" name="bookId">
</form>
<input type="button" id="button" value="点击">
</body>
</html>
