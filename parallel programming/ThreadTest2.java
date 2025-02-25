
import java.util.Scanner;

public class ThreadTest2 {
    
    private static int countPrimes(int min, int max){
        int count = 0;
        for (int i = min; i <= max; i++){
            if (isPrime(i)){
                count++;
            }
        }
        return count;
    }
    private static boolean isPrime(int x){
        assert x > 1;
        int topPrime = (int)Math.sqrt(x);
        for (int i = 2; i <= topPrime; i++){
            if (x % i == 0)
                return false;
        }
        return true;
    }

    private static class CountPrimeThread implements Runnable{
        private final int id;
        public CountPrimeThread(int id){
            this.id = id;
        }
        @Override
        public void run(){
            long startTime = System.currentTimeMillis();
            int count = countPrimes(2, 10_000_000);
            long elapsedTime = System.currentTimeMillis() - startTime;
            System.out.println("Thread " + id + " counted " + 
                    count + " primes in " + (elapsedTime/1000.0) + " seconds.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Available processors " + Runtime.getRuntime().availableProcessors());

        Scanner scanner = new Scanner(System.in);
        int numberOfThreads = 0;
        System.out.print("Enter the number of threads you want to create : ");
        numberOfThreads = scanner.nextInt();
        scanner.close();
        System.out.println("Creating " + numberOfThreads);

        CountPrimeThread[] workers = new CountPrimeThread[numberOfThreads];
        for (int i = 0; i < numberOfThreads; i++){
            workers[i] = new CountPrimeThread(i+1);
        }
        for (CountPrimeThread r : workers) {
            Thread t = new Thread(r);
            t.start();
        }
        System.out.println("Threads have been created and started");
    }

}
