package lang.string.test;

public class TestString9 {
    public static void main(String[] args) {
        String email = "hello@example.com";
        String [] idEmail = email.split("@");
        String id = idEmail[0];
        String domain = idEmail[1];

        System.out.println("ID : " + id);
        System.out.println("Domain : " + domain);

    }
}
