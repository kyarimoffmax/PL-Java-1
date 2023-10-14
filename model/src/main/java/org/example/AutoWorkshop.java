package org.example;

import java.util.Collection;

public class AutoWorkshop {
    private Integer id;
    private String name;
    private Collection<Worker> workers;
    private Collection<Order> orders;
    private Collection<Equipment> equipments;
    private Location location;

    public AutoWorkshop() {
    }

    public AutoWorkshop(Integer id, String name, Collection<Worker> workers, Collection<Order> orders, Collection<Equipment> equipments, Location location) {
        this.id = id;
        this.name = name;
        this.workers = workers;
        this.orders = orders;
        this.equipments = equipments;
        this.location = location;
    }


    public AutoWorkshop withId(Integer id) {
        return new AutoWorkshop(id, name, workers, orders, equipments, location);
    }



    public AutoWorkshop withName(String name) {
        return new AutoWorkshop(id, name, workers, orders, equipments, location);
    }

    public AutoWorkshop withWorkers(Collection<Worker> workers) {
        return new AutoWorkshop(id, name, workers, orders, equipments, location);
    }

    public AutoWorkshop withOrders(Collection<Order> orders) {
        return new AutoWorkshop(id, name, workers, orders, equipments, location);
    }

    public AutoWorkshop withEquipments(Collection<Equipment> equipments) {
        return new AutoWorkshop(id, name, workers, orders, equipments, location);
    }

    public AutoWorkshop withLocation(Location location) {
        return new AutoWorkshop(id, name, workers, orders, equipments, location);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Worker> getWorkers() {
        return workers;
    }

    public Collection<Order> getOrders() {
        return orders;
    }

    public Collection<Equipment> getEquipments() {
        return equipments;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return "AutoWorkshop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", workers=" + workers +
                ", orders=" + orders +
                ", equipments=" + equipments +
                ", location=" + location +
                '}';
    }
}
