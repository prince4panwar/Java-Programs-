//Java method that accepts three integers and checks whether they are consecutive or not. Returns true or false.
class ConsecutiveChecker
{
public static boolean areConsecutive(int num1, int num2, int num3){
return (num2 == num1 + 1 && num3 == num2 + 1) ||  // num1, num2, num3
 (num1 == num2 + 1 && num2 == num3 + 1);    // num3, num2, num1
    }
public static void main(String[] args) {
System.out.println("To check if numbers are consecutive or not ");
System.out.println("Numbers are 5 ,6 ,7 ");
System.out.println(areConsecutive(5, 6, 7));
System.out.println("Numbers are 1 ,2 ,4 ");
System.out.println(areConsecutive(1, 2, 4)); 
    }

   
}