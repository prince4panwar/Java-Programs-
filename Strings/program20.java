//Program to find all subsets of a string
class SubsetToString {
  static void subString(String str, int n) {
    for (int i = 0; i < n; i++) // starting index
    {
      for (int j = i + 1; j <= n; j++) // ending index
      {
        System.out.println(str.substring(i, j));
      }
    }
  }

  public static void main(String[] args) {
    System.out.println("\nProgram Find all the Subset of a string.\n");
    java.util.Scanner sc = new java.util.Scanner(System.in);
    System.out.print("Enter a String :  ");
    String str = sc.nextLine();
    System.out.println("\nOrginal String is :  " + str);
    System.out.println("subsets of a given string are :  ");
    SubsetToString s = new SubsetToString();
    s.subString(str, str.length());
  }
}
