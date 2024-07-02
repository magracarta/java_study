package generic.animall;

public class Aniamll {
    private String name;
    private int size;

    public Aniamll(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void sound(){
        System.out.println("동물 울음 소리");
    }

    @Override
    public String toString() {
        return "Aniamll{" +
                "size='" + name + '\'' +
                ", age=" + size +
                '}';
    }
}
