public class Car {
    public int year;
    public double engineCapacity;
    public final String model;
    public final String producer;

    public Car(int year, double engineCapacity, String model, String producer) {
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.model = model;
        this.producer = producer;
    }
}
