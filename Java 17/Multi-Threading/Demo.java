class A extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
        }
    }
}

class B extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
        }
    }
}

public class Demo{
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        //The priority range is 1 - 10
        objA.setPriority(8);
        objB.setPriority(Thread.MAX_PRIORITY);

        //By default the priority will be 5
        System.out.println(objA.getPriority());
        System.out.println(objB.getPriority());    

        objA.start();
        objB.start();
    }
}