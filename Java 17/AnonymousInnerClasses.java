class A{
    public void show(){
        System.out.println("In show");
    }
}

public class AnonymousInnerClasses{
    public static void main(String[] args) {
        A objA = new A()
        //creating a subclass of A without giving it a name
        //The compiler generates a separate class file for this anonymous inner class
        {
            @Override
            public void show(){
                System.out.println("In new show");
            }           
        };
        objA.show();
    }
}