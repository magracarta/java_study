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
       this.commonGamePlayFn();
    }

    public void commonGamePlayFn(){
        System.out.println("모험을 떠나시겠습니까? y/n");
        String anwer = this.sc.nextLine();
        if(anwer == "y"){

        }else{
            this.endGame();
        }

    }

    public void monsterViewFn(){
        System.out.println("몬스터를 마주쳤습니다.");
    }


}
