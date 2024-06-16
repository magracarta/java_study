package nested.anonymous.ex;

public class Ex0Main {

    public static void Hello(CodingText text){
        System.out.println("프로그램 시작"); //변하지 않는 부분
        System.out.println("Hello " + text.getText() ); //변하는 부분
        System.out.println("프로그램 종료"); //변하지 않는 부분
    }
    public static void main(String[] args) {
        Hello(CodingText.JAVA);
        Hello(CodingText.SPRING);
    }


    enum CodingText{
        JAVA("Java") , SPRING("Spring");
        private String text;
        CodingText(String text){
            this.text = text;
        }
        public String getText(){
            return text;
        }

    }
}
