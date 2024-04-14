package construct;


public class MethodMain3 {
    public static void main(String[] args) {
        Memberinit member1 = new Memberinit();
        member1.initMember( "uese1",15,90);

        Memberinit member2 = new Memberinit();
        member1.initMember( "uese2",16,80);

        Memberinit[] members = {member1 , member2};


        for(Memberinit member: members){
            System.out.println("이름 : " + member.name + " 나이 : " + member.age + " 점수 : " + member.grade );
        }


    }



}
