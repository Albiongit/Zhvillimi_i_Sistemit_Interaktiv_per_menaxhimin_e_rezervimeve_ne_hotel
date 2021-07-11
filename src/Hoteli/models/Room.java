package Hoteli.models;

import java.util.Date;

public class Room {

    private int RoomID;
    private int Room_nr;
    private int Room_floor;
    private String Room_category;
    private boolean Room_Status;


    public Room(int RoomID, int Room_nr, int Room_floor, String Room_category, boolean Room_Status) {
        this.RoomID = RoomID;
        this.Room_nr = Room_nr;
        this.Room_floor = Room_floor;
        this.Room_category = Room_category;
        this.Room_Status=Room_Status;
    }

    public Room(){
        this(-1,-1,-1,"",false);
    }

    public int getRoomID() {
        return RoomID;
    }

    public int getRoom_nr() {
        return Room_nr;
    }

    public int getRoom_floor() {
        return Room_floor;
    }

    public String getRoom_category() {
        return Room_category;
    }

    public boolean getRoom_Status() {
        return Room_Status;
    }

    public void setRoomID(int RoomID) {
        this.RoomID = RoomID;
    }

    public void setRoom_nr(int Room_nr) {
        this.Room_nr = Room_nr;
    }

    public void setRoom_floor(int Room_floor) {
        this.Room_floor = Room_floor;
    }

    public void setRoom_category(String Room_category) {
        this.Room_category = Room_category;
    }

    public void setRoom_Status(boolean Room_Status) {
        this.Room_Status = Room_Status;
    }

}
