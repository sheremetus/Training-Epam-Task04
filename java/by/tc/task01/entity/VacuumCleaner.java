package by.tc.task01.entity;


import by.tc.task01.builder.VacuumCleanerBuilder;

import java.util.Objects;

public class VacuumCleaner implements Appliance{
	private double powerConsumption;
    private String filterType;
    private String bagType;
    private String wandType;
    private double motorSpeedRegulation;
    private double cleaningWidth;

    public VacuumCleaner(VacuumCleanerBuilder vacuumCleanerBuilder) {
        this.powerConsumption = vacuumCleanerBuilder.getPowerConsumption();
        this.filterType = vacuumCleanerBuilder.getFilterType();
        this.bagType = vacuumCleanerBuilder.getBagType();
        this.wandType = vacuumCleanerBuilder.getWandType();
        this.motorSpeedRegulation = vacuumCleanerBuilder.getMotorSpeedRegulation();
        this.cleaningWidth = vacuumCleanerBuilder.getCleaningWidth();
    }
    public VacuumCleaner(double powerConsumption, String filterType, String bagType, String wandType, double motorSpeedRegulation, double cleaningWidth) {
        this.powerConsumption = powerConsumption;
        this.filterType = filterType;
        this.bagType = bagType;
        this.wandType = wandType;
        this.motorSpeedRegulation = motorSpeedRegulation;
        this.cleaningWidth = cleaningWidth;
    }
    public VacuumCleaner(String[] parameters) {
        this.powerConsumption = Double.parseDouble(parameters[0]);
        this.filterType = parameters[1];
        this.bagType = parameters[2];
        this.wandType = parameters[3];
        this.motorSpeedRegulation =Double.parseDouble(parameters[4]);
        this.cleaningWidth = Double.parseDouble(parameters[5]);
    }


    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getFilterType() {
        return filterType;
    }

    public void setFilterType(String filterType) {
        this.filterType = filterType;
    }

    public String getBagType() {
        return bagType;
    }

    public void setBagType(String bagType) {
        this.bagType = bagType;
    }

    public String getWandType() {
        return wandType;
    }

    public void setWandType(String wandType) {
        this.wandType = wandType;
    }

    public double getMotorSpeedRegulation() {
        return motorSpeedRegulation;
    }

    public void setMotorSpeedRegulation(double motorSpeedRegulation) {
        this.motorSpeedRegulation = motorSpeedRegulation;
    }

    public double getCleaningWidth() {
        return cleaningWidth;
    }

    public void setCleaningWidth(double cleaningWidth) {
        this.cleaningWidth = cleaningWidth;
    }

    @Override
    public String toString() {
        return VacuumCleaner.class.getSimpleName() +
                "powerConsumption='" + powerConsumption + '\'' +
                ", filterType='" + filterType + '\'' +
                ", bagType='" + bagType + '\'' +
                ", wandType='" + wandType + '\'' +
                ", motorSpeedRegulation='" + motorSpeedRegulation + '\'' +
                ", cleaningWidth='" + cleaningWidth + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VacuumCleaner that = (VacuumCleaner) o;
        return Double.compare(that.powerConsumption, powerConsumption) == 0
                && Double.compare(that.motorSpeedRegulation, motorSpeedRegulation) == 0
                && Double.compare(that.cleaningWidth, cleaningWidth) == 0
                && Objects.equals(filterType, that.filterType)
                && Objects.equals(bagType, that.bagType)
                && Objects.equals(wandType, that.wandType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, filterType, bagType, wandType, motorSpeedRegulation, cleaningWidth);
    }
}
