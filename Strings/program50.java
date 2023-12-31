/*
    50. Create an object StringBuffer class to show functionality of insert, append, delete and replace functions. 
*/
class Test
{
    public static void main(String args[])
    {
        StringBuffer string_buffer = new StringBuffer("write");

        /* [ insert ] */

        // System.out.println(new StringBuffer(" if just use ").toString());

        string_buffer.insert(5,"\n inbuild function insert() ");


        /* [ append ] */ 

        string_buffer.append("\n If you are like follow me at https://github.com/MayankDevil/ ");

        // System.out.println(string_buffer.toString());
        
        /* [ replace ] */ 

        string_buffer.replace(0,5,"wrong");

        /* [ delete ] */

        string_buffer.delete(5,20);

        /* [ display ] */ 

        System.out.println(string_buffer);
    }
}
/*

*/