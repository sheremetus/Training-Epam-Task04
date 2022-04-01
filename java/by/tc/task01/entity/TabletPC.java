package by.tc.task01.entity;


import by.tc.task01.builder.TabletPCBuilder;

import java.util.Objects;

public class TabletPC implements Appliance{
	private double batteryCapacity;
    private double displayInches;
    private double memoryRom;
    private double flashMemoryCapacity;
    private String color;

    public TabletPC(TabletPCBuilder tabletPCBuilder){
        this.batteryCapacity = tabletPCBuilder.getBatteryCapacity();
        this.displayInches = tabletPCBuilder.getDisplayInches();
        this.memoryRom = tabletPCBuilder.getMemoryRom();
        this.flashMemoryCapacity = tabletPCBuilder.getFlashMemoryCapacity();
        this.color = tabletPCBuilder.getColor();
    }

    public TabletPC(double batteryCapacity, double displayInches, double memoryRom, double flashMemoryCapacity, String color) {
        this.batteryCapacity = batteryCapacity;
        this.displayInches = displayInches;
        this.memoryRom = memoryRom;
        this.flashMemoryCapacity = flashMemoryCapacity;
        this.color = color;
    }

    public TabletPC(String[] parameters) {
        this.batteryCapacity = Double.parseDouble(parameters[0]);
        this.displayInches = Double.parseDouble(parameters[1]);
        this.memoryRom = Double.parseDouble(parameters[2]);
        this.flashMemoryCapacity = Double.parseDouble(parameters[3]);
        this.color = parameters[4];
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public double getDisplayInches() {
        return displayInches;
    }

    public void setDisplayInches(double displayInches) {
        this.displayInches = displayInches;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getFlashMemoryCapacity() {
        return flashMemoryCapacity;
    }

    public void setFlashMemoryCapacity(double flashMemoryCapacity) {
        this.flashMemoryCapacity = flashMemoryCapacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return TabletPC.class.getSimpleName() +
                "batteryCapacity='" + batteryCapacity + '\'' +
                ", displayInches='" + displayInches + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", flashMemoryCapacity='" + flashMemoryCapacity + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TabletPC tabletPC = (TabletPC) o;
        return Double.compare(tabletPC.batteryCapacity, batteryCapacity) == 0
                && Double.compare(tabletPC.displayInches, displayInches) == 0
                && Double.compare(tabletPC.memoryRom, memoryRom) == 0
                && Double.compare(tabletPC.flashMemoryCapacity, flashMemoryCapacity) == 0
                && Objects.equals(color, tabletPC.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, displayInches, memoryRom, flashMemoryCapacity, color);
    }
}
