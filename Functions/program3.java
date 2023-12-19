//Java method to display the middle character of a string. Note: a) If the length of the string is odd there will be two middle characters. b) If the length of the string is even there will be one middle character.

class MiddleCharacter
{
    public static void main(String arg[])
    {
        middleCharacter();
    }
    public static void middleCharacter()
    {
        String s = new String("pripnce");
       System.out.println("Original String : "+s);
        int n = s.length();
        if(n%2 == 0)
        {
            
            System.out.println(s.substring(n/2, (n+2)/2));
            System.out.println(s.substring((n-1)/2, n/2));
        }
        else
        {
            System.out.println(s.substring(n/2, (n+1)/2));
        }
    }
}