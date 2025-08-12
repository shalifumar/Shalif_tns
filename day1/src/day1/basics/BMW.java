package day1.basics;

public class BMW { // parent or super class
    void show() {
        System.out.println("Hii");
    }

    BMW(int a, int b) {
        System.out.println("BMW constructor with a = " + a + ", b = " + b);
    }

    class Ferrari extends BMW { // child or subclass
        Ferrari(int a, int b) {
            super(a, b);
        }
    }

    public static void main(String[] args) {
        BMW obj = new BMW(10, 20); // Pass parameters
        obj.show();
    }
}
