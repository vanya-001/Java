class Pen{
    String color;
    String type;
    public void write(){
        System.out.println("Writing Something");
    }
    public void printColor(){
        System.out.println(this.color); //this tells that which object is called.
    }
}

class Student{

    // Non-Parameterized Constructor
    // Student(){
    //     System.out.println("This is a constructor of Student Class");
    // }

    // Parameterised Constructor
    // Student(String name, int age){
    //     this.name = name;
    //     this.age =age;
    // }

    // Copy Constructor
    // Student(Student s2){
    //     this.name = s2.name;
    //     this.age =s2.age;
    // }
    String name;
    static String school;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    public static void changeSchool(){
        school = "New School";
    }
}

public class Example {
    public static void main(String[] args) {
        //s1 name of the object
        // new is to create a object
        // Student() => constructor
        Pen pen1 = new Pen();
        pen1.color = "red";
        pen1.type = "gel";
        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball";

        pen1.printColor();
        pen2.printColor();

        // Non-Parameterised Constructor
        // Student s1 = new Student(); 
        // s1.name = "Vanya";
        // s1.age = 21;

        // Parameterised Constructor
        // Student s1 = new Student("Vanya", 20);
        

        // Copy Constructor
        // Student s1 = new Student(null);
        // s1.name = "Vanya"; 
        // s1.age = 20;

        // Student s2 = new Student(s1);
        // s2.printInfo();


        // Static keyword
        Student.school = "UPES";
        Student s1 = new Student();
        s1.name="Vanya";
        System.out.println(s1.school);
    }
}
