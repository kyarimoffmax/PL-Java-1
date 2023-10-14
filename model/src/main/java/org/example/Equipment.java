package org.example;

public class Equipment {
    private Integer id;
    private String name;
    private Integer count;
    private String specialization;
    private Integer workshopId;

    public Equipment() {
    }


    public Equipment(Integer id, String name, Integer count, String specialization, Integer workshopId) {
        this.id = id;
        this.name = name;
        this.count = count;
        this.specialization = specialization;
        this.workshopId = workshopId;
    }

    public Equipment withId(Integer id) {
        return new Equipment(id, name, count, specialization, workshopId);
    }

    public Equipment withName(String name) {
        return new Equipment(id, name, count, specialization, workshopId);
    }

    public Equipment withCount(Integer count) {
        return new Equipment(id, name, count, specialization, workshopId);
    }

    public Equipment withSpecialization(String specialization) {
        return new Equipment(id, name, count, specialization, workshopId);
    }

    public Equipment withWorkshopId(Integer workshopId) {
        return new Equipment(id, name, count, specialization, workshopId);
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getCount() {
        return count;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Integer getWorkshopId() {
        return workshopId;
    }

    @Override
    public String toString() {
        return "Equipment{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + count +
                ", specialization='" + specialization + '\'' +
                ", workshopId=" + workshopId +
                '}';
    }
}
