package by.tc.task01.builder;


import by.tc.task01.entity.Speakers;

public class SpeakersBuilder implements Builder {
    private double powerConsumption;
    private double numberOfSpeakers;
    private String frequencyRange;
    private double cordLength;

    public SpeakersBuilder powerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
        return this;
    }

    public SpeakersBuilder numberOfSpeakers(double numberOfSpeakers) {
        this.numberOfSpeakers = numberOfSpeakers;
        return this;
    }

    public SpeakersBuilder frequencyRange(String frequencyRange) {
        this.frequencyRange = frequencyRange;
        return this;
    }

    public SpeakersBuilder cordLength(double cordLength) {
        this.cordLength = cordLength;
        return this;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public double getNumberOfSpeakers() {
        return numberOfSpeakers;
    }

    public String getFrequencyRange() {
        return frequencyRange;
    }

    public double getCordLength() {
        return cordLength;
    }

    public Speakers build(String[] parameters) {
        this.powerConsumption(Double.parseDouble(parameters[0]));
        this.numberOfSpeakers(Double.parseDouble(parameters[1]));
        this.frequencyRange(parameters[2]);
        this.cordLength(Double.parseDouble(parameters[3]));
        return new Speakers(this);
    }

    public Speakers build() {
        return new Speakers(this);
    }
}
