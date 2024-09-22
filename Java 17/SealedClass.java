sealed class A permits B,C{

}

final class B extends A{

}

non-sealed class C extends A{

}

public class SealedClass{
    public static void main(String[] args) {
        
    }
}