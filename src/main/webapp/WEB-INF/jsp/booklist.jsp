<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/24
  Time: 16:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
    <script src="webjars/jquery/1.8.3/jquery.js">
    </script>
    <script type="text/javascript">
        $(function () {
            $("input[type='button']").click(function () {
                alert(this.id)
            })
        })
    </script>
</head>
<body>
<table border="1px">
    <tr>
        <td>图书id</td>
        <td>图书名</td>
        <td>数量</td>
        <td>借阅</td>
    </tr>
<%--    <c:forEach items="${booklist}" var="b">
        <tr>
            <td>${b.bookId}</td>
            <td>${b.bookName}</td>
            <td>${b.number}</td>
            <td><input id="button${b.bookId}" type="button" value="借书"></td>
        </tr>
    </c:forEach>--%>
<tr>
    <td>${booklist.bookId}</td>
    <td>${booklist.bookName}</td>
    <td>${booklist.number}</td>
    <td><input id="${booklist.bookId}" type="button" value="借书"></td>
</tr>
</table>
hellothere
</body>
</html>
