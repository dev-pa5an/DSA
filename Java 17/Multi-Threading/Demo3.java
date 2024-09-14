public class Demo3{
    public static void main(String[] args) {

        Counter c = new Counter();

        Runnable objA = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };
        Runnable objB = () -> {
            for (int i = 0; i < 1000; i++) {
                c.increment();
            }
        };

        Thread tAThread = new Thread(objA);
        Thread tBThread = new Thread(objB);

        tAThread.start();
        tBThread.start();

        System.out.println(c.count);
    }
}

class Counter{
    int count = 0;
    public void increment(){
        count++;
    }
}