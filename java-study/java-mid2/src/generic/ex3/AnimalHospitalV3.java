package generic.ex3;


import generic.animall.Aniamll;

public class AnimalHospitalV3<T extends Aniamll> {
    private T animal;

    public void set(T animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름: "+ animal.getName());
        System.out.println("동물 크기: "+ animal.getSize());
        animal.sound();
    }
    public T bigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
