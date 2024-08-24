@FunctionalInterface //let you create exactly one method inside the interface
interface A{
    void show();
}

public class FunctionalInterfaces{
    public static void main(String[] args) {
        A objA = new A(){
            @Override
            public void show(){
                System.out.println("In show");
            }
        };
        objA.show();
    }
}