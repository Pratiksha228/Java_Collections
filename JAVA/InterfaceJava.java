//Implementating multiple inheritance by using Interfaces
interface Animall{
    int eyess = 2;
    void walk();
    void eat();
}

interface Herbivoree{
    void walk();
}

class Horsee implements Animall, Herbivoree{
    public void walk(){
        System.out.println("Animal can walk");
    }
    public void eat(){
        System.out.println("Animal is eating grass");
    }
}
public class InterfaceJava {
    public static void main(String[] args){
        Horsee horse2 = new Horsee();
        horse2.walk();
        horse2.eat();
    }
    
}
