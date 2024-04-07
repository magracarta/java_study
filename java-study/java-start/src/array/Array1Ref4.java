package array;

public class Array1Ref4 {
    public static void main(String[] args) {
        int [] students = {90,80,70,60,50,40,30,20,10}; //배열 생성과 초기화 (자바를 new int[] 를 추정해서 만들어줌)
         /* 하지만 선언과 동시에 초기화 일때만 오류가 나지 않는다. */

        //변수 값을 사용
        for(int i=0; i<students.length; i++){
            System.out.println("학생 "+(i+1)+" 점수 : "+students[i]);
        }

       
    }
}
