public class Phone {
    private String producer;
    private String model;
    private double size;

    public Phone(String producer, String model, double size) {
        this.producer = producer;
        this.model = model;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", size=" + size +
                '}';
    }
}

