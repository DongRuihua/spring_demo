<%--
  Created by IntelliJ IDEA.
  User: Rui
  Date: 2019/1/28
  Time: 23:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>index</title>
</head>
<body>
    <h2 id="titleEle">hello, I am tired!!!</h2>
    <br/>
    <a href="${pageContext.request.contextPath}/hello">点我</a>

    <%--不需要@{...}--%>
    <script type="text/javascript" src="/webjars/jquery/1.9.1/jquery.js"></script>
    <script>
        $("#titleEle").css("color", "red");
    </script>
</body>
</html>
