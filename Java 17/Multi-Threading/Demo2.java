class A implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("A");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B implements Runnable{
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("B");
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo2{
    public static void main(String[] args) {
        Runnable objA = new A();
        Runnable objB = new B();

        Thread tAThread = new Thread(objA);
        Thread tBThread = new Thread(objB);

        tAThread.start();
        tBThread.start();

    }
}