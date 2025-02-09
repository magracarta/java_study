<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<html>
<head>
    <title>결과</title>
    <meta charset="UTF-8">
</head>
<body>
    <div class="container">
        <div class="firstLotto">
            <p>1등 로또 번호</p>
            <h1>
                ${firstLotto.number}
            </h1>
        </div>
        <c:choose>
            <c:when  test="${lottocheck == false}">
                <h2>번호가 조회되지 않습니다.</h2>
                <a href="eventResultPage">다시 확인하기</a>
            </c:when>
            <c:otherwise>
                <c:if test="${lotto.rank <= 4}">
                    <span>축하합니다! 담청되셨습니다.</span>
                    <h1>${lotto.rank} 위</h1>
                </c:if>
                <c:if test="${lotto.rank > 55}">
                    <span>아쉽게도 낙첨되셨습니다.</span>
                </c:if>
                <p class="title">나의 번호 : </p>
                <p class="myLottoNumber">${lotto.number}</p>
            </c:otherwise>
        </c:choose>
        <a href="/">메인페이지로 이동하기</a>
    </div>


</body>
</html>

<style>
    .container{
        max-width: 450px;
        margin: 40px auto 0;
        text-align: center;
    }
    .container p { font-weight: 600; }
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

    .container .firstLotto {
        border: 1px solid #000;
        margin-bottom: 50px;
        border-radius: 10px;
    }

    .container .title { margin: 40px 0 10px; }
    .container .myLottoNumber { font-size: 30px; margin-top: 0 }
    .container span { font-size: 25px; }
</style>