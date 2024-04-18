package pack;

import pack.a.User;

public class PackageMain1 {
    public static void main(String[] args) {
        Data data = new Data();
        //클래스가 다른 경로에 있으면 아래와같이 경로를 작성해주면된다.
        pack.a.User user1 = new pack.a.User();
        User user2 = new User();
    }
}
