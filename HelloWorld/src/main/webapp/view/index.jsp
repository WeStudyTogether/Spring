<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
    ${ stringuser }
    <table border="1">
        <thead>
            <tr>
                <th>序号</th>
                <th>姓名</th>
                <th>年龄</th>
            </tr>
        </thead>
        <tr>
            <td>${ objuser.id }</td>
            <td>${ objuser.name }</td>
            <td>${ objuser.age }</td>
        </tr>
    </table>
</body>
</html>