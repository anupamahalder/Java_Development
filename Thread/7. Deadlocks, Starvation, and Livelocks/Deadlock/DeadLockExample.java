/*
Deadlock (Threads Blocking Each Other Waiting for Resources)

💡 Real-World Example: Two People Booking Flight & Hotel
Person 1 books a flight first, then waits for a hotel.
Person 2 books a hotel first, then waits for a flight.
Both are waiting for the resource the other has → Deadlock occurs!

🚨 Deadlock Happened!
- Person1 has Flight but needs Hotel.
- Person2 has Hotel but needs Flight.
- Both are waiting forever!
*/

class FlightBooking {
    void bookFlight() {
        synchronized (this) {  // Lock Flight first
            System.out.println(Thread.currentThread().getName() + " booked Flight");
            try { 
                Thread.sleep(100); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            }
            synchronized (HotelBooking.class) { // Waiting for Hotel
                System.out.println(Thread.currentThread().getName() + " booked Hotel");
            }
        }
    }
}

class HotelBooking {
    void bookHotel() {
        synchronized (this) { // Lock Hotel first
            System.out.println(Thread.currentThread().getName() + " booked Hotel");
            try { 
                Thread.sleep(100); 
            } catch (InterruptedException e) { 
                e.printStackTrace(); 
            }
            synchronized (FlightBooking.class) { // Waiting for Flight
                System.out.println(Thread.currentThread().getName() + " booked Flight");
            }
        }
    }
}

public class DeadlockExample { 

    public static void main(String[] args) {
        FlightBooking flight = new FlightBooking();
        HotelBooking hotel = new HotelBooking();

        Thread person1 = new Thread(() -> flight.bookFlight(), "Person1");
        Thread person2 = new Thread(() -> hotel.bookHotel(), "Person2");

        person1.start();
        person2.start();
    }
}

/*
OUTPUT:
-------
Person1 booked Flight
Person2 booked Hotel
Person2 booked Flight
Person1 booked Hotel

*/
