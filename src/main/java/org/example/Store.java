package org.example;

import java.util.List;

import static org.example.ReservationStatus.COMPLETED;
import static org.example.ReservationType.HOURLY;

public class Store {

    int storeId;

    Location location;
    List<Vehicle> vehicles;

    List<Reservation> reservations;

    public Store(int storeId, List<Vehicle> vehicles, List<Reservation> reservations, Location location) {
        this.location = location;
        this.storeId = storeId;
        this.vehicles = vehicles;
        this.reservations = reservations;
    }

    public int getStoreId() {
        return storeId;
    }

    public void setStoreId(int storeId) {
        this.storeId = storeId;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle){
        vehicles.remove(vehicle);
    }

    public List<Reservation> getReservations() {
        return reservations;
    }

    public void setReservations(List<Reservation> reservations) {
        this.reservations = reservations;
    }

    public void addReservation(Reservation reservation){
        reservations.add(reservation);
    }

    public void removeReservation(Reservation reservation){
        reservations.remove(reservation);
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Reservation createReservation(Vehicle vehicle1, User user1) {

        Reservation reservation= new Reservation();
        reservation.setVehicle(vehicle1);
        vehicle1.setStatus(VehicleStatus.UNAVAILABLE); // BECAUSE IT IS BOOKED NOW
        reservation.setUser(user1);
        reservation.setStatus(ReservationStatus.SCHEDULED);
        reservation.setType(HOURLY);

        reservations.add(reservation);
        return reservation;
    }

    public void completeReservation(Reservation reservation) {

        reservation.setStatus(COMPLETED);
    }

    // You can add cancelReservation() method too similarly
}
