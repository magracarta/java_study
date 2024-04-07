package array;

public class EnhancedFor1 {
    public static void main(String[] args) {
        // 2*3 2차원 배열을 만든다.
        int [] arr = {1,2,3,4,5};


        /* 향상된 for문 for-each문 */
        for (int x : arr){
            System.out.println(x);
        }

        //for-eahc문을 사용할수 없는 경우 , 증가하는 idex값 필요
        for (int i =0; i < arr.length; i++ ){
            System.out.println("number"+i + "번의 결과는"+ arr[i]);
        }


    }
}
