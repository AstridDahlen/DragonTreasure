package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" Welcome to Dungeon Treasue Enter your name to Enter the Dungeon and find the Treasue");
        System.out.println("Be ware there are monters here too:");
        Player.name = input.nextLine();
        System.out.println(" Welcome " + Player.name + " prepare for an adventure" );

        

    }
}
