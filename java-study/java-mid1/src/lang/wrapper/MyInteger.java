package lang.wrapper;

public class MyInteger {
    private final int value;

    public MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public int compare( int target) {
        if(this.value < target){
            return -1;
        }else if(this.value > target){
            return 1;
        }else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
