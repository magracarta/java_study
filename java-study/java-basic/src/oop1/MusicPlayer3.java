package oop1;

public class MusicPlayer3 {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        volumUp(data);
        volumUp(data);
        volumDown(data);
        musicState(data);
        off(data);

    }

    static void on(MusicPlayerData data){
        //음악 플레이어켜기
        data.isOn = true;
        System.out.println("음막 플레이어를 시작합니다.");
    }

    static void off(MusicPlayerData data){
        //음악플레이어 끄기
        data.isOn = false;
        System.out.println("음막 플레이어를 종료합니다.");
    }

    static void volumUp(MusicPlayerData data){
        //볼륨 증가
        data.volume++;
        System.out.println("음악 플레이더 볼륨 : " + data.volume );
    }

    static void volumDown(MusicPlayerData data){
        //볼륨감소
        data.volume--;
        System.out.println("음악 플레이더 볼륨 : " + data.volume );
    }

    static void musicState(MusicPlayerData data){
        //음악플레이어 상태
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼룸 : "+data.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
