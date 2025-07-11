package org.example.arge;

public class CarSkeleton {

    private String name;
    private String description;

    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return getName() + "'s engine is starting";
    }

    public String drive() {
        runEngine(this);
        return getName() + " is driving...";

    }

    protected void runEngine(CarSkeleton carSkeleton) {
        if (carSkeleton instanceof ElectricCar) {
            double avgKmPerCharge = ((ElectricCar) carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricCar) carSkeleton).getBatterySize();
            System.out.println("The car engine is starting with electric. Per charge: " + avgKmPerCharge + " battery size: " + batterySize);

        } else if (carSkeleton instanceof HybridCar) {
            double avgKmPerLitre = ((HybridCar) carSkeleton).getAvgKmPerLitre();
            int batterySize = ((HybridCar) carSkeleton).getBatterySize();
            int cylinders = ((HybridCar) carSkeleton).getCylinders();
            System.out.println("The car engine is starting with hybrid. Per liter: " + avgKmPerLitre + " battery size: " + batterySize + " cylinders: " + cylinders);


        } else if (carSkeleton instanceof  GasPoweredCar) {
            double avgKmPerLitre = ((GasPoweredCar) carSkeleton).getAvgKmPerLitre();
            int cylinders = ((GasPoweredCar) carSkeleton).getCylinders();
            System.out.println("The car engine is starting with gas power. Per liter: " + avgKmPerLitre + " cylinders: " + cylinders);

        } else {
            System.out.println("Invalid car type!");
        }

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
