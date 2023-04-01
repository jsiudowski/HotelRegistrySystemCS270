package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Room {
    //variables
    public @Id @GeneratedValue int roomNumber;
    public String roomType;

    //hotelId and floorId can be handled as foreign keys.
    //This is something that may have to be accounted for later on
    public Hotel hotelId;
    public Floor floorId;
    
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
