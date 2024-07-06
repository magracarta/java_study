package generic.ex3;

import generic.animall.Aniamll;

public class AnimalHospitalV1 {
    private Aniamll animal;

    public void set(Aniamll animal){
        this.animal = animal;
    }

    public void checkup(){
        System.out.println("동물 이름: "+ animal.getName());
        System.out.println("동물 크기: "+ animal.getSize());
        animal.sound();
    }
    public Aniamll bigger(Aniamll target){
        return animal.getSize() > target.getSize() ? animal : target;
    }

}
