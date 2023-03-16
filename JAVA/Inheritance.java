//Base class or Parent class 
class Shape{
    public void area(){
        System.out.println("Area displays");
    }

}

//child/sub-class class or Derived class
class Triangle extends Shape{
    public void area(int l, int h){
        System.out.println("Area of the triangle: "+ 1/2*l*h);
    }

}
class Circle extends Triangle{
    public void area(int r){
        System.out.println("Area of the circle: "+ (3.14)*r*r);
    }

}

public class Inheritance {
    public static void main(String[] args){
        Triangle t1 = new Triangle();
        t1.area();
        t1.area(2,3);
        //t1.area(4);


    }
}
