package com.ohgiraffers.section01.literal;
import java.math.BigDecimal;

public class Application2 {
    public static void main(String[] args){
        /* 수업목표. 값을 직접 연산하여 출력할 수 있다. */
        /* 값의 형태에 따라 사용할 수 있는 연산자의 종류와 연산의 결과가 달라진다. */

        /* 1. 숫자와 숫자의 연산 */
        /* 1-1 정수와 정수의 연산 */
        /* 수학적으로 사용하는 사칙연산에 추가로 나머지를 구하는 연산을 사용할 수 있다. */
        System.out.println("==============정수와 정수의 연산==============");
        System.out.println(123+456);
        System.out.println(123 - 23); //숫자 사이의 공백은 연산자가 있기때문에 가능
        System.out.println(123*10);
        System.out.println(3/2); //정수와 정수의 값이라 소수점은 보이지 않는다.
        System.out.println(3%2); //나머지 값

        System.out.println(3.0/2.0);

        /* 1-2 실수와 실수의 연산 */
        /* 실수끼리의 연산도 수학에서 사용하는 사칙연산에 나머지를 구하는 연산을 사용할 수 있다. */
        System.out.println("==============실수와 실수의 연산==============");
        System.out.println(1.23 + 1.23);
        System.out.println(1.23-0.23);
        System.out.println(1.23*10.0);
        System.out.println(1.23/10.0);
        System.out.println(1.23 % 1.0); //약간의 오차가 생김.

        /* 1-3 정수와 실수의 연산 */
        /* 정수와 실수의 연산도 수학에서 사용되는 사칙 연산에 나머지를 구하는 연산을 사용할 수 있다. */
        /* 정수와 실수의 연산의 결과는 항상 실수만 나온다. */
        System.out.println("==============정수와 정수의 연산==============");
        System.out.println(123 + 1.0);
        System.out.println(123 - 1.0);
        System.out.println(123 * 1.0);
        System.out.println(123 / 10.0);
        System.out.println(123 / 0.5);
        System.out.println(123 / 0.7);
        System.out.println(123 % 0.7); //약간의 오차가 생김

        System.out.println(0.1 + 0.2);

        //숫자의 오차를 해결하는 방법 BigDecimal 사용하여 활용


        /* 2. 문자의 연산 */
        /* 2-1 문자와 문자의 연산 */
        /* 문자끼리의 연산도 사칙연산에 나머지를 구하는 연산까지 가능하다. */
        /* 지금은 계산 결과가 왜 이렇게 나왔는지 보다 연산이 가능하다는 것에 집중하자! */
        System.out.println("==============문자와 문자의 연산==============");
        System.out.println('a'+'b');
        System.out.println('a'-'b');
        System.out.println('a'*'b');
        System.out.println('a'/'b');
        System.out.println('a'%'b');

        /* 2-2 문자와 정수의 연산 */
        /* 문자에 정수를 연산하는 것도 가능하다. */
        /*
         * 이쯤되면 'a'는 97과 같다는 것을 알 수 있다.
         * 컴퓨터는 문자를 인식하지 못하고 숫자로만 인식할 수 있기 때문에 모든 문자에 대응되는 숫자들이 매칭되어있다.
         * 아스키코드와 유니코드
         *  */
        System.out.println("==============문자와 정수의 연산==============");
        System.out.println('한' + 1);
        System.out.println('a' + 1);
        System.out.println('a' - 1);
        System.out.println('a' * 2);
        System.out.println('a' % 2);

        /* 2-2 문자와 실수와의 연산 */
        /* 실수도 숫자이기 때문에 정수의 연산처럼 모든 연산이 가능하다 */
        /* 단, 결과는 실수 형태로 나오게 된다.( 아까 위에서 했던 정수와 실수의 연산 결과를 생각해보자 ) */
        System.out.println("==============문자와 실수의 연산==============");
        System.out.println('a' + 1.0);
        System.out.println('a' - 1.0);
        System.out.println('a' * 2.0);
        System.out.println('a' / 2.0);
        System.out.println('a' % 2.0);
        System.out.println('a' * 2.0);
        System.out.println('2' + 2.0);

        /* 3. 문자열의 연산 */
        /* 3-1 문자열과 문자열의 연산 */
        /* 문자열과 문자열의 '+' 연산관계는 문자열과 합치기(이어붙이기)가 된다. */
        /* 무자열은 '+' 연산외에 다른 연산은 사용하지 못한다. */
        System.out.println("==============문자열과 문자열의 연산==============");
        System.out.println("hello" + "world");
        //System.out.println("hello" - "world"); //에러발생
        //System.out.println("hello" * "world"); //에러발생
        //System.out.println("hello" / "world"); //에러발생
        //System.out.println("hello" % "world"); //에러발생


        /* 3-2 문자열과 다른 형태의 값 연산 */
        /* 문자열과 연산은 '+' 연산만 가능하다 */
        /* 연산결과는 다른 형태의 값들도 문자열로 취급하여 문자열 이어붙이기(문자열 합치기) 결과가 나오게 된다. */
        System.out.println("==============문자열과 다른 형태의 값 연산==============");
        /* 3-2-1 문자열과 정수의 연산 */
        System.out.println("helloworld"+ 123);
        /* 3-2-2 문자열과 실수의 계산 */
        System.out.println("helloworld"+ 1.21223);
        /* 3-2-3 문자열과 문자의 연산 */
        System.out.println("helloworld"+ 'a');
        /* 3-2-4 문자열과 논리의 연산 */
        System.out.println("helloworld"+ true+false);

        /* 주의 사항 : 숫자로  된 문자열의 형태 값은 '+' 연산자의 결과가 문자열 합치기 결과가 되는 것을 주의하자 */
        System.out.println("==============문자열 형태의 숫자값 '+'연산==============");
        System.out.println("123"+"456");

        /* 4. 논리값 연산 */
        /* 4-1 논리값과 논리값 연산 */
        /* 논리값끼리 연산은 모든 연사자 사용이 불가능하다. */
        //System.out.println(true + false); // 에러 발생
        //System.out.println(true - false); // 에러 발생
        //System.out.println(true * false); // 에러 발생
        //System.out.println(true / false); // 에러 발생
        //System.out.println(true % false); // 에러 발생
        /* boolean끼리는 연산 안됨 */

        /* 4-2 논리값과 정수의 연산 */
        /* 논리값과 정수의 연산은 모든 연산자 사용이 불가능하다. */
        //System.out.println(true+1);
        //System.out.println(true-1);
        //System.out.println(true/1);
        //System.out.println(true%1);
        //System.out.println(true*1);

        /* 4-3 논리값과 실수의 연산 */
        /* 논리값과 실수의 연산은 모든 연산자 사용이 불가능하다. */
        //System.out.println(true+0.1);
        //System.out.println(true-0.11);
        //System.out.println(true/0.1);
        //System.out.println(true%0.1);
        //System.out.println(true*0.1);

        /* 4-4 논리값과 문자의 연산 */

        /* 논리값과 문자의 연산은 모든 연사자 사용이 불가능하다 */
        /* 이유는 문자는 내부적으로 슷자 취급을 하기 떄문에 결국 논리값과 숫자의 연산과 동일하다. */
        //System.out.println(true + 'a');
        //System.out.println(true - 'a');
        //System.out.println(true / 'a');
        //System.out.println(true % 'a');
        //System.out.println(true * 'a');


        /* 4-5 논리값과 문자열의 연산 */
        /* 논리값과 문자열의 연산은 '+' 연산만 가능하다. */
        /* 이유는 위에서 테스트해본 문자열 합치기가 되는 원리와 동일하다. */
        System.out.println("==============논리와 문자열의 연산==============");
        System.out.println("a : "+true); // 문자열 합치기가 됨.
        System.out.println(123+""+true); // 정수 + 문자열빈칸 합치기가 됨.
        //System.out.println("a"-true);
        //System.out.println("a"*true);
        //System.out.println("a"/true);
        //System.out.println("a"%true);


        //숫자의 오차를 해결하는 방법 BigDecimal 사용하여 활용
        //숫자를 문자열로 표현하여 정확한 계산 가능.
        BigDecimal num1 = new BigDecimal("0.1");
        BigDecimal num2 = new BigDecimal("0.2");
        System.out.println(num1.add(num2)); //더하기
        System.out.println(num2.subtract(num1)); //빼기
        System.out.println(num1.multiply(num2)); //곱하기
        System.out.println(num1.divide(num2)); //나누기
        System.out.println(num1.remainder(num2)); //나누기 후 나머지
        System.out.println(num1.min(num2)); //두값 중 최솟값
        System.out.println(num1.max(num2)); //두값 중 최대값
        System.out.println(new BigDecimal("-1.333").abs()); //절대값




    }
}
