package Hoteli.models;

import javafx.scene.control.DatePicker;
import Hoteli.Controllers.ReservationController;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Date;

public class Reservation {

    private int ReservationID;
    private int RoomID;
    private String ClientName;
    private double Price;
    private Date Reservation_date;


    public Reservation(int ReservationID, int RoomID, String ClientName, double Price, Date Reservation_date) {
        this.ReservationID = ReservationID;
        this.RoomID = RoomID;
        this.ClientName = ClientName;
        this.Price = Price;
        this.Reservation_date=Reservation_date;
    }

    public Reservation(){
        this(-1,-1,"",0, java.util.Calendar.getInstance().getTime());
    }

    public int getReservationID() {
        return ReservationID;
    }

    public int getRoomID() {
        return RoomID;
    }

    public String getClientName() {
        return ClientName;
    }

    public double getPrice() {
        return Price;
    }

    public Date Reservation_date() {
        return Reservation_date;
    }

    public void setReservationID(int ReservationID) {
        this.ReservationID = ReservationID;
    }

    public void setRoomID(int RoomID) {
        this.RoomID = RoomID;
    }

    public void setClientName(String ClientName) {
        this.ClientName = ClientName;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public void setReservation_date(Date Reservation_date) {
        this.Reservation_date = Reservation_date;
    }
}
