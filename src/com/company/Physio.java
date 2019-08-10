package com.company;

public class Physio extends FootballTeam{

    private String university;

    public Physio() {
        super();
    }

    public Physio(String name, String surname, int age, String university) {
        super(name, surname, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void interview() {
        System.out.println("Is not allowed to do interviews. ");
    }

    public void giveMassage(){
        System.out.println("Working");
    }
}
