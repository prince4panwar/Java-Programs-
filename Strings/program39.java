//Program to replace the spaces of a string with a specific character
class ReplaceSpace {
    public static void main(String str[]) {
        String s = "This is replace the space program";
        char ch = '-';

        s = s.replace(' ', ch);

        System.out.println("\nString after replacing spaces with given character: ");
        System.out.println(s);
    }
}