package class1;

public class CalssStart3 {
    public static void main(String[] args) {
        /*
        * 타입은 데이터의 종류나 형태를 나타낸다.
        * 클래스는 설계도이다.
        * 객체는 주소값을 참조해서 보관하기 떄문에
        * */
        Student studen1;
        studen1 = new Student();
        studen1.name = "학생1";
        studen1.age = 15;
        studen1.grade = 90;


        Student studen2 = new Student();
        studen2.name = "학생2";
        studen2.age = 16;
        studen2.grade = 80;

        Student student1Clone = studen1;

        System.out.println(studen1);
        System.out.println(studen2);

        System.out.println("이름 : "+ studen1.name + " 나이 : " + studen1.age + " 성적 : " +studen1.grade );
        System.out.println("이름 : "+ studen2.name + " 나이 : " + studen2.age + " 성적 : " +studen2.grade );
    }

}
