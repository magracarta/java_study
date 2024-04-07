package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("학생수를 입력하세요. : ");
        int count = sc.nextInt();
        int [][] StudentsScore = new int[count][3];
        int [] studentsSum = new int[count];
        double [] studentsAvg = new double[count];
        String [] studentsName = {"국어", "영어", "수학"};


        for (int i = 0; i < StudentsScore.length; i++) {
                int sum = 0, avg;
                System.out.println((i+1)+"번 학생의 성적을 입력하세요 : ");
            for (int j = 0; j < StudentsScore[i].length; j++) {
                System.out.print(studentsName[j]+" 점수 :");
                StudentsScore[i][j] = sc.nextInt();
                studentsSum[i] += StudentsScore[i][j];
            }
            studentsAvg[i] = (double)studentsSum[i]/StudentsScore[i].length;
        }

        for (int i = 0; i < StudentsScore.length; i++) {
            System.out.println((i+1)+"번 학생의 총점: "+studentsSum[i] + ", 평균 : "+ studentsAvg[i]);
        }


    }
}
