package by.tc.task01.builder;

import by.tc.task01.entity.TabletPC;

public class TabletPCBuilder implements Builder {

    private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPCBuilder batteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
        return this;
    }
    public TabletPCBuilder displayInches(double displayInches) {
        this.displayInches = displayInches;
        return this;
    }
    public TabletPCBuilder memoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
        return this;
    }
    public TabletPCBuilder flashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
        return this;
    }
    public TabletPCBuilder color(String color) {
        this.color = color;
        return this;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public TabletPC build(String[] parameters){
        this.batteryCapacity(Double.parseDouble(parameters[0]));
        this.displayInches(Double.parseDouble(parameters[1]));
        this.memoryRom(Double.parseDouble(parameters[2]));
        this.flashMemoryCapacity(Double.parseDouble(parameters[3]));
        this.color(parameters[4]);
        return new TabletPC(this);
    }

  public TabletPC build(){
        return new TabletPC(this);
    }
}
