public class Duck {
    private String name;
    private int age;

    Duck(){
        name = "";
        age = 0;
    }
    Duck(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return String.format("%s is %d years old.", this.name, this.age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        if (!(age < 0)) {
            this.age = age;
        }
    }

    public void speak() {
        System.out.printf("%s says Quack.", this.name);
    }

    public static void main(String[] args) {
        Duck animal = new Duck("Jim", 17);
        animal.setAge(-100);
        System.out.println(animal);
    }
}
