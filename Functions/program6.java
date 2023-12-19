//Java method to print characters between two characters (i.e. A to P).
class A{
    void show()
    {
        char c;
        for(c='A';  c <= 'P'; ++c)
        {
            System.out.print(c + " ");
        }
    }
    public static  void main (String a[])
    {
        A obj = new A();
        obj.show();
    }
}