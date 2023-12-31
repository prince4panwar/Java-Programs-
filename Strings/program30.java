//Program to find the number of the words in the given text file
class spro3 {
  public static void main(String st[]) {
    String str = new String("Java is platform independent. ");
    int c = 0;
    System.out.println("\nString is : " + str);

    int n = str.length();
    for (int i = 0; i < n; i++) {
      char s = str.charAt(i);
      if (s == ' ') {
        c++;
      }
    }
    System.out.println("No. of words in String : " + (c));
  }
}