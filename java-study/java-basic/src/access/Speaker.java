package access;

public class Speaker {
    private int volum;
    Speaker(int volum){
        this.volum = volum;
    }

    void volumeUp(){
        if(volum >= 100) {
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        }else {
            volum += 10;
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown(){
        if(volum < 0) {
            System.out.println("음량을 감소할 수 없습니다. 최소 음량입니다.");
        }else{
            volum -= 10;
            System.out.println("음량을 10 감소합니다.");
        }
    }

    void showVolume(){
        System.out.println("현재 음량 : "+volum);
    }


}
