 package Hoteli.models;
import javafx.scene.control.DatePicker;
import Hoteli.Controllers.InvoiceListController;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.Date;


public class Invoice {

  private int InvoiceID;
  private int ReservationID;
  private double Amount;
  private boolean Amount_paid;
  private Date Date;


  public Invoice(int InvoiceID, int ReservationID, double Amount, boolean Amount_paid, Date Date) {
    this.InvoiceID = InvoiceID;
    this.ReservationID = ReservationID;
    this.Amount = Amount;
    this.Amount_paid = Amount_paid;
    this.Date=Date;
  }

  public Invoice(){
    this(-1,-1,0,false, java.util.Calendar.getInstance().getTime());
  }

  public int getInvoiceID() {
    return InvoiceID;
  }

  public int getReservationID() {
    return ReservationID;
  }

  public double getAmount() {
    return Amount;
  }

  public boolean getAmount_paid() {
    return Amount_paid;
  }

  public Date Date() {
    return Date;
  }

  public void setInvoiceID(int InvoiceID) {
    this.InvoiceID = InvoiceID;
  }

  public void setReservationID(int ReservationID) {
    this.ReservationID = ReservationID;
  }

  public void setAmount(double amount) {
    this.Amount = Amount;
  }

  public void setAmount_paid(boolean amount_paid) {
    this.Amount_paid = Amount_paid;
  }

  public void setDate(Date amount) {
    this.Amount_paid = Amount_paid;
  }

}
