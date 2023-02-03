package org.example;

import java.util.Date;

public class Reservation {

    User user;
    Vehicle vehicle;
    Location pickUpLocation;
    Location dropLocation;
    Date bookingFromDate;
    Date bookingToDate;
    ReservationStatus status;
    ReservationType type;
    int storeId;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Location getPickUpLocation() {
        return pickUpLocation;
    }

    public void setPickUpLocation(Location pickUpLocation) {
        this.pickUpLocation = pickUpLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
    }

    public Date getBookingFromDate() {
        return bookingFromDate;
    }

    public void setBookingFromDate(Date bookingFromDate) {
        this.bookingFromDate = bookingFromDate;
    }

    public Date getBookingToDate() {
        return bookingToDate;
    }

    public void setBookingToDate(Date bookingToDate) {
        this.bookingToDate = bookingToDate;
    }

    public ReservationStatus getStatus() {
        return status;
    }

    public void setStatus(ReservationStatus status) {
        this.status = status;
    }

    public ReservationType getType() {
        return type;
    }

    public void setType(ReservationType type) {
        this.type = type;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }
}
