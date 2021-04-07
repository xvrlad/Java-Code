public class Gleep {
    private String name;
    private double weight;

    Gleep(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() {
        return String.format("A %.2f kg Gleep called %s.", this.weight, this.name);
    }

    public void eat(int addWeight) {
        this.weight += (2 * addWeight);
        System.out.println("Yummy");
    }

    public void move() {
        if (this.weight < 100) {
            System.out.println("OK, OK, I'm moving.");
        } else {
            System.out.println("Too fat to move.");
        }
    }

    public void setName(String newName) {
        this.name = newName;
    }
    public void setWeight(int newWeight) {
        this.weight = newWeight;
    }
    public String getName() {
        return this.name;
    }
    public double getWeight() {
        return this.weight;
    }
}
