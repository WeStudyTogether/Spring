<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<script type="text/javascript" src="<%= request.getContextPath() %>/js/jquery-3.3.1.min.js"></script>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<script type="text/javascript" src="<%= basePath %>js/jquery-3.3.1.min.js"></script>
<script type="text/javascript">
$(document).ready(
	function() {
		$("#btnlogin").click(function() {
            var json = {'name': $(':input[name=name]').val(),
                    'pwd': $(':input[name=pwd]').val()
                    }
            var postdata = JSON.stringify(json);
            $.ajax({
                type: 'POST', 
                contentType: 'application/json;charset=utf-8', 
                processData: false, 
                url: 'requestbodybind.do', 
                dataType: 'json', 
                data: postdata, 
                success: function(data) {
                    alert('user: ' + data.name + '\npassword: ' + data.pwd);
                }, 
                error: function(err) {
                    console.log(err.responseText);
                    alert(err.responseText);
                }
            });
        })
	}
);
</script>
<title>ajax与后台交互</title>
</head>
<body>
    <form action="testModel.do" id="form1" name="myform" method="post">
            用户: <input type="text" name="name">
            密码: <input type="password" name="pwd">
        <input type="button" value="登录" id="btnlogin" class="btnlogin">
        <input type="submit">
    </form>
    姓名：${ user1.name }<br>
    密码：${ user1.pwd }<br>
</body>
</html>