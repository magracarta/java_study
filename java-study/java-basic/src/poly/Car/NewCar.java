package poly.Car;

public class NewCar implements Car {
    @Override
    public void starEngine() {
        System.out.println("NewCar.starEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("NewCar.offEngine");
    }

    @Override
    public void pressAccelator() {
        System.out.println("NewCar.pressAccelator");
    }



}
