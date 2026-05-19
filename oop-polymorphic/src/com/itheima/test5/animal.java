package com.itheima.test5;

public abstract class animal {
    private String name;
    private String color;

    public animal() {
    }

    public animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract void eat();
}
