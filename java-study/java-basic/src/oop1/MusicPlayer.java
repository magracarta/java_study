package oop1;

public class MusicPlayer {
    int volume = 0;
    boolean isOn = false;

    void on(){
        //음악 플레이어켜기
        isOn = true;
        System.out.println("음막 플레이어를 시작합니다.");
    }

     void off(){
        //음악플레이어 끄기
        isOn = false;
        System.out.println("음막 플레이어를 종료합니다.");
    }

     void volumUp(){
        //볼륨 증가
        volume++;
        System.out.println("음악 플레이더 볼륨 : " + volume );
    }

     void volumDown(){
        //볼륨감소
        volume--;
        System.out.println("음악 플레이더 볼륨 : " + volume );
    }

     void musicState(){
        //음악플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(isOn){
            System.out.println("음악 플레이어 ON, 볼룸 : "+volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
