package access.b;

import access.a.AccessData;

//퍼블릭 클래스는 반드시 파일명과 같아야한다.
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
