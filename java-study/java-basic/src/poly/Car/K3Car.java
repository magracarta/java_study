package poly.Car;

public class K3Car implements Car{
    @Override
    public void starEngine() {
        System.out.println("K3Car.starEngine");
    }

    @Override
    public void offEngine() {
        System.out.println("K3Car.offEngine");
    }

    @Override
    public void pressAccelator() {
        System.out.println("k3Car.pressEngine");
    }
}
