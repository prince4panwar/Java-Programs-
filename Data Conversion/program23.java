//How to convert Date to Timestamp
import java.sql.Timestamp;
import java.util.Date;

class DateToTimestampExample {
    public static void main(String[] args) {
        // Create a Date object
        Date date = new Date();

        // Convert the Date to a Timestamp
        Timestamp timestamp = new Timestamp(date.getTime());

        System.out.println("Date: " + date);
        System.out.println("Timestamp: " + timestamp);
    }
}