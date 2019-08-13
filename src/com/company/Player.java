package com.company;

public class Player extends FootballTeam{

    private int number;
    private String position;
    private String college;

    public Player() {
        super();
    }

    public Player(String name, String surname, int age, int number, String position, String college) {
        super(name, surname, age);
        this.number = number;
        this.position = position;
        this.college = college;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public void interview() {
        System.out.println("Gave an interview.");
    }

    public void playMatch(){
        System.out.println("Playing.");
    }

    @Override
    public void brandCommitment() {

    }

    @Override
    public void charityEvents() {

    }
}
