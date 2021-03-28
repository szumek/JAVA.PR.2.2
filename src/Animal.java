public class Animal{
    public String name;
    public final String species;
    public int age;
    private double weight;

    final Double DEFAULT_WEIGHT_PARROT = 2.5;
    final Double DEFAULT_WEIGHT_DOG = 20.0;
    final Double DEFAULT_WEIGHT = 50.0;

    public Animal(String name, String species, int age, double weight) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public Animal(String name, String species) {
        this.name = name;
        this.species = species;
        if(species.equals("Dog")){
            this.weight = DEFAULT_WEIGHT_DOG;
        } else if(species.equals("Parrot")) {
            this.weight = DEFAULT_WEIGHT_PARROT;
        } else this.weight = DEFAULT_WEIGHT;
    }

    public double getWeight(){
        return weight;
    }

    void feed(){
        if (weight <= 0) {
            System.out.println(this.species + " --> To late :(");
        } else {
            weight++;
            System.out.println(this.species + " --> thanks :D my weight is now: " + this.weight);
        }
    }

    void takeForWalk() {
        weight--;
        if(weight <= 0){
            System.out.println(this.species + " --> No! You can't go for walk with dead pet");
        } else if (weight <= 3) {
            System.out.println(this.species + " --> Yeaah! :D but I am hungry...");
        } else {
            System.out.println(this.species + " --> Thanks for a walk bro, my weight is now: " + this.weight);
        }

    }
}
