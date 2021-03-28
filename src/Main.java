import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");

        Human human1 = new Human("Janusz", "Kowalski", "Tester", 12000);
        Human human2 = new Human("Andrzej", "Kowalczyk", "Team Manager", 18000);


        Phone phone1 = new Phone("Samsung", "Galaxy S III", 6.9);
        Phone phone2 = new Phone("Iphone", "12 pro", 7.5);

        Animal animal1 = new Animal("Zefir", "Parrot", 5, 0.6);
        Animal animal2 = new Animal("Zeus", "Dog", 3, 26);

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

        Car car1 = new Car(1997, 2.0, "A5", "Audi");
        human1.car = car1;
    }
}
