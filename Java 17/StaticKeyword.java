class Mobile{
    String brand;
    int price;
    static String name; //static keywrod make this variable a class attribute

    //staic block will always calls first before the constructor and only once
    static { 
        name = "SmartPhone"; //static variables only be initialized once
    }

    public Mobile(){
        brand = "";
        price = 0;
    }

    public void show(){
        System.out.println(brand + " : " + name + " : $" + price);
    }
    public static void showStatic(Mobile obj){
        System.out.println("this is the static show method");

        //non-static variables cannot be accessed in static methods
        System.out.println(obj.brand + " : " + name + " : $" + obj.price);
    }
}
public class StaticKeyword{
    
    //The main method is static because
    //You don't need to create an object to call this method
    public static void main(String[] args) {
        Mobile apple = new Mobile();
        apple.brand = "Apple";
        apple.price = 1500;
        Mobile.name = "Iphone 13";

        apple.show();
        Mobile.showStatic(apple);
    }
}