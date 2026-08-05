package nested.inner.ex2;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model, int chargeLevel) {
        this.model = model;
        this.chargeLevel = chargeLevel;
        this.engine = new Engine();
    }

    public int getChargeLevel() {
        return chargeLevel;
    }

    public String getModel() {
        return model;
    }

    public void start(){
        engine.start();
        System.out.println(model+"시작 완료");
    }

    private class Engine {
             public void start(){
            System.out.println("충전 레벨확인 : "+getChargeLevel());
            System.out.println(getModel()+"의 엔진을 구동합니다.");
        }


    }

}
