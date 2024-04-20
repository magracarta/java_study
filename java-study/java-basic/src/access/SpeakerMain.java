package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);

        speaker.showVolume();
        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.volumeUp();


        speaker.showVolume();
        speaker.volumeUp();

        speaker.volumeDown();

        //필드에 직접 접근
        System.out.println("volume 필드 직업 접근 수정");
        //speaker.volum = 200; //private 접근 제어자가 접근을 막아서 코드를 수정하는 것을 막는다.
        speaker.showVolume();
        speaker.volumeDown();
        speaker.showVolume();

    }
}
