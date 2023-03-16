interface Animal{
    int eyes = 2;
    String color = "Purple";
    public void walk();

    }
   class Horse implements Animal{
    public void walk(){
        System.out.println("Walking");
    }
   }
public class Interfaces {
    public static void main(String[] args){
        Horse horse1 = new Horse();
        horse1.walk();

    }
}
    

