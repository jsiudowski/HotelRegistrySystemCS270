package Hotel.Registry.System.hotelsystem.models;
import jakarta.persistence.*;

import java.util.*;
import java.util.Date;

@Entity
public class Reservation {

    //Primary key:
    public @Id @GeneratedValue(strategy = GenerationType.AUTO) Long reservationId;

    //Foreign keys:
    public @ManyToOne Customer customer;
    public @ManyToOne Hotel hotel;
    //I'm choosing to do a One-to-One relationship for rooms for now. Each reservation can ONLY have one room
    public @OneToOne Room room;

    public Date startDate;
    public Date endDate;
    public boolean isCheckedIn;
    public int numGuests;

    protected Reservation() {

    }

    public Reservation(Customer customer, Date start,
        Date end,Hotel hotel, Room room, boolean isCheckedIn, int numGuests) {
            this.customer = customer;
            this.startDate = start;
            this.endDate = end;
            this.hotel = hotel;
            this.room = room;
            this.isCheckedIn = isCheckedIn;
            this.numGuests = numGuests;
    }

    public void setReservationId(Long id) {
        this.reservationId = id;
    }

    public Long getReservationID(Reservation reservation) {
        return reservation.reservationId;
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
