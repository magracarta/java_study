<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>

<html>
<head>
    <title>담청 결과 페이지</title>
    <meta charset="UTF-8">
</head>
<body>
    <h3>당청자 발표</h3>
    <h4>번호로 조회</h4>
    <form action="selectMyLotto" >
        <div>
            <input type="text" value="${sendPhoneNumber?phoneNumber:""}" placeholder="전화번호 작성" name="phone" oninput="phoneNumberCheck(event)">
            <button class="certifi_btn no">조회하기</button>
        </div>
        <small>** 010-0000-0000 형식으로 작성해주세요.</small>
    </form>
    <script>
        let cerifiBtn = document.querySelectorAll(".certifi_btn")[0];
        function phoneNumberCheck(e){
            let result = /^(01[016789]{1})-[0-9]{3,4}-[0-9]{4}$/;
            if(result.test(e.target.value)){
                cerifiBtn.classList.remove("no");
            }else{
                cerifiBtn.classList.add("no");
            }
        }

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
    form > div { margin: 20px auto 0;  max-width: 450px; display: flex; }
    a, .certifi_btn {
        pointer-events: auto; background: none; font-size: 16px; padding:10px 0px;
        background: black; color: #fff; outline: none; border: none; text-decoration: none; width: 40%;
    }
    small { display: inline-block; color: red; margin-top: 20px; }
    .certifi_btn.no { pointer-events: none; opacity:0.2; }
    .certifi_btn.dontUse { pointer-events: none; opacity:0.2; }
    form > div  p { width: 100%; text-align: left; }
</style>