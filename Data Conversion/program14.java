// How to convert Object to String

class dConversion{

    public static void main(String[] args) {
        Object obj = new Integer(100);
        String s = String.valueOf(obj);

        System.out.println(s);


      
        if(s instanceof String){
            System.out.println("It is string type...");
        }

    }
}