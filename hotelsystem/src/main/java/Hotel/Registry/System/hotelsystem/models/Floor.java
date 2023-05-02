package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.*;

@Entity
public class Floor {
    
    //Variables
    public @Id @GeneratedValue(strategy = GenerationType.AUTO) Long floorId;
    public @ManyToOne Hotel hotel;

    //Constructor
    public Floor(Hotel hotel) {
        this.hotel = hotel;
        //hotel.addFloor(this);
    }

    //Methods
    public Long getFloorId(Hotel hotel) {
        return this.floorId;
    }

    public void setFloorId(Hotel hotel, Long num) {
        this.floorId = num;
    }

    public Hotel getFloorHotel() {
        return this.hotel;
    }

}
