//Write a Java program to show an example of throws Keyword.


class demo
{
public static void main(String st[]) throws InterruptedException
{
for(int i=1;i<=10;i++)
{
System.out.println(i);
Thread.sleep(1000);
}
}}