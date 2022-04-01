package by.tc.task01.builder;


import by.tc.task01.entity.Refrigerator;

public class RefrigeratorBuilder implements Builder {
    private double powerConsumption;
    private double weight;
    private double freezerCapacity;
    private double overallCapacity;
    private double height;
    private double width;

    public RefrigeratorBuilder powerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public RefrigeratorBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }

    public RefrigeratorBuilder freezerCapacity(double freezerCapacity) {
        this.freezerCapacity = freezerCapacity;
        return this;
    }

    public RefrigeratorBuilder overallCapacity(double overallCapacity) {
        this.overallCapacity = overallCapacity;
        return this;
    }

    public RefrigeratorBuilder height(double height) {
        this.height = height;
        return this;
    }

    public RefrigeratorBuilder width(double width) {
        this.width = width;
        return this;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getWeight() {
        return weight;
    }

    public double getFreezerCapacity() {
        return freezerCapacity;
    }

    public double getOverallCapacity() {
        return overallCapacity;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public Refrigerator build(String[] parameters) {
        this.powerConsumption(Double.parseDouble(parameters[0]));
        this.weight(Double.parseDouble(parameters[1]));
        this.freezerCapacity(Double.parseDouble(parameters[2]));
        this.overallCapacity(Double.parseDouble(parameters[3]));
        this.height(Double.parseDouble(parameters[4]));
        this.weight(Double.parseDouble(parameters[5]));

        return new Refrigerator(this);
    }

    public Refrigerator build() {
        return new Refrigerator(this);
    }

}
