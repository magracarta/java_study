<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
<head>
    <title>참가 페이지</title>
    <meta charset="UTF-8">
</head>
<body>
  <h1>핸드폰 번호를 먼저 인증해주세요.</h1>
  <form action="sendPhoneNumber" method="post">
      <input type="text" value="폰 번호 작성">
      <button>핸드폰 번호 인증하기</button>

      <c:set var ="certification" value="${sendPhoneNumber}" />
      <c:if test="${sendPhoneNumber == true}">
          <input type="text" value="인증번호를 입력하세요."/>
          <a href="sendLotto">인증번호 확인하기</a>
      </c:if>


  </form>
<script>

</script>
</body>
</html>
