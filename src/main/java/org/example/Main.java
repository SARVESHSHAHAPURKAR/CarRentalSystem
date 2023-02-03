package org.example;

import java.util.ArrayList;
import java.util.List;

import static org.example.ReservationStatus.INPROGRESS;
import static org.example.VehicleStatus.AVAILABLE;
import static org.example.VehicleType.CAR;

public class Main {
    public static void main(String[] args){

        VehicleRentalSystem system = new VehicleRentalSystem();
        List<User> users = new ArrayList<User>();
        List<Store> stores = new ArrayList<Store>();

        User user1 = new User(1,"Sarvesh","DL1234");
        users.add(user1);

        Vehicle vehicle1 = new Vehicle("123","MH05BL5012", AVAILABLE, CAR);
        Vehicle vehicle2 = new Vehicle("456","KA51HW5139", AVAILABLE, CAR);

        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        Location loc1 = new Location("India","Bangalore","Karnataka");
        Store store1 = new Store(1,vehicles,new ArrayList<Reservation>(), loc1);
        stores.add(store1);

        system.setStores(stores);
        system.setUsers(users);

        // WHAT IF TWO RESERVATIONS ARE MADE SIMULTANEOUSLY FROM DIFFERENT THREADS?
        // USE SYNCHRONISED BLOCK FOR createReservation() method
        Reservation reservation = store1.createReservation(vehicle1, user1);

        reservation.setStatus(INPROGRESS);

        Bill bill = new Bill();
        bill.setReservation(reservation);

        Payment payment = new Payment();
        payment.payBill(bill, PaymentMode.ONLINE);

        store1.completeReservation(reservation);




    }
}