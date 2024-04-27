package poly.Car;

public class CarMain {
    public static void main(String[] args) {
        Driver driver = new Driver();

        //차량 선택(K3)
        Car k3Car = new K3Car();
        driver.setCar(k3Car);
        driver.drive();

        //차량 변경 (k3Car -> model3Car)
        Car model3Car = new Model3Car();
        driver.setCar(model3Car);
        driver.drive();


        //차량 변경 (model3Car -> newCar)
        Car newCar = new NewCar();
        driver.setCar(newCar);
        driver.drive();
    }
}
