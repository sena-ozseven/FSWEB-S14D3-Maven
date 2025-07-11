package org.example.arge;

public class CarSkeleton {

    private String name;
    private String description;

    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "car's engine is starting";
    }

    public String drive() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "car is driving";

    }

    protected String runEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "engine is running";
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public CarSkeleton() {
        System.out.println("CarSkeleton class has been constructed.");
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
