package ref;

public class NullMain1 {
    public static void main(String[] args) {
        Data data =null;
        System.out.println(data);
        data =  new Data();
        System.out.println(data);
        data =null;
        System.out.println(data);
        // 자바는 아무도 참조하지 앟는 인스턴스가 잇으면 jvm(java virutaul machine)의 GC(Garbage Collection)가
        // 더이상 사용하지 않는 인스턴스라 판단하고 해당 인스턴스를 자동으로 메모리에서 제거 해준다.

        
    }
}
