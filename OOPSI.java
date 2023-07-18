package apnacollege;

// Hybrid Inheritance
class Shape{
    public void area() {
        System.out.println("Display Area");
    }

}
// Single Inheritance
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}
// Multi- Level Inheritance
class EquilateralTriangle extends Triangle {
    public void area(int l, int h) {
        System.out.println(1/2*l*h);
    }
}

// Hierarchial Inheritance
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}

public class OOPSI {
    public static void main(String[] args) {
        
    }
}
