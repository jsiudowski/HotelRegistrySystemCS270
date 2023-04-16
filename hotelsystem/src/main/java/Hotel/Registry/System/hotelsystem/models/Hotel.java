package Hotel.Registry.System.hotelsystem.models;

import jakarta.persistence.*;
import org.hibernate.annotations.Columns;

import java.util.ArrayList;

@Entity
public class Hotel {

    //Variables
    public @Id @GeneratedValue(strategy = GenerationType.AUTO) Long hotelId;
    public String location;
    public ArrayList<String> amenities = new ArrayList<>();
    private int numEmployees;
    //public ArrayList<Floor> floors = new ArrayList<>();
    //public ArrayList<Room> rooms = new ArrayList<>();

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

    public Long getHotelId() {
        return this.hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    /*
    public int getRoomAmount() {
        return rooms.size();
    }
    */
    //Commenting out for debugging

    public void setLocation(String loc) {
        this.location = loc;
    }

    public String getLocation() {
        return this.location;
    }


    //Methods for amenities, since it's an ArrayList this can be appended to or modified even more

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
    /*
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

    public int getFloorAmount() {
        return this.floors.size();
    }

    //Methods for Rooms

    public void addRoom(Room room) {
        
        this.rooms.add(room); //should we make a conditional where we cannot add more rooms than what is available on the floor
    }

    // didn't add the delete room list till we decide what we want to do with deleting floors
    public ArrayList<Room> getRoomList() {
        return this.rooms;
    }
    
    public Room getRoomByIndex (int index) {
        return this.rooms.get(index);
    }

     */





}