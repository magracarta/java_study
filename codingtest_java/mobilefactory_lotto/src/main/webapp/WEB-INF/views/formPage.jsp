<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
<head>
    <title>참가 페이지</title>
    <meta charset="UTF-8">
</head>
<body>
 <h2>이벤트 참가페이지</h2>
  <h1>핸드폰 번호를 먼저 인증해주세요.</h1>
  <form action="sendPhoneNumber" method="post">
      <div>
          <input type="text" value="${sendPhoneNumber?phoneNumber:""}" placeholder="전화번호 작성" name="phone" oninput="phoneNumberCheck(event)">
          <button class="certifi_btn no">인증하기</button>
      </div>
      <small>** 010-0000-0000 형식으로 작성해주세요.</small>
      <input readonly name="now" value="${now}" style="display: none" >
  </form>
  <c:set var ="certificationPhone" value="${sendPhoneNumber}" />
  <c:if test="${sendPhoneNumber == true}">
      <form action="certificationPhone" method="post">
              <div>
                  <input name="certificationNumber" type="text" placeholder="인증번호를 입력하세요." value="" oninput="certificationCheck(event)" />
                  <button class="certifi_btn no">인증확인</button>
              </div>
              <p class="timeout"></p>
             <input readonly name="phoneNumber" value="${phoneNumber}" style="display: none" >
      </form>
  </c:if>
<script>
    let cerifiBtn2 = document.querySelectorAll(".certifi_btn")[1];
    let cerifiBtn = document.querySelectorAll(".certifi_btn")[0];
    let timeout = document.querySelector(".timeout");
    let noEndEvent = <%= request.getAttribute("noEndEvent")%>;
    if(!noEndEvent){
        alert("로또 이벤트 응모기간이 끝났습니다.")
        location.replace("/");
    }
    function phoneNumberCheck(e){
        let result = /^(01[016789]{1})-[0-9]{3,4}-[0-9]{4}$/;
        if(result.test(e.target.value)){
            cerifiBtn.classList.remove("no");
        }else{
            cerifiBtn.classList.add("no");
        }
    }
    function certificationCheck(e){
        const regex = /^\d{4}$/;
        if(regex.test(e.target.value)){
            cerifiBtn2.classList.remove("no");
        }else{
            cerifiBtn2.classList.add("no");
        }
    }

    function startTimer(durationInSeconds) {
        let timeLeft = durationInSeconds;
        const timerInterval = setInterval(() => {
            let minutes = Math.floor(timeLeft / 60);
            let seconds = timeLeft % 60;
            timeout.innerHTML=(minutes+" : "+ (seconds < 10 ? "0" : "") +seconds); // 00:00 형식 출력
            if (timeLeft <= 0) {
                timeout.innerHTML=("인증을 다시 시도해주세요!");
                clearInterval(timerInterval);
                cerifiBtn2.classList.add("dontUse");
            } else {
                timeLeft--;
            }
        }, 1000); // 1초마다 실행
    }
    // 5분(300초) 타이머 시작
   if(cerifiBtn2) startTimer(<%= request.getAttribute("timeLimit") %>);


   //엔터 막기
   document.querySelectorAll("form").forEach((el)=>{
       el.addEventListener("keydown", function(e) {
           if (e.key === "Enter") {
               e.preventDefault();
           }
       });
   })
</script>
</body>
</html>
<style>
    input { padding: 10px; font-size: 16px; width: 60%; }
    body { text-align : center; display: flex; flex-direction: column;
        justify-content: center;}
    form > div { margin: 20px auto 0;  max-width: 450px;display: flex }
    form > div:nth-of-type(2) { margin-top: 40px; }
    a, .certifi_btn { pointer-events: auto; background: none; font-size: 16px; padding:10px 0px;
        background: black; color: #fff; outline: none; border: none; text-decoration: none; width: 40%;
    }
    small { display: inline-block; color: red; margin-top: 20px; }
    .certifi_btn.no { pointer-events: none; opacity:0.2; }
    .certifi_btn.dontUse { pointer-events: none; opacity:0.2; }
    form > div  p { width: 100%; text-align: left; }
</style>