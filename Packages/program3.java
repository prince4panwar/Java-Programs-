//Create a Java program to access the java.util.Date class through import keyword and print the current date of the system but inherit the Date class.
import java.util.Date;

 class CustomDate {
    private Date date;

    public CustomDate() {
        date = new Date();
    }

    public Date getCurrentDate() {
        return date;
    }

    public static void main(String[] args) {
        CustomDate customDate = new CustomDate();
        Date currentDate = customDate.getCurrentDate();

        System.out.println("Current Date: " + currentDate);
    }
}
