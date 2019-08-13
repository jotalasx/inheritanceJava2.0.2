package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<FootballTeam> members = new ArrayList<>();

        Player player1 = new Player("Tom", "Brady", 42, 12, "QB", "Michigan");
        Coach coach1 = new Coach("Bill", "Belichick", 67, 34, 166);
        Physio physio1 = new Physio("Carlos", "Sánchez", 40, "Alabama");

        members.add(player1);
        members.add(coach1);
        members.add(physio1);

        // People travelling right now.
        for (FootballTeam member : members){
            System.out.println(member.getName() + " " + member.getSurname() + " : ");
            member.travel();
        }

        // Who's playing
        System.out.println(player1.getName() + " " + player1.getSurname() + " : ");
        player1.playMatch();

        // Who's coaching
        System.out.println(coach1.getName() + " " + coach1.getSurname() + " : ");
        coach1.manageTeam();

        // Who's taking care of players
        System.out.println(physio1.getName() + " " + physio1.getSurname() + " : ");
        physio1.giveMassage();

        // No se puede instanciar una clase abstracta!
        // FootballTeam team1 = new FootballTeam();

        // Al ser hijas de la clase padres, todas se pueden instanciar como "FootballTeam"
        FootballTeam coach2 = new Coach("Matt", "Patricia", 44, 21, 298);
        FootballTeam player2 = new Player("Julian", "Edelman", 33, 11, "WR", "California");
        FootballTeam physio2 = new Physio("Manuel", "González", 49, "Oklahoma");

        for (FootballTeam member : members){
            System.out.println(member.getName() + " " + member.getSurname() + " : ");
            member.interview();
        }

        // Who's playing
        System.out.println(player2.getName() + " " + player2.getSurname() + " : ");
        ((Player) player2).playMatch();

        // Who's coaching
        System.out.println(coach2.getName() + " " + coach2.getSurname() + " : ");
        ((Coach) coach2).manageTeam();
        coach2.brandCommitment();

        // Who's taking care of players
        System.out.println(physio2.getName() + " " + physio2.getSurname() + " : ");
        ((Physio) physio2).giveMassage();
    }
}
