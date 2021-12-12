package com.company;

public class Dungeon {

    Room[][] room;
    Room currentRoom;
    Player player;
    String dungenroomdesc;

    private Dungeon(Room[][] room,Room currentRoom,Player player, String dungenroomdesc){

        this.room = room;
        this.currentRoom = currentRoom;
        this.player = player;
        this.dungenroomdesc = dungenroomdesc;

    }

    public Player getPlayer() {
        return player;
    }

    public Room getCurrentRoom() {
        return currentRoom;
    }

    public String getDungenroomdesc() {
        return dungenroomdesc;
    }

    public Room[][] getRoom() {
        return room;
    }
}
