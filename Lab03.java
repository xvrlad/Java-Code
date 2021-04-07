public class Lab03 {
    public static void main(String[] args){
        MyPowint p1 = new MyPowint(2,9);
        MyPowint p2 = new MyPowint(2,9);
        System.out.println(p1==p2);
    }
}

class MyPowint {
    public int x;
    public int y;

    MyPowint() {
        x = 0;
        y = 0;
    }

    MyPowint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    MyPowint(MyPowint point) {
        this.x = point.x;
        this.y = point.y;
    }

    public String toString() {
        return String.format("(%d, %d)", this.x, this.y);
    }
}
