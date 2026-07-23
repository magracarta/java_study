package enumeration.test1;

public enum AuthGrade {
    GUEST(1,"손님")
    , LOGIN(2,"로그인 회원")
    , ADMIN(3,"관리자");

    public final int lever;
    public final String description;
    AuthGrade(int lever, String description) {
        this.lever = lever;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getLever() {
        return lever;
    }
}
