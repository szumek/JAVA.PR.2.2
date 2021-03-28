package pl.gda.wsb;

import pl.gda.wsb.devices.Car;
import java.util.Date;
import java.util.Objects;

public class Human {
    public String firstName;
    public String lastName;
    public String position;
    private double salary;
    public Animal pet;
    public Car car;

    public Human(String firstName, String lastName, String position, double salary, Animal pet, Car car) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.salary = salary;
        this.pet = pet;
        this.car = car;
    }

    public double getSalary() {
        System.out.println(new Date() + ": Pobrano informacje o wysokości zarobków - " + this);
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) System.out.println("Nikt nie będize dokładał do pracy!");
        else {
            System.out.println("Nowe dane zostały wysłane do systemu księgowego.");
            System.out.println("Nowy aneks do umowy jest do odebrania u Pani Hani z działu kadr.");
            System.out.println("ZUS i US wiedzą już o zmianie wypłaty i nie ma sensu ukrywać dochodu.");
            this.salary = salary;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Double.compare(human.salary, salary) == 0 && firstName.equals(human.firstName) && lastName.equals(human.lastName) && position.equals(human.position) && pet.equals(human.pet) && car.equals(human.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, position, salary, pet, car);
    }

    @Override
    public String toString() {
        return "pl.gda.wsb.Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
