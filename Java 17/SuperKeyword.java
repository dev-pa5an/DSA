//every class in java extends Object class
//It is the reason even you don't specify that super() is called in the constructor

class A extends Object{
    public A(){
        super(); //this super represents the constructor of the Object class
    }
    public A(int n){
        System.out.println("In A int");
    }
}
class B extends A{
    //always the super class's constructor will be called
    public B(){
        super(4); //this super represents the constructor of the A class int n constructor
        System.out.println("In B");
    }
    public B(int n){
        super(n);
        System.out.println("In B int");
    }
}

public class SuperKeyword{
    
    public static void main(String[] args) {
        B obj = new B();

    }
}