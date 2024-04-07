package array;

import java.io.IOException;

public class Array1Ref1 {
    public static void main(String[] args) {
        int [] students; //배열 변수 선언 (레퍼러 참조 변수 -> 주소값이 있음)
        int ds = 50; // 그냥 자료형은 주소값이 없다

        //참조값만 들어가있음
        students = new int [5];
        students[0]=90;
        students[1]=80;
        students[2]=70;
        students[3]=60;
        students[4]=60;


        //변수 값을 사용
        System.out.println("학생 1  점수 : " + students[0]);
        System.out.println("학생 2  점수 : " + students[1]);
        System.out.println("학생 3  점수 : " + students[2]);
        System.out.println("학생 4  점수 : " + students[3]);

        System.out.println(students.hashCode());

       
    }
}
