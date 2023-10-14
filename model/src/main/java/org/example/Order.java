package org.example;

public class Order {
    private Integer id;
    private String carBrand;
    private String typeService;
    private Integer priceService;
    private Integer workshopId;

    public Order() {
    }

    public Order(Integer id, String carBrand, String typeService, Integer priceService, Integer workshopId) {
        this.id = id;
        this.carBrand = carBrand;
        this.typeService = typeService;
        this.priceService = priceService;
        this.workshopId = workshopId;
    }

    public Order withId(Integer id) {
        return new Order(id, carBrand, typeService, priceService, workshopId);
    }

    public Order withCarBrand(String carBrand) {
        return new Order(id, carBrand, typeService, priceService, workshopId);
    }

    public Order withTypeService(String typeService) {
        return new Order(id, carBrand, typeService, priceService, workshopId);
    }

    public Order withPriceService(Integer priceService) {
        return new Order(id, carBrand, typeService, priceService, workshopId);
    }

    public Order withWorkshopId(Integer workshopId) {
        return new Order(id, carBrand, typeService, priceService, workshopId);
    }

    public Integer getId() {
        return id;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public String getTypeService() {
        return typeService;
    }

    public Integer getPriceService() {
        return priceService;
    }

    public Integer getWorkshopId() {
        return workshopId;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", carBrand='" + carBrand + '\'' +
                ", typeService='" + typeService + '\'' +
                ", priceService=" + priceService +
                ", workshopId=" + workshopId +
                '}';
    }
}
