package array;

public class Array1Ref2 {
    public static void main(String[] args) {
        int [] students; //배열 변수 선언 (레퍼러 참조 변수 -> 주소값이 있음)

        //참조값만 들어가있음
        students = new int [5];
        students[0]=90;
        students[1]=80;
        students[2]=70;
        students[3]=60;
        students[4]=60;


        //변수 값을 사용
        for(int i=0; i<students.length; i++){
            System.out.println("학생 "+(i+1)+" 점수 : "+students[i]);
        }

       
    }
}
