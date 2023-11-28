//Write a Java program that reads a list of integers from the user and throws an exception if any numbers are duplicates
class exception6
{
    static class MyException extends Exception{
        MyException(String msg){
            super(msg);
        }
    }

    public static void main(String arg[]) throws java.io.IOException, exception6.MyException{
        java.io.BufferedReader input = new java.io.BufferedReader (new java.io.InputStreamReader(System.in));
        // declare hashmap
        java.util.HashMap<Integer, Boolean> map = new java.util.HashMap<Integer, Boolean>();

        try{
            System.out.print("Enter non repeating numbers : ");
            String[] list = input.readLine().split(" ");
            
            for(String st : list){
                int num = Integer.parseInt(st);
                if(map.containsKey(num)){
                    String err = num + " is repeated in the list";
                    throw new exception6.MyException(err);
                } else {
                    map.put(num, true);
                }
            }
            
        } catch(java.lang.NumberFormatException e){
            System.out.println("Invalid input. Please enter a valid number.");
        }
    }
}