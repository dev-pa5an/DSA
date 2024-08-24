@FunctionalInterface //let you create exactly one method inside the interface
interface A{
    void show();
}

public class FunctionalInterfaces{
    public static void main(String[] args) {
        //using the labda expressions
        A objA = () -> { 
                System.out.println("In show");
            };
        objA.show();
    }
}