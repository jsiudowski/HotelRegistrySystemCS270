package Hotel.Registry.System.hotelsystem.models;
import java.util.*;
import java.util.Date;

public class Reservation {
    public int reservationID;
    public Customer customer;
    public Date startDate;
    public Date endDate;
    public Room room;
    public boolean isCheckedIn;
    public int numGuests;

    public Reservation() {
        Random rand = new Random();
        this.reservationID = rand.nextInt();
    }

    public Reservation(int reservationID, Customer customer, Date start, 
        Date end, Room room, boolean isCheckedIn, int numGuests) {
            this.reservationID = reservationID;
            this.customer = customer;
            this.startDate = start;
            this.endDate = end;
            this.room = room;
            this.isCheckedIn = isCheckedIn;
            this.numGuests = numGuests;
    }

    public void setReservationID(Reservation reservation) {
        reservation.reservationID = reservationID;
    }

    public int getReservationID(Reservation reservation) {
        return reservation.reservationID;
    }

    public void setCustomer(Reservation reservation, Customer customer) {
        reservation.customer = customer;
    }

    public Customer getCustomer(Reservation reservation) {
        return reservation.customer;
    }

    public void setStartDate(Reservation reservation, Date start) {
        reservation.startDate = start;
    }

    public Date getStartDate(Reservation reservation) {
        return reservation.startDate;
    }

    public void setEndDate(Reservation reservation, Date end) {
        reservation.endDate = end;
    }

    public Date getEndDate(Reservation reservation) {
        return reservation.endDate;
    }

    public void setCheckIn(Reservation reservation, boolean checked) {
        reservation.isCheckedIn = checked;
    }

    public boolean areCheckedIn(Reservation reservation) {
        return reservation.isCheckedIn;
    }

    public void setRoom(Reservation reservation, Room room) {
        reservation.room = room;
    }

    public Room getRoom(Reservation reservation) {
        return reservation.room;
    }

    public void setNumGuests(Reservation reservation, int num) {
        reservation.numGuests = num;
    }

    public int getNumGuests(Reservation reservation) {
        return reservation.numGuests;
    }
}
