package org.example;


import java.util.List;



public class ReadMain {
    public static void main(String[] args) {
        List<AutoWorkshop> workshops = new FileReader().readFile("workshops.json");

        for (AutoWorkshop w : workshops) {
            System.out.println(w.getId());
            System.out.println(w.getName());
            System.out.println(w.getWorkers());
            System.out.println(w.getOrders());
            System.out.println(w.getEquipments());
            System.out.println(w.getLocation());

            System.out.println("____________________________");
        }

    }

}