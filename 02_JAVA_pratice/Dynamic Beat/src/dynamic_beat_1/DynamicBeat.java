package dynamic_beat_1;

import javax.swing.*;
public class DynamicBeat extends JFrame {
    //JFrame -> 자바에서 GUI 텍스트 기반이아닌 그래픽 기반으로 만들기 위해 이미 존재하는 라이브러리의 클래스를 상속받아 작업하는 것
    //단순히 텍스트가아닌 눈으로 즐기는 게임을 만들기 위해서는 필수적인 프로그램.


    public DynamicBeat(){
        setTitle("Dynamic Beat"); //게임이름
        setSize(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT); //사이즈 세팅
        setResizable(false);   //사이즈 조절 안됨
        setLocationRelativeTo(null);//정중앙에 놓기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //게임창을 껏을때 프로그램을 끄는 기능 (안끌시 프로그램이 자동으로 돌아감 필수!!)
        setVisible(true); //우리가 만든창이 정상적으로 화면에 출력하게하는것 : 기본값이  false라 true로 만들어줘야한다.
        //게임창을 눈에 보이게 해준다.
        
        
    }

}
