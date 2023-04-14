package Backend;

public class Floor {
    
    //Variables
    public int floorId;
    public Hotel hotelId;

    //Constructor
    public Floor(Hotel hotel, int num) {
        this.hotelId = hotel;
        this.floorId = num;
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
