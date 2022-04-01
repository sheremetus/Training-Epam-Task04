package by.tc.task01.builder;


import by.tc.task01.entity.Laptop;

public class LaptopBuilder implements Builder {
    private double batteryCapacity;
    private String os;
    private double memoryRom;
    private double systemMemory;
    private double cpu;
    private double displayInchs;

    public LaptopBuilder  batteryCapacity(double batteryCapacity){
        this.batteryCapacity = batteryCapacity;
        return this;
    }
    public LaptopBuilder os(String os){
        this.os = os;
        return this;
    }
    public LaptopBuilder  memoryRom(double memoryRom){
        this.memoryRom = memoryRom;
        return this;
    }
    public LaptopBuilder systemMemory(double systemMemory){
        this.systemMemory = systemMemory;
        return this;
    }
    public LaptopBuilder cpu(double cpu){
        this.cpu = cpu;
        return this;
    }
    public LaptopBuilder displayInchs(double displayInchs){
        this.displayInchs = displayInchs;
        return this;
    }

    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public String getOs() {
        return os;
    }

    public double getMemoryRom() {
        return memoryRom;
    }

    public double getSystemMemory() {
        return systemMemory;
    }

    public double getCpu() {
        return cpu;
    }

    public double getDisplayInchs() {
        return displayInchs;
    }

    public Laptop build(String[] parameters){
        this.batteryCapacity(Double.parseDouble(parameters[0]));
        this.os(parameters[1]);
        this.memoryRom(Double.parseDouble(parameters[2]));
        this.systemMemory(Double.parseDouble(parameters[3]));
        this.cpu(Double.parseDouble(parameters[4]));
        this.displayInchs(Double.parseDouble(parameters[5]));

        return new Laptop(this);
    }

    public Laptop build(){
        return new Laptop(this);
    }
}