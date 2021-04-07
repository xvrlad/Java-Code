//Q9
//public class Animal {
//    protected String name;
//    public Animal(String name) { this.name = name; }
//    public void print() {
//        System.out.println(getClass().getName());
//    }
//
//    public static void printAnimals(Animal[] animals) {
//        for (int i = 0; i < animals.length; i++) {
//            animals[i].print();
//        }
//    }
//
//    public static void main(String[] args) {
//        Sloth sTwoToed = new Sloth("Sloth Two-Toed", false, 500);
//        Sloth sThreeToed = new Sloth("Sloth Three-Toed", false, 1000);
//        Sloth[] sArray = new Sloth[2];
//        sArray[0] = sTwoToed;
//        sArray[1] = sThreeToed;
//        printAnimals(sArray);
//    }
//}
//class Mammal extends Animal {
//    protected boolean nocturnal;
//    public Mammal(String name, boolean nocturnal) {
//        super(name);
//        this.nocturnal = nocturnal;
//    }
//}
//class Sloth extends Mammal {
//    private int population;
//    public Sloth(String name, boolean nocturnal, int population) {
//        super(name, nocturnal);
//        this.population = population;
//    }
//}

public abstract class Animal {
    public abstract void canDo();
}

class Human extends Animal {
    public void canDo() {
        System.out.println("I can walk and run");
    }
}

class Snake extends Animal {
    public void canDo() {
        System.out.println("I can crawl");
    }
}

class Dog extends Animal {
    public void canDo() {
        System.out.println("I can bark");
    }
}

class Lion extends Animal {
    public void canDo() {
        System.out.println("I can roar");
    }
}