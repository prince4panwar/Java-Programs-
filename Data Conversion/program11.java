// How to convert String to char
class a {
    public static void main(String[] x) {
        String str = "Hello World!";
        char[] charArray = str.toCharArray();

        for (char c : charArray) 
        {
            System.out.println(c);
        }
    }
}