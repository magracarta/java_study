package poly.ex4;

public abstract class AbstractAnimal {
    public abstract void sound();

    public void move(){ // 상속받아 움직이게 하는
        System.out.println("동물이 움직입니다.");
    }
}
