public class Main {
    public static void main(String[] args){
        System.out.println("Hello world!");

        Human human1 = new Human("Janusz", "Kowalski", "Tester", 12000);
        Human human2 = new Human("Andrzej", "Kowalczyk", "Team Manager", 18000);


        Phone phone1 = new Phone("Samsung", "Galaxy S III", 6.9);
        Phone phone2 = new Phone("Iphone", "12 pro", 7.5);

        Animal animal1 = new Animal("Zefir", "Parrot", 5, 0.6);
        Animal animal2 = new Animal("Zeus", "Dog", 3, 26);

        Animal animalWithMaxWeight = animal1.weight > animal2.weight ? animal1 : animal2;

        System.out.println("The heaviest animal is " + animalWithMaxWeight.name + ". Its weight is: " + animalWithMaxWeight.weight + " kg.");
    }
}
