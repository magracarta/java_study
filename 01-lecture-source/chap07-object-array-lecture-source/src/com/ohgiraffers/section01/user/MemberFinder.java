package com.ohgiraffers.section01.user;

public class MemberFinder {
    public Member[] findAllMembers(){
        return MemberRepository.findAllMember();
    }
}
