package static2.EX;

public class MathArrayUtils {
    private MathArrayUtils() {
        //private로 인스턴스 생성을 막는다.
    }


    public static int sum(int[] values) {
        int total = 0;
        for(int value: values){
            total += value;
        }
        return total;
    }

    public static int average(int[] values) {
        int avg =0;
        return sum(values) / values.length;
    }

    public static int min(int[] values) {
        int min = values[0];
        for(int i =1; i < values.length; i++){
            if(min > values[i]){
                min = values[i];
            }
        }
        return min;
    }

    public static int max(int[] values) {
        int max = values[0];
        for(int i =1; i < values.length; i++){
            if(max < values[i]){
                max = values[i];
            }
        }
        return max;
    }
}
