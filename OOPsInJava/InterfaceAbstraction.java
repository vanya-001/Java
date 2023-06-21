interface Animal{
    int eyes =2;
    void walk();
}

interface Herbivore{

}
class Horse implements Animal, Herbivore{ //Multiple Inheritance
    public void walk(){
        System.out.println("Walks on 4 legs");
    }
}

public class InterfaceAbstraction {
    
}
