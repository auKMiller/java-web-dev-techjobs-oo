package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;

    public Job() {
        id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.id = id;
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        String testString =
                        "\n" +
                        "ID: " + this.id + "\n" +
                        "Name: " + this.name + "\n" +
                        "Employer: " + this.employer + "\n" +
                        "Location: " + this.location + "\n" +
                        "Position Type: " + this.positionType + "\n" +
                        "Core Competency: " + this.coreCompetency + "\n" +
                        "\n";


        String nameString = "";
        String employerString = "";
        String locationString = "";
        String positionString = "";
        String coreString = "";

        if(this.name == null || this.name.equals("")){
            nameString = "Data not available";
        } else {
            nameString = this.name;
        }
        if(this.employer == null || this.employer.getValue() == null){
            employerString = "Data not available";
        } else {
            employerString = this.employer.getValue();
        }
        if(this.location == null || this.location.getValue() == null){
            locationString = "Data not available";
        } else {
            locationString = this.location.getValue();
        }
        if(this.positionType == null || this.positionType.getValue() == null){
            positionString = "Data not available";
        } else {
            positionString = this.positionType.getValue();
        }
        if(this.coreCompetency == null || this.coreCompetency.getValue() == null){
            coreString = "Data not available";
        } else {
            coreString = this.coreCompetency.getValue();
        }
        String emptyString = "\n" +
                        "ID: " + this.id + "\n" +
                        "Name: " + nameString + "\n" +
                        "Employer: " + employerString + "\n" +
                        "Location: " + locationString + "\n" +
                        "Position Type: " + positionString + "\n" +
                        "Core Competency: " + coreString + "\n" +
                        "\n";

        if(this.name == null && this.employer.getValue() == null && this.location.getValue() == null && this.positionType.getValue() == null && this.coreCompetency.getValue() == null){
            return "OOPS! This job does not seem to exist.";
        } else {
            return emptyString;
        }
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }
}
