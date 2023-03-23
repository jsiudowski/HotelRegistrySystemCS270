package Backend;

public class Floor {
    
    //Variables
    public int floorNum;
    public Hotel hotelId;

    //Constructor
    public Floor(Hotel hotel, int num) {
        this.hotelId = hotel;
        this.floorNum = num;
    }

    //Methods
    public int getFloorNum(Hotel hotel) {
        return this.floorNum;
    }

    public void setFloorNum(Hotel hotel, int num) {
        this.floorNum = num;
    }

    public Hotel getFloorHotel() {
        return this.hotelId;
    }

    public void setFloorHotel(Hotel hotel) {
        this.hotelId = hotel;
    }

    //Its worth considering that a hotel can have mutliple floors

}
