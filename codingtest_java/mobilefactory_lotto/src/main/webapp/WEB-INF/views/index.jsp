<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
<head>
    <title>메인 페이지</title>
    <meta charset="UTF-8">
</head>
<body>
<div class="container">
    <h1>이벤트 페이지 입니다.</h1>
    <p>로또 이벤트 참가하기</p>
    <a href="/formPage">이벤트 참가</a>
    <a href="/eventResultPage">결과 확인</a>
</div>
</body>
</html>
<style>
.container{
    max-width: 450px;
    margin: 40px auto 0;
    text-align: center;
}
.container a {
    text-decoration: none;
    padding: 10px 0;
    background: #000;
    color: #fff;
    width: 100%;
    margin-top: 10px;
    display: inline-block;
}

.container a:nth-of-type(2) {
    background: #fff;
    color: #000;
    border: 1px solid #000;
}
</style>