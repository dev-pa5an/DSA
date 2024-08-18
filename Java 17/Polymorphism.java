class A{
    public void show(){
        System.out.println("In A show");
    }
}
class B extends A{
    @Override
    public void show(){
        System.out.println("In B show");
    }
}
class C extends A{
    @Override
    public void show(){
        System.out.println("In C show");
    }
}
public class Polymorphism{
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        obj = new C();
        obj.show();
    }
}