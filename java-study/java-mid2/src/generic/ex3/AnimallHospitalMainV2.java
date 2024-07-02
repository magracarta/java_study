package generic.ex3;

import generic.animall.Aniamll;
import generic.animall.Cat;
import generic.animall.Dog;

public class AnimallHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHostpital = new AnimalHospitalV2<Dog>();
        AnimalHospitalV2<Cat> catHostpital = new AnimalHospitalV2<Cat>();
        AnimalHospitalV2<Aniamll> animallHostpital = new AnimalHospitalV2<Aniamll>();
        AnimalHospitalV2<Integer> integerHostpital = new AnimalHospitalV2<>();
        AnimalHospitalV2<Object> objectHostpital = new AnimalHospitalV2<>();
    }
}
