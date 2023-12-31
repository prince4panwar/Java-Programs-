
// Program to swap two string variables without using third or temp variable.
import java.lang.*;

class B {
    public static void main(String[] args) {
        String x = "hello", y = "world";
        System.out.println("\nBefore swapping: " + x + " " + y);
        x = x + y;
        y = x.substring(0, (x.length() - y.length()));
        x = x.substring(y.length());
        System.out.println("After swapping: " + x + " " + y);
    }
}