package com.ohgiraffers.section01.restudy;

public class MemberService {

    public void signUpMember(){
        Member [] mebers = {
                new Member(1, "user01","pass01","홍길동",20,'남'),
                new Member(2, "user02","pass02","유관순",16,'여'),
                new Member(3, "user03","pass03","이순신",40,'남'),
                new Member(4, "user04","pass04","신사임당",36,'여'),
                new Member(5, "user05","pass05","윤봉길",22,'남')
        };

        MemberRegister memberRegister = new MemberRegister();
        memberRegister.register(mebers);


    }
    public void showAllMember(){
        MemberRepository memberRepository = new MemberRepository();
        for(Member x : MemberRepository.findAllMember()){
            if(x != null){
                System.out.println(x.getInformation());
            }


        }
    }
}
