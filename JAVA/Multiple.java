interface Animal1{
    int eyes = 2;
    void walk();
}
interface Herbivore{

}

class Horse implements Animal1,Herbivore{
    public void walk(){
        System.out.println("He can walk");
    }
}
public class Multiple {
    public static void main(String[] args){
        Horse horse11 = new Horse();
        horse11.walk();
    }
    
}
