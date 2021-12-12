package com.company;


public class Room {

    Door[] doors;
    Item item;
    Monster monster;
    String roomdescrip;

    private Room(Door[] doors, Item item, Monster monster, String roomdescrip){

        this.doors = doors;
        this.item = item;
        this.monster = monster;
        this.roomdescrip = roomdescrip;
    }

    public Item getItem() {
        return item;
    }

    public Monster getMonster() {
        return monster;
    }

    public String getRoomdescrip() {
        return roomdescrip;
    }

    public Door[] getDoors() {
        return doors;
    }


}
