package bigch03.ch06;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();

        Animal tAnimal = new Tiger();

        Animal eAnimal = new Eagle();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(hAnimal);
//        test.moveAnimal(tAnimal);
//        test.moveAnimal(eAnimal);

        ArrayList<Animal> arrayList = new ArrayList<>();
        arrayList.add(new Human());
        arrayList.add(new Tiger());
        arrayList.add(new Eagle());

        for (Animal animal : arrayList) {
            animal.move();
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}
