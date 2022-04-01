package by.tc.task01.builder;

import by.tc.task01.entity.VacuumCleaner;

public class VacuumCleanerBuilder implements Builder {
    private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleanerBuilder powerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public VacuumCleanerBuilder filterType(String filterType) {
        this.filterType = filterType;
        return this;
    }

    public VacuumCleanerBuilder bagType(String bagType) {
        this.bagType = bagType;
        return this;
    }

    public VacuumCleanerBuilder wandType(String wandType) {
        this.wandType = wandType;
        return this;
    }

    public VacuumCleanerBuilder motorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
        return this;
    }

    public VacuumCleanerBuilder cleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
        return this;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public VacuumCleaner build(String[] parameters) {
        this.powerConsumption(Double.parseDouble(parameters[0]));
        this.filterType(parameters[1]);
        this.bagType(parameters[2]);
        this.wandType(parameters[3]);
        this.motorSpeedRegulation(Double.parseDouble(parameters[4]));
        this.cleaningWidth(Double.parseDouble(parameters[5]));
        return new VacuumCleaner(this);
    }


    public VacuumCleaner build() {
        return new VacuumCleaner(this);
    }
}
