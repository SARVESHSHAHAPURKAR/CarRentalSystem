package org.example;

import java.util.List;

public class VehicleRentalSystem {

    List<Store> stores;

    List<User> users;

    public List<Store> getStores() {
        return stores;
    }

    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void addStore(Store store){
        stores.add(store);
    }

    public void removeStore(Store store){
        stores.remove(store);
    }

    public void addUser(User user){
        users.add(user);
    }

    public void removeUser(User user){
        users.remove(user);
    }
}
