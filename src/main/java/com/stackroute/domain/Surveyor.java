package com.stackroute.domain;

public class Surveyor {
    private int id;
    private String name;

    public Surveyor(int id, String name) {

    }

    public Surveyor() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Surveyor{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
