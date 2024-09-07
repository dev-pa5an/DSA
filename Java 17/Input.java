
import java.util.Scanner;

public class Input{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int num = sc.nextInt();
            System.out.println(num);
        }
    }
}