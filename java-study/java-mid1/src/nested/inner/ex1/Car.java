package nested.inner.ex1;

public class Car {
    private String model;
    private int chargeLevel;
    private Engine engine;

    public Car(String model , int ChageLevel ){
        this.model = model;
        this.chargeLevel = ChageLevel;
        this.engine = new Engine(this);

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


}
