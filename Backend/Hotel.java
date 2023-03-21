package Backend;

public class Hotel {

    //Variables

    public int roomAmount;
    public String location;
    public String amenities;
    private int numEmployees;

    //Constructors

    public Hotel() {
        this.roomAmount = 0;
        this.location = "";
        this.amenities = "";
        this.numEmployees = 0;
    }

    public Hotel(int roomNum, String loc, String am, int numEm) {
        if (roomNum >= 0) {
            this.roomAmount = roomNum;
        } else {
            this.roomAmount = 0;
        }

        this.location = loc;
        this.amenities = am;

        if (numEm >= 0) {
        this.numEmployees = numEm;
        } else {
            this.numEmployees = 0;
        }
    }

    //Setters and Getters

    public void setRoomAmount(int amt) {
        if (amt >= 0) {
            this.roomAmount = amt;
        }
    }

    public int getRoomAmount() {
        return this.roomAmount;
    }

    public void setLocation(String loc) {
        this.location = loc;
    }

    public String getLocation() {
        return this.location;
    }

    //Should amenities be stored inside of a String array?

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public String getAmenities() {
        return this.amenities;
    }

    public void setNumEmployees(int num) {
        if (num >= 0) {
            this.numEmployees = num;
        }
    }

    public int getNumEmployees() {
        return this.numEmployees;
    }


}