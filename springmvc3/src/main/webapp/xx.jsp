<%--
  Created by IntelliJ IDEA.
  User: Y
  Date: 2019/4/10
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Title</title>
</head>
<body>
<script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
    var user = {
        "name":"张三",
        "age":22
    };
    $.ajax({
        url:"jsonType",
        data:JSON.stringify(user),
        type:"post",
        contentType: "application/json;charse=UTF-8",
        dataType:"text",
        success:function(data){
            var obj = eval("(" + data + ")");
            alert(obj.name+"---"+obj.age);
        }
    })
</script>
</body>
</html>
