class A{
    public void show(){
        System.out.println("In show");
    }
}

abstract class B{
    public abstract void showB();
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

        B objB = new B() 
        //Now creating a object of B since the class B is abstract
        //Instead compiler will create a subclass which extends B
        {

            @Override
            public void showB() {
                System.out.println("In show B");
            }
            
        };
        objB.showB();
    }
}