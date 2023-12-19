/*java method to count all the words in a string.*/

class a

{

static int countWord(String s)
{
int t=1;
for(int i=0; i<s.length(); i++)
{

if((s.charAt(i) == ' ') && (s.charAt(i+1) != ' '))
{
t++;
}
}
return t;
}

public static void main(String args[])
{

System.out.println(countWord("Hello How are you"));
}

}