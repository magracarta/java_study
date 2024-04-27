package poly.ex.pay0;

//static 이므로 생성하지 말라고 제한을 두기위해abstract로 만들어 둠
public abstract class PayStore {
    public static Payment paySet(String option){
        if (option.equals("kakao")) return new KakaoPay();
        else if (option.equals("naver")) return new NaverPay();
        else if (option.equals("new")) return new NewPay();
        else return new DefaultPay();
    }

}
