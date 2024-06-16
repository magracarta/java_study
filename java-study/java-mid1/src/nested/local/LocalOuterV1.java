package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar =3;
    public void process(int paramVar){
        int locarVar = 1;
        class LocalPrinter{
            int value = 0;
            public void printData(){
                System.out.println("value = " + value);
                System.out.println("localvar = " + locarVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("outInstanceVar = " + outInstanceVar);
            }
        }

        LocalPrinter printer = new LocalPrinter();
        printer.printData();
    }

    public static void main(String[] args) {
        LocalOuterV1 local = new LocalOuterV1();
        local.process(2);
    }
}
