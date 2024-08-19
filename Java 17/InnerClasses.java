class A{
    public void show(){
        System.out.println("In show");
    }

    class B{
        public void config(){
            System.out.println("In config without static");
        }
    }

    static class C{
        public void config(){
            System.out.println("In config with static");
        }
    }
}

public class InnerClasses{
    public static void main(String[] args) {
        A objA = new A();
        objA.show();

        A.B objAB = objA.new B(); //when the class B in class A is non-static
        objAB.config();

        A.C objC = new A.C(); //When the class C in class A is static
        objC.config();
    }
}