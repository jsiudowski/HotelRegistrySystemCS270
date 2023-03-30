package Hotel.Registry.System.hotelsystem.model;

public class Room {
    //variables
    public int roomNumber;
    public String roomType;
    public Hotel hotelId;
    public Floor floorId;
    
    //construcor 
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
