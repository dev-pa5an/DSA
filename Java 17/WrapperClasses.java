public class WrapperClasses{
    public static void main(String[] args) {
        int n = 8;
        Integer m = n; //Auto-Boxing
        System.out.println(m);

        int p = m; //Auto-Unboxing
        System.out.println(p); 
    }
}