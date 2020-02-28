<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>URL传递数据到Controller</title>
</head>
<body>
    <form id="form1" name="myform" method="post" action="testModel.do">
        用户：<input type="text" name="name"> <br>
        密码：<input name="pwd" type="password"> <br>
    <input type="submit" value="登录">
    </form>
        用户：${ user1.name }<br>
        密码：${ user1.pwd }<br>
    name: ${ name } <br>
</body>
</html>