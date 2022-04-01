package by.tc.task01.entity;


import by.tc.task01.builder.OvenBuilder;

import java.util.Objects;

public class Oven implements Appliance {
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public Oven(OvenBuilder ovenBuilder) {
        this.powerConsumption = ovenBuilder.getPowerConsumption();
        this.weight = ovenBuilder.getWeight();
        this.capacity = ovenBuilder.getCapacity();
        this.depth = ovenBuilder.getDepth();
        this.height = ovenBuilder.getHeight();
        this.width = ovenBuilder.getWidth();
    }

    public Oven(double powerConsumption, double weight, double capacity, double depth, double height, double width) {
        this.powerConsumption = powerConsumption;
        this.weight = weight;
        this.capacity = capacity;
        this.depth = depth;
        this.height = height;
        this.width = width;
    }

    public Oven(String[] parameters) {
        this.powerConsumption = Double.parseDouble(parameters[0]);
        this.weight = Double.parseDouble(parameters[1]);
        this.capacity = Double.parseDouble(parameters[2]);
        this.depth = Double.parseDouble(parameters[3]);
        this.height = Double.parseDouble(parameters[4]);
        this.width = Double.parseDouble(parameters[5]);
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return Oven.class.getSimpleName() +
                "powerConsumption='" + powerConsumption + '\'' +
                ", weight='" + weight + '\'' +
                ", capacity='" + capacity + '\'' +
                ", depth='" + depth + '\'' +
                ", height='" + height + '\'' +
                ", width='" + width + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Oven oven = (Oven) o;
        return Double.compare(oven.powerConsumption, powerConsumption) == 0
                && Double.compare(oven.weight, weight) == 0
                && Double.compare(oven.capacity, capacity) == 0
                && Double.compare(oven.depth, depth) == 0
                && Double.compare(oven.height, height) == 0
                && Double.compare(oven.width, width) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, weight, capacity, depth, height, width);
    }
}
