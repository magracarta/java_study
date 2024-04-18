package pack;

import pack.a.User;

public class PackageMain3 {
    public static void main(String[] args) {
        User userA = new User();
        pack.b.User userB = new pack.b.User();
        //이름이 같고 패키지가 다른 경우->
        //하나는 경로를 다 써줘야한다.


    }
}
