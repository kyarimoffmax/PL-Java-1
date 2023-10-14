package org.example;

public class Worker {
    private Integer id;
    private String fio;
    private String specialization;
    private Integer workshopId;

    public Worker() {
    }

    public Worker(Integer id, String fio, String specialization, Integer workshopId) {
        this.id = id;
        this.fio = fio;
        this.specialization = specialization;
        this.workshopId = workshopId;
    }

    public Worker withId(Integer id) {
        return new Worker(id, fio, specialization, workshopId);
    }

    public Worker withFio(String fio) {
        return new Worker(id, fio, specialization, workshopId);
    }

    public Worker withSpecialization(String specialization) {
        return new Worker(id, fio, specialization, workshopId);
    }

    public Worker withWorkshopId(Integer workshopId) {
        return new Worker(id, fio, specialization, workshopId);
    }


    public Integer getId() {
        return id;
    }

    public String getFio() {
        return fio;
    }

    public String getSpecialization() {
        return specialization;
    }

    public Integer getWorkshopId() {
        return workshopId;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "id=" + id +
                ", fio='" + fio + '\'' +
                ", specialization='" + specialization + '\'' +
                ", workshopId=" + workshopId +
                '}';
    }
}
