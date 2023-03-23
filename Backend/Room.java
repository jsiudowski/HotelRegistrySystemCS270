package Backend;

public class Room {
    public int roomNumber;
    public String roomType;
    public Hotel hotelId;
    public Floor floorNum;

    public Room (Hotel hotel, Floor floor, int roomNumber, String roomType) {
        this.hotelId = hotel;
        this.floorNum = floor;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
    }


    public int getRoomNum (Room room) {
        return room.roomNumber;
    }

    public String getRoomType (Room room) {
        return room.roomType;

    }


    
}
