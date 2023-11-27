//Create a program, showing an example of super keyword
class parent{
    String message="hello i am the parent class";
    public void displayMessage(){
        System.out.println(message);
    }
}
class child extends parent{
    String message="hello i am the child class";
    public void displayMessage(){
        super.displayMessage();
        System.out.println(message);
    }
}

class inheritence_11_7032 {
    public static void main(String[] args) {
        child C=new child();
        C.displayMessage();
    }
}
