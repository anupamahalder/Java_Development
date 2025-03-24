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

Expected Deadlock Output (No Progress, Stuck Forever)
- Person1 booked Flight
- Person2 booked Hotel
🔮 Now, Person1 waits for hotelLock while holding flightLock.
🔮 Person2 waits for flightLock while holding hotelLock.
🔮 Both are stuck forever → Deadlock achieved! 🚨

What’s Changed?
- Added Thread.sleep(100); after acquiring the first lock
- This increases the chance that Person1 locks flightLock and Person2 locks hotelLock before requesting the second lock.

Solution to Prevent Deadlock
1. Always Acquire Locks in the Same Order
- Ensure all threads lock flightLock before hotelLock.
2. Use tryLock() with Timeout (ReentrantLock)
- Avoids waiting forever.
*/

class FlightBooking {
    static final Object flightLock = new Object();
    static final Object hotelLock = new Object();

    void bookFlight() {
        synchronized (flightLock) {
            System.out.println(Thread.currentThread().getName() + " booked Flight");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (hotelLock) {
                System.out.println(Thread.currentThread().getName() + " booked Hotel");
            }
        }
    }

    void bookHotel() {
        synchronized (hotelLock) {
            System.out.println(Thread.currentThread().getName() + " booked Hotel");
            try { Thread.sleep(100); } catch (InterruptedException e) {}
            synchronized (flightLock) {
                System.out.println(Thread.currentThread().getName() + " booked Flight");
            }
        }
    }
}

public class DeadlockExample2 {
    public static void main(String[] args) {
        FlightBooking booking = new FlightBooking();

        Thread person1 = new Thread(() -> booking.bookFlight(), "Person1");
        Thread person2 = new Thread(() -> booking.bookHotel(), "Person2");

        person1.start();
        person2.start();
    }
}
/*
OUTPUT:
-------
Person1 booked Flight
Person2 booked Hotel

*/
