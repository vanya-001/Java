abstract class Animal{
    Animal(){
        System.out.println("You are creating a new animal");
    }

    abstract void walk();
    
    public void eats(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }

    public void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walks on 2 legs");
    }
}

public class Abstractions {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.walk();

        // Animal a = new Animal(); 
        // Error => Cannot instantiate the type Animal.
        // a.walk();
    }
}
