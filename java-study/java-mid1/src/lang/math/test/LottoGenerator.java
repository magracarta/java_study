package lang.math.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class LottoGenerator {
    private final Random random = new Random();
    private int [] lottoNumbers;
    private int count;

    public int[] generate(){
        lottoNumbers = new int[6];
        count = 0;
        while ( count < lottoNumbers.length){
            int randomNumber = random.nextInt(45)+1;
            System.out.println(randomNumber);

           /* if(Arrays.stream(lottoNumbers).noneMatch(((Integer) randomNumber)::equals)) {
                lottoNumbers[count] = randomNumber;
                count++;
            }*/
            if(isUnique(randomNumber)){
                lottoNumbers[count] = randomNumber;
                count++;
            }
        }


        System.out.println(Arrays.toString(lottoNumbers));

        return lottoNumbers;
    }
    private boolean isUnique (int number){
        for(int i = 0;  i < count; i++) {
            if(lottoNumbers[i] == number){
                return false;
            }
        }

        return true;
    }
}
