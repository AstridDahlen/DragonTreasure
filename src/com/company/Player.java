package com.company;

public class Player {

    static String name;
    int healtpoiints;
    int damage;
    Item[] items;

    private Player(String name, int healtpoiints, int damage, Item[] items){

        this.name = name;
        this.healtpoiints = healtpoiints;
        this.damage = damage;
        this.items = items;

    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealtpoiints() {
        return healtpoiints;
    }

    public Item[] getItems() {
        return items;
    }
}
