package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Room {
    //variables
    public @Id @GeneratedValue int roomNumber;
    public String roomType;
    public @ManyToOne Hotel hotelId;
    public @ManyToOne Floor floorId;
    
    //constructor
    public Room (Hotel hotel, Floor floor, int roomNumber, String roomType) {
        this.hotelId = hotel;
        this.floorId = floor;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }

    //methods
    public int getRoomNum (Room room) {
        return room.roomNumber;
    }

    public String getRoomType (Room room) {
        return room.roomType;

    }

    public Hotel getRoomHotel() {
        return this.hotelId;
    }

    public Floor getRoomFloor() {
        return this.floorId;
    }


    
}
