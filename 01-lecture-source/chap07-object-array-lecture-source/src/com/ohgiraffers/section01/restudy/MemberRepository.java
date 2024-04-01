package com.ohgiraffers.section01.restudy;

public class MemberRepository {
    private final static Member[] members;
    private static int count;

    static {
        members = new Member[10];
    }

    public static boolean store(Member [] member){
        for(Member x : member){
            members[count++] = x;
        }
        return true;
    }

    public static Member[] findAllMember(){
        return  members;
    }

}
