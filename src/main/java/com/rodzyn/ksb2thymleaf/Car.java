package com.rodzyn.ksb2thymleaf;

public class Car {

    private int id;
    private String mark;
    private String model;

    public Car() {
    }

    public Car(int id, String mark, String model) {
        this.id = id;
        this.mark = mark;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}

