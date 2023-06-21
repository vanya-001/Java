class Shape{
    String color;

    public void area(){
        System.out.println("Displays area");
    }
}

class Triangle extends Shape{  //Single level
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class EquilateralTriangle extends Triangle{ //Multi-level
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

class Circle extends Shape{   //Hierarchial 
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "Red";
    }
}
