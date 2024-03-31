package dynamic_beat_2;

import javax.swing.*;
import java.awt.*;

public class DynamicBeat extends JFrame {
    //JFrame -> 자바에서 GUI 텍스트 기반이아닌 그래픽 기반으로 만들기 위해 이미 존재하는 라이브러리의 클래스를 상속받아 작업하는 것
    //단순히 텍스트가아닌 눈으로 즐기는 게임을 만들기 위해서는 필수적인 프로그램.


    // 단순히 이미지를 단순히 화면에 띄우게 되면,버퍼링 현상이 심함 -> 더블 버퍼링 기능을 활용하여 이를 해결
    // 현재 프로그램이 전체 화면에 맞게 매순간마다 이미지 생성해서 원하는 컴포넌트를 출력
    // 버퍼에 이미지를 담아서 매순간마다 이미지를 갱신해주기 때문에 게임에서는 빠질수없는 기술이다.
    private Image screenImage;
    private Graphics screenGrapic;
    //전체 화면에 대한 이미지를 담는 두 인스턴스 이다.

    private Image introBaackground;
    // 이미지를 담는 하나의 객체


    public DynamicBeat(){
        setTitle("Dynamic Beat"); //게임이름
        setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT); //사이즈 세팅
        setResizable(false);   //사이즈 조절 안됨
        setLocationRelativeTo(null);//정중앙에 놓기
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //게임창을 껏을때 프로그램을 끄는 기능 (안끌시 프로그램이 자동으로 돌아감 필수!!)
        setVisible(true); //우리가 만든창이 정상적으로 화면에 출력하게하는것 : 기본값이  false라 true로 만들어줘야한다.
        //게임창을 눈에 보이게 해준다.

        introBaackground = new ImageIcon(Main.class.getResource("../images/red_bowers_and_wilkins_p3_headphones-wallpaper-1280x720.jpg")).getImage();
        //이미지 초기화

        
        
    }

     public void paint(Graphics g ){
        screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
        screenGrapic = screenImage.getGraphics();
        screenDraw(screenGrapic);
        g.drawImage(screenImage,0,0,null);

     }

     public void screenDraw(Graphics g){
        g.drawImage(introBaackground, 0, 0, null);
        this.repaint();
     }

}
