//Write a Java program to create a class with methods to search for flights and hotels, and to book and cancel reservations.
class TravelAgent {
    // Method to search for flights
    public void searchFlights(String source, String destination, String date) {
        System.out.println("Searching for flights from " + source + " to " + destination + " on " + date);

    }

    // Method to search for hotels
    public void searchHotels(String location, String checkInDate, String checkOutDate) {
        System.out.println("Searching for hotels in " + location + " from " + checkInDate + " to " + checkOutDate);

    }

    // Method to book a flight
    public void bookFlight(String flightNumber, String passengerName) {
        System.out.println("Booking flight " + flightNumber + " for " + passengerName);

    }

    // Method to book a hotel
    public void bookHotel(String hotelName, String guestName) {
        System.out.println("Booking hotel " + hotelName + " for " + guestName);

    }

    // Method to cancel a flight reservation
    public void cancelFlightReservation(String reservationNumber) {
        System.out.println("Canceling flight reservation: " + reservationNumber);

    }

    // Method to cancel a hotel reservation
    public void cancelHotelReservation(String reservationNumber) {
        System.out.println("Canceling hotel reservation: " + reservationNumber);

    }
}

public class pro19 {
    public static void main(String[] args) {
        TravelAgent agent = new TravelAgent();

        // Searching for flights
        agent.searchFlights("New York", "London", "2023-12-15");

        // Searching for hotels
        agent.searchHotels("Paris", "2023-12-20", "2023-12-25");

        // Booking a flight
        agent.bookFlight("ABC123", "Alice");

        // Booking a hotel
        agent.bookHotel("Hotel XYZ", "Bob");

        // Canceling a flight reservation
        agent.cancelFlightReservation("XYZ789");

        // Canceling a hotel reservation
        agent.cancelHotelReservation("ABC456");
    }
}
