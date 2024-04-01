package com.ohgiraffers.section01.user;

public class MemberRepository {
    private final static Member[] member;
    private static int count;

    static {
        member = new Member[10];
    }

    public static boolean sotre(Member[] members) {
        for(int i =0; i< members.length; i++){
            member[count++] = members[i];
        }
        return true;
    }


    public static Member[] findAllMember(){
        return  member;
    };
}
