package by.tc.task01.builder;


import by.tc.task01.entity.Oven;

public class OvenBuilder implements Builder {
    private double powerConsumption;
    private double weight;
    private double capacity;
    private double depth;
    private double height;
    private double width;

    public OvenBuilder powerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public OvenBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }

    public OvenBuilder capacity(double capacity) {
        this.capacity = capacity;
        return this;
    }

    public OvenBuilder depth(double depth) {
        this.depth = depth;
        return this;
    }

    public OvenBuilder height(double height) {
        this.height = height;
        return this;
    }

    public OvenBuilder width(double width) {
        this.width = width;
        return this;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getCapacity() {
        return capacity;
    }

    public double getDepth() {
        return depth;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Oven build(String[] parameters) {
        this.powerConsumption(Double.parseDouble(parameters[0]));
        this.weight(Double.parseDouble(parameters[1]));
        this.capacity(Double.parseDouble(parameters[2]));
        this.depth(Double.parseDouble(parameters[3]));
        this.height(Double.parseDouble(parameters[4]));
        this.width(Double.parseDouble(parameters[5]));
        return new Oven(this);
    }

    public Oven build() {
        return new Oven(this);
    }


}
