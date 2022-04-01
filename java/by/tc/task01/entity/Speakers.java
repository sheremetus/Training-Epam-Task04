package by.tc.task01.entity;


import by.tc.task01.builder.SpeakersBuilder;

import java.util.Objects;

public class Speakers implements Appliance{
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public Speakers(SpeakersBuilder speakersBuilder) {
        this.powerConsumption = speakersBuilder.getPowerConsumption();
        this.numberOfSpeakers = speakersBuilder.getNumberOfSpeakers();
        this.frequencyRange = speakersBuilder.getFrequencyRange();
        this.cordLength = speakersBuilder.getCordLength();
    }

    public Speakers(double powerConsumption, double numberOfSpeakers, String frequencyRange, double cordLength) {
        this.powerConsumption = powerConsumption;
        this.numberOfSpeakers = numberOfSpeakers;
        this.frequencyRange = frequencyRange;
        this.cordLength = cordLength;
    }

    public Speakers(String[] parameters) {
        this.powerConsumption = Double.parseDouble(parameters[0]);
        this.numberOfSpeakers = Double.parseDouble(parameters[1]);
        this.frequencyRange = parameters[2];
        this.cordLength = Double.parseDouble(parameters[3]);
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public void setNumberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public void setFrequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public void setCordLength(double cordLength) {
        this.cordLength = cordLength;
    }

    @Override
    public String toString() {
        return Speakers.class.getSimpleName() +
                "powerConsumption='" + powerConsumption + '\'' +
                ", numberOfSpeakers='" + numberOfSpeakers + '\'' +
                ", frequencyRange='" + frequencyRange + '\'' +
                ", cordLength='" + cordLength + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Speakers speakers = (Speakers) o;
        return Double.compare(speakers.powerConsumption, powerConsumption) == 0
                && Double.compare(speakers.numberOfSpeakers, numberOfSpeakers) == 0
                && Double.compare(speakers.cordLength, cordLength) == 0
                && Objects.equals(frequencyRange, speakers.frequencyRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(powerConsumption, numberOfSpeakers, frequencyRange, cordLength);
    }
}
