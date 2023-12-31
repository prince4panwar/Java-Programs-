//Program to find the duplicate words in a string

class DuplicateWord {
    public static void main(String[] args) {
        System.out.println("\nProgram to find the duplicate words in a string\n");
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a String  : ");
        String str = sc.nextLine();
        int count;
        str = str.toLowerCase();
        String words[] = str.split(" ");
        System.out.println("\nyour enetred String is  : " + str);
        System.out.println("Duplicate words in a given string : ");
        for (int i = 0; i < words.length; i++) {
            count = 1;
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = "0";
                }
            }
            if (count > 1 && words[i] != "0")
                System.out.println(words[i]);
        }
    }
}