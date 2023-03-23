package Backend;

import java.util.ArrayList;

public class Hotel {

    //Variables

    public String location;
    public ArrayList<String> amenities = new ArrayList<String>();
    private int numEmployees;
    public ArrayList<Floor> floors = new ArrayList<Floor>();
    public ArrayList<Room> rooms = new ArrayList<Room>();

    //Constructors

    public Hotel() {
        this.location = "";
        this.numEmployees = 0;
    }

    public Hotel(int roomNum, String loc, ArrayList<String> am, int numEm) {

        this.location = loc;
        this.amenities.addAll(am);

        if (numEm >= 0) {
        this.numEmployees = numEm;
        } else {
            this.numEmployees = 0;
        }
    }

    //Setters and Getters

    public int getRoomAmount() {
        return rooms.size();
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

    //Methods for Floors

    public void addFloor(Floor floor) {
        this.floors.add(floor);
    }

    public void removeFloorByIndex(int index) {
        this.floors.remove(index);
        //Do we want to delete the floor if we remove it from the hotel's list?
        //this.floors.set(index, null); Something along these lines...
    }

    public ArrayList<Floor> getFloorList() {
        return this.floors;
    }

    public Floor getFloorByIndex(int index) {
        return this.floors.get(index);
    }

    //Methods for Rooms

}