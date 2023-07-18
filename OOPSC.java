package apnacollege;

class Pen{
    String color;
    String type;

    public void write() {
        System.out.println("writing something");
    }

    public void printColor() {
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo() {
        System.out.println("Name : "+this.name);
        System.out.println("Age : "+this.age);
    }

    Student(){
    }

    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
}
public class OOPSC{
    public static void main(String[] args) {
        
       Student s1 = new Student();
       s1.name = "Aman";
       s1.age = 24;

       Student s2 = new Student(s1);
       s2.printInfo();
    }
    
    
}