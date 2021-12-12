package com.company;

public class Door {

    char  position;
    boolean locked;

    private  Door(char position, boolean locked){

        this.position = position;
        this.locked = locked;

    }


    public char getPosition() {
        return position;
    }

}
