package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import pl.gda.wsb.devices.Phone;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");

        Animal animal1 = new Animal("Zefir", "Parrot", 5, 0.6);
        Animal animal2 = new Animal("Zeus", "Dog", 3, 26);

        Car car1 = new Car(1997, 2.0, "A5", Producer.KIA, 18000);

        Human human1 = new Human("Janusz", "Kowalski", "Tester", 12000, animal1, car1);
        Human human2 = new Human("Andrzej", "Kowalczyk", "Team Manager", 18000, animal2, car1);
        Human human3 = new Human("Andrzej", "Kowalczyk", "Team Manager", 18000, animal2, car1);


        Phone phone1 = new Phone("Samsung", "Galaxy S III", 6.9);
        Phone phone2 = new Phone("Iphone", "12 pro", 7.5);

        Animal animalWithMaxWeight = animal1.getWeight() > animal2.getWeight() ? animal1 : animal2;

        System.out.println("The heaviest animal is " + animalWithMaxWeight.name + ". Its weight is: " + animalWithMaxWeight.getWeight() + "kg.");

        StringBuilder animaldesc = new StringBuilder("The heaviest animal is ").
                append(animalWithMaxWeight.name).
                append(". Its weight is: ").
                append(animalWithMaxWeight.getWeight()).
                append("kg.");
        System.out.println(animaldesc);

        ArrayList<Human> humanslist = new ArrayList<>();
        humanslist.add(human1);
        humanslist.add(human2);

        for (Human human : humanslist){
            System.out.println(human.firstName);
        }

        animal1.takeForWalk();
        animal1.takeForWalk();
        animal1.takeForWalk();
        animal1.feed();
        animal1.feed();
        animal1.feed();
        animal2.takeForWalk();
        animal2.takeForWalk();
        animal2.takeForWalk();
        animal2.feed();
        animal2.feed();
        animal2.feed();

        if(human2.equals(human3)) System.out.println("Wynik porównania: TRUE");
        else System.out.println("Wynik porównania: FALSE");

        System.out.println(human1.toString());
        System.out.println(phone1.toString());
        System.out.println(car1.toString());
        System.out.println(animal1.toString());

        human1.setSalary(14700.0);
        human1.setSalary(-14700.0);
        System.out.println("Salary: " + human1.getSalary());

        human1.setCar(car1);
    }
}
