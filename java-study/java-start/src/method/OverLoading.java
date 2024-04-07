package method;

public class OverLoading {
    public static void main(String[] args) {
        OverLoading o = new OverLoading();

        o.add("hi");
    }


    public void add(int a , int b){

    }

    public void add(String b){

    }
    public int add(double a , int b){
        return 0;
    }
}
