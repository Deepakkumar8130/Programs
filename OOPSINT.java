package apnacollege;


interface Animal{
    int eyes = 2;
    void walk();
}
class Cow implements Animal{
    public void walk(){
        System.out.println("walks on 4 legs");
    }
   
}
public class OOPSINT {
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.walk();
    }
}
