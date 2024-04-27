package poly.ex.pay0;


public class PayService {
    private Payment payment;
    //사용자에겐 페이 서비스만 접근가능하고 어떤식으로 결제 수단이 정해지는 지 알수 없다.
    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);
        payment = PayStore.paySet(option);
        boolean result = payment.pay(amount);

        if (result) System.out.println("결제가 성공했습니다.");
        else System.out.println("결제가 실패했습니다.");

    }



}
