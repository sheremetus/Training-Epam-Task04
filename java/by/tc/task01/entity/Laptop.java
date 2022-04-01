package by.tc.task01.entity;


import by.tc.task01.builder.LaptopBuilder;

import java.util.Objects;

public class Laptop implements Appliance {
    private double batteryCapacity;
    private String os;
    private double memoryRom;
    private double systemMemory;
    private double cpu;
    private double displayInchs;

    public Laptop(LaptopBuilder builder) {
        this.batteryCapacity = builder.getBatteryCapacity();
        this.os = builder.getOs();
        this.memoryRom = builder.getMemoryRom();
        this.systemMemory = builder.getSystemMemory();
        this.cpu = builder.getCpu();
        this.displayInchs = builder.getDisplayInchs();
    }

    public Laptop(double batteryCapacity, String os, double memoryRom, double systemMemory, double cpu, double displayInchs) {
        this.batteryCapacity = batteryCapacity;
        this.os = os;
        this.memoryRom = memoryRom;
        this.systemMemory = systemMemory;
        this.cpu = cpu;
        this.displayInchs = displayInchs;
    }

    public Laptop(String[] parameters) {
        this.batteryCapacity = Double.parseDouble(parameters[0]);
        this.os = parameters[1];
        this.memoryRom = Double.parseDouble(parameters[2]);
        this.systemMemory = Double.parseDouble(parameters[3]);
        this.cpu = Double.parseDouble(parameters[4]);
        this.displayInchs = Double.parseDouble(parameters[5]);
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public void setMemoryRom(double memoryRom) {
        this.memoryRom = memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public void setSystemMemory(double systemMemory) {
        this.systemMemory = systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public void setCpu(double cpu) {
        this.cpu = cpu;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public void setDisplayInchs(double displayInchs) {
        this.displayInchs = displayInchs;
    }

    @Override
    public String toString() {
        return Laptop.class.getSimpleName() +
                " batteryCapacity='" + batteryCapacity + '\'' +
                ", os='" + os + '\'' +
                ", memoryRom='" + memoryRom + '\'' +
                ", systemMemory='" + systemMemory + '\'' +
                ", cpu='" + cpu + '\'' +
                ", displayInchs='" + displayInchs + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Laptop laptop = (Laptop) o;
        return Double.compare(laptop.batteryCapacity, batteryCapacity) == 0
                && Double.compare(laptop.memoryRom, memoryRom) == 0
                && Double.compare(laptop.systemMemory, systemMemory) == 0
                && Double.compare(laptop.cpu, cpu) == 0
                && Double.compare(laptop.displayInchs, displayInchs) == 0
                && Objects.equals(os, laptop.os);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batteryCapacity, os, memoryRom, systemMemory, cpu, displayInchs);
    }
}
