package exeption.ex2;

public class NetWorkClientExceptionV2 extends Exception {
    private  String eroorCode;

    public NetWorkClientExceptionV2(String message, String eroorCode) {
        super(message);
        this.eroorCode = eroorCode;
    }

    public String getEroorCode() {
        return eroorCode;
    }
}
