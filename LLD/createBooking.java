package LLD;

import java.util.UUID;

public class createBooking {
    public Booking createBooking(final String userId, final show show, final List<Seat> seats){
        if(isAnySeatAlreadyBooked(show, seats)){
            throw new SeatPermananetlyUnavailableException("One or more seats are already booked for this show.");
        }

        boolean lockSuccess = seatLockProvider.locakSeats(seats,show.getid(), userId);
        if(!lockSuccess){
            throw new SeatLockingFailedException("Failed to lock seats for booking. Please try again.");
        }

        final String bookingId = UUID.randomUUID().toString();

        final Booking newBooking = new Booking(bookingId, show, userId, seats);
        showBooking.put(bookingId, newBooking);
        return newBooking;

    }
    private boolean isAnySeatAlreadyBooked(final Show show, final List<Seats> seats){
        final List<Seat> bookedSeats = getBookedSeats(show);
        for(Seat seat: seats){
            if(bookedSeats.contains(seat)){
                return true;
            }
        }
        return false;
    }
    
}
