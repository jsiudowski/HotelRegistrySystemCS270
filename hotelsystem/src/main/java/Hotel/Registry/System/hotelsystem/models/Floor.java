package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Floor {
    
    //Variables
    public @Id @GeneratedValue int floorId;
    public Hotel hotelId;

    //Constructor
    public Floor(Hotel hotel) {
        this.hotelId = hotel;
        hotel.addFloor(this);
    }

    //Methods
    public int getFloorId(Hotel hotel) {
        return this.floorId;
    }

    public void setFloorId(Hotel hotel, int num) {
        this.floorId = num;
    }

    public Hotel getFloorHotel() {
        return this.hotelId;
    }

}
