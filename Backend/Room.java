package Backend;

public class Room {
    public int roomNumber;
    public String roomType;

    public Room (int roomNumber, String roomType) {
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
