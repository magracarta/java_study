<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
<head>
    <title>인증 확인페이지</title>
    <meta charset="UTF-8">
</head>
<body>
    <div class="container">
        <c:if test="${certification == true}">
            <h3>${text}</h3>
            <a href="/">메인페이지로 이동하기</a>
        </c:if>
    </div>
<script>
   let certification= <%= request.getAttribute("certification")%>;
   let noCertification= <%= request.getAttribute("noCertification")%>;
    if(noCertification){
        alert("잘못된 경로로 접근하셨습니다. 인증 확인 후 이용 부탁드립니다.");
        location.replace("/formPage");
    }
    if(!certification && !noCertification){
        alert("인증번호가 만료 되었거나 틀립니다. 다시 시도해주세요.");
        location.replace("/formPage");
    }
</script>
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
