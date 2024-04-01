package com.ohgiraffers.section01.restudy;

public class MemberRegister {

    public void register(Member [] member){
        System.out.println("회원을 등록합니다.");
        for(Member x: member){
            System.out.println(x.getName()+"님이 회원등록에 성공하셨습니다.");
        }

        if(MemberRepository.store(member)){
            System.out.println("총 "+member.length+"명의 회원이 등록에 성공했습니다.");
        }

    }


}
