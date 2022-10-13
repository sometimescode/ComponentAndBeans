package com.example.example;

import java.util.Map;

public class UModel {
    private int id;
    private String name;
    private Map<String, String> objects;
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
    public Map<String, String> getObjects() {
        return objects;
    }
    public void setObjects(Map<String, String> objects) {
        this.objects = objects;
    }
    @Override
    public String toString() {
        return "UModel [id=" + id + ", name=" + name + ", objects=" + objects + "]";
    }

}
