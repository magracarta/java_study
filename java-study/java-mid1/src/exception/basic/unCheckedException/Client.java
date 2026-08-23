package exception.basic.unCheckedException;

public class Client {
    public void call(){
        throw new MyUnCheckedException("ex");
    }
}
