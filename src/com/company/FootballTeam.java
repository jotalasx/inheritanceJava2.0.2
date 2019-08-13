package com.company;

public abstract class FootballTeam implements TeamDuties{
    // En este caso al ser una clase abstracta las podemos implementar ahi (si queremos)
    // o en las clases hijas (obligatoriamente sino las implementamos en la clase padre)

    protected String name;
    protected String surname;
    protected int age;

    public FootballTeam() {

    }

    public FootballTeam(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void travel(){
        System.out.println("Travelling.");
    }

    public abstract void interview();

    public void brandCommitment(){
        System.out.println("Obligation.");
    }

    public void charityEvents(){
        System.out.println("Helping Others.");
    }
}
