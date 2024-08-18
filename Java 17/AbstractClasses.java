abstract class Car{
    public abstract void drive();
    public abstract void hillClimb();
    public void playMusic(){
        System.out.println("Plaing Music..");
    }
}

abstract class BMW extends Car{
    @Override
    public void drive(){
        System.out.println("BMW is driving..");
    }
}
//concrete class 
class SportBMW extends BMW{
    @Override
    public void hillClimb(){
        System.out.println("BMW sport is hill climbing..");
    }
}

public class AbstractClasses{
    public static void main(String[] args) {
        SportBMW bmw = new SportBMW();
        bmw.drive();
        bmw.hillClimb();
        bmw.playMusic();
    }
}