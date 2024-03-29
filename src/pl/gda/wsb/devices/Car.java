package pl.gda.wsb.devices;

import pl.gda.wsb.Producer;

public class Car {
    public int year;
    public double engineCapacity;
    public final String model;
    public final Producer producer;
    public double value;

    public Car(int year, double engineCapacity, String model, Producer producer, double value) {
        this.year = year;
        this.engineCapacity = engineCapacity;
        this.model = model;
        this.producer = producer;
        this.value = value;
    }

    @Override
    public String toString() {
        return "pl.gda.wsb.devices.Car{" +
                "year=" + year +
                ", engineCapacity=" + engineCapacity +
                ", model='" + model + '\'' +
                ", producer=" + producer +
                ", value=" + value +
                '}';
    }
}
