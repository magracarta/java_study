package nested.inner.ex2;


public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model , int ChageLevel ){
        this.model = model;
        this.chargeLevel = ChageLevel;
        this.engine = new Engine();
    }

    //Engine에서만 사용하는 메서드
    public String getModel() {
        return model;
    }

    //Engine dptjaks tkdydgksms aptjem
    public int getChargeLevel() {
        return chargeLevel;
    }
    
    public void start(){
        engine.start();
        System.out.println(model+"시작완료");
    }

    private class Engine{


        public void start(){
            System.out.println("충전 레벨 확인: " + chargeLevel);
            System.out.println( model + "의 엔진을 구동합니다.");
        }
    }



}
