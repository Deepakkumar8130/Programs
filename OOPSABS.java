package apnacollege;

abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("You are creating a new Animal");
    }
    public void eats(){
        System.out.println("Animals eats");
    }
}
class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk() {
        System.out.println("Walks on 4 legs");
        
    }
}

class Chicken extends Animal{
    public void walk() {
        System.out.println("Walks on 2 legs");
        
    }
}
public class OOPSABS {
    public static void main(String[] args) {
        // Horse horse = new Horse();
        
    }
}
