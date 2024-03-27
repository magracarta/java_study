package com.ohgiraffers.section03.copy;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Application3 {
    public static void main(String[] args) {
        /* 깊은 복사에 대해 이해할 수 있다. */
        /*
        * 깊은 복사는 heap에 생성된 배열이 가지고 있는 값을
        * 또 다른 배열에 복사를 해놓은 것이다.
        * 서로 같은 값을 가지고 있지만, 두 배열은 서로 다른 배열이기 떄문에
        * 하나의 배열을 변경 하더라도 다른 배열에는 영향을 주지 않는다.
        * */

        /*
        * 깊은 복사를 하는 방법은 4가지가 있습니다.
        * 1. for문을 이용한 동일한 인덱스 값 복사
        * 2. Object의 clone()을 이용한 복사
        * 3. System의 arraycopy()를 이용한 복사
        * 4. Array의 copyOf()를 이용한 복사
        *   이 중에 가장 높은 성능을 보이는 것은 순수 배열의 복사를 위해 만들어진 arraycopy()메소드이며,
        *   가장 많이 사용되는 좀더 유연한 방식인 copyOf() 메소드이다.
        *   clone()은 이전 배열과 같은 배열밖에 만들수 없다는 특징을 가지고
        *   그 외게 3가지 방법은 복사하는 배열의 길이를 마음대로 조절할 수 있다는 특징을 가지고 있다.
        * */

        int[] originArr = new int[]{1,2,3,4,5}; //1283928880

        print(originArr);

        /* 1. for문을 통해서 동일한 인덱스 값 복사 */
        int[] copyArr = new int[10]; //1989780873

        for (int i =0; i < originArr.length; i++){
            copyArr[i] = originArr[i];
        }

        /*
        sarr.hashCode() = 1283928880
        1 2 3 4 5
        sarr.hashCode() = 1989780873
        1 2 3 4 5 0 0 0 0 0

        주소값은 달라지지만 값은 가지고 올수있다.
        * */

        print(copyArr);

        /* 2. Object의 clone()을 이용한 복사 */
        int[] copyArr2 = originArr.clone(); //1480010240
        print(copyArr2);


        /* 3.System의 arraycopy()을 이용한 복사 */
        int[] copyArr3 = new int[10];
        /* 원본배열. 복사를 시작할 인덱스, 복사할 배열, 복사를 시작할 인덱스, 복사를 시작할 길이의 의미를 가진다. */
        System.arraycopy(originArr, 0, copyArr3 , 2, originArr.length);
        print(copyArr3);


        /* 4. Arrays의 copyOf()를 이용한 복사 */
        int[] copyArr4 = Arrays.copyOf(originArr,7); //1828972342
        print(copyArr4);


      
        /* 복습겸 테스트 해보기 */
        int[] copyTest1 = originArr.clone();
        int[] copyTest2= new int[8];
        System.arraycopy(originArr, 2, copyTest2,0,originArr.length-2);
        int[] copyTest3 = Arrays.copyOf(originArr,10);
        print(copyTest1);
        print(copyTest2);
        print(copyTest3);
        /* 테스트 해보기 */
    }

    public static void print(int[] iarr) {
        //다른 메소드에서 동일한 배열을 사용하고 싶을때 얕은 복사를 한다.
        System.out.println("sarr.hashCode() = " + iarr.hashCode()); //1989780873
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

    }
}
