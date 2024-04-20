package access.b;

import access.a.AccessData;

public class AccessOuterMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();
        //public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        //같은 패키지 디폴트 호출
        //data.defaultFiel = 2;
        //data.defaultMethod();


        //data.privateField = 3;
        //data.privateMethod;


        data.innerAccess();

    }
}
