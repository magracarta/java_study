package game.source;

import java.util.Scanner;

public class PlayGame {

    private Scanner sc = new Scanner(System.in);


    private boolean startGame;

    public PlayGame(){

    }
    public PlayGame(boolean startGame){
        this.startGame = startGame;
        System.out.println(this.startGame);
        if(this.startGame){
            this.startGameFn();
        }else{
            this.endGame();
        }
    }

    public void endGame(){
        System.out.println("게임을 끝내겠습니다.");
    }
    public void startGameFn(){

        System.out.println("게임을 시작합니다.");
        System.out.println("이름을 등록해주세요.");
        String name =  sc.nextLine();
        System.out.println("직업을 선택해주세요. (1.전사 , 2.마법사, 3.궁수) 그외의 수를 적으시면 무직이 됩니다.");
        int job = this.sc.nextInt();

       Charactor charactor = new Charactor(name, job);
       System.out.println(charactor.charactorInfo());
        Monster monster = new Monster();
       this.commonGamePlayFn(charactor ,monster);


    }

    public void commonGamePlayFn(Charactor charactor , Monster monster){
        System.out.println("모험을 떠나시겠습니까? yes/no");
        this.sc.nextLine();
        String answer = this.sc.nextLine();
        if(answer.equals("yes")){
            monsterViewFn(charactor, monster);
        }else{
            this.endGame();
        }

    }

    public void monsterViewFn(Charactor charactor , Monster monster){
        System.out.println("몬스터를 마주쳤습니다.");
        boolean meetMonster = true;
        int chattackCounter = charactor.getAttackCount();//캐릭터 공격력 가져오기
        int monattackCounter = 20;

        monster.remonstervalue();
        monster.monsterAppear();

        while (meetMonster){
           System.out.println("1. 공격한다. 2.도망간다.");
           int answer1 = this.sc.nextInt();
           if(answer1 ==1){ //공격
               System.out.println("공격하였습니다.");
               //공격하기
               monster.setAttCnt(charactor.getAttackCount());
               monster.attackMonster();
               
               //공격당하기

               //몬스터가 죽었다.

               // 내가 죽었다.

           }else { // 안공격
               commonGamePlayFn(charactor , monster);
               break;
           }

        }

    }


}
