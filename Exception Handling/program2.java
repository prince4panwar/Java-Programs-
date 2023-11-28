//Write a Java program to create a method that takes an integer as a parameter and throws an exception if the number is odd.
class OddNum_Exp 
{
  public static void main(String x[]) {
    int a =4;
    checknum(a);
    a =5;
    checknum(a);
  }

  public static void checknum(int a) {
    try {
      checkEvenNum(a);
      System.out.println(a + " is even.");
    } catch (IllegalArgumentException e) {
     System.out.println("Exception :" + e.getMessage());
    }
  }

  public static void checkEvenNum(int b) {
    if (b % 2 != 0) {
      throw new IllegalArgumentException(b + " is odd.");
    }
  }
}