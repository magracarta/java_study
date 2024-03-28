package game.lucher;

import game.source.PlayGame;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /*
        * 연습:
            간단한 mmo rpg 게임? 만들기

            (실행창) ,캐릭터(주인공), 몬스터(괴물)

            1. 플레이어가 몬스터1을 죽이는 과정

            클래스

            - 실행창
            캐릭터 생성 -> 이름 생성 , 직업 (마법사, 전사),
            - 캐릭터
            속성 : 이름 , 직업 , 레벨, 공격력,

            메소드 :
            전투-공격, 전투-피하기, 전투 - 맞기, 전투 -도망가기 , 레벨 업,

            몬스터 :
            속성 : 이름, 레벨, xp, 체력 , 공격력
            메소드 : 등장, 공격, 죽음 -> 레벨링
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("게임을 시작하겠습니까? true/false");
        boolean startAgree = sc.nextBoolean();

        PlayGame game =new PlayGame(startAgree);


    }
}
