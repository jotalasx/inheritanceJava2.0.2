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
    }
}
