package Backend;

import java.util.ArrayList;

public class Hotel {

    //Variables

    public int roomAmount;
    public String location;
    ArrayList<String> amenities = new ArrayList<String>();
    private int numEmployees;

    //Constructors

    public Hotel() {
        this.roomAmount = 0;
        this.location = "";
        this.numEmployees = 0;
    }

    public Hotel(int roomNum, String loc, ArrayList<String> am, int numEm) {
        if (roomNum >= 0) {
            this.roomAmount = roomNum;
        } else {
            this.roomAmount = 0;
        }

        this.location = loc;
        this.amenities.addAll(am);

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


    //Methods for amenities, since its an ArrayList this can be appended to or modified even more

    public void addAmenity(String amenity) {
        this.amenities.add(amenity);
    }

    public void removeAmenity(int index) {
        this.amenities.remove(index);
    }

    public ArrayList<String> getAmenitiesArray() {
        return this.amenities;
    }

    public String getAmenitiesString() {
        return this.amenities.toString();
    }

    public String getAmenityFromIndex(int index) {
        return this.amenities.get(index);
    }

    //End of Amenities Methods

    public void setNumEmployees(int num) {
        if (num >= 0) {
            this.numEmployees = num;
        }
    }

    public int getNumEmployees() {
        return this.numEmployees;
    }


}