package com.company;

public class Coach extends FootballTeam{

    private int yearExperience;
    private int coachId;

    public Coach() {
        super();
    }

    public Coach(String name, String surname, int age, int yearExperience, int coachId) {
        super(name, surname, age);
        this.yearExperience = yearExperience;
        this.coachId = coachId;
    }

    public int getYearExperience() {
        return yearExperience;
    }

    public void setYearExperience(int yearExperience) {
        this.yearExperience = yearExperience;
    }

    public int getCoachId() {
        return coachId;
    }

    public void setCoachId(int coachId) {
        this.coachId = coachId;
    }

    @Override
    public void interview() {
        System.out.println("Took part into an interview.");
    }

    public void manageTeam(){
        System.out.println("Coaching.");
    }

    @Override
    public void charityEvents() {

    }
}
