package final1.ex;

public class MemberMain {
    public static void main(String[] args) {
        Member member = new Member("myId" , "kim");
        member.print();
        member.changeData("seo");
        member.print();
        int d = 8;
        String sw = switch ( d){
            case 1 -> "곱하기";
            case 2 -> "나누기";
            case 3 -> "빼기";
            default -> "아무것도 안하기";
        };

        System.out.println(sw);
    }
}
