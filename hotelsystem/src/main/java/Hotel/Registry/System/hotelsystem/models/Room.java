package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.*;

@Entity
public class Room {
    //variables
    public @Id @GeneratedValue(strategy = GenerationType.AUTO) Long roomNumber;
    public String roomType;
    public @ManyToOne Hotel hotelId;
    public @ManyToOne Floor floorId;
    
    //constructor
    public Room (Hotel hotel, Floor floor, String roomType) {
        this.hotelId = hotel;
        this.floorId = floor;
        this.roomType = roomType;
    }

    //methods
    public Long getRoomNum (Room room) {
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
