class A{
    public A(){
        super();
    }
    public A(int n){
        System.out.println("In A int");
    }
}
class B extends A{
    //always the super class's constructor will be called
    public B(){
        super();
        System.out.println("In A");
    }
    public B(int n){
        super(n);
        System.out.println("In B int");
    }
}

public class SuperKeyword{
    
    public static void main(String[] args) {
        B obj = new B(3);

    }
}