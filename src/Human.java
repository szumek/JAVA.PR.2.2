import java.util.Objects;

public class Human {
    public String firstName;
    public String lastName;
    public String position;
    public double salary;
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
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                ", pet=" + pet +
                ", car=" + car +
                '}';
    }
}
