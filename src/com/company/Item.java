package com.company;

public class Item {

    String name;
    String itemdescrip;

    private void Item(String name, String itemdescrip){

        this.name = name;
        this.itemdescrip = itemdescrip;
    }

    public String getItemdescrip() {
        return itemdescrip;
    }

    public String getName() {
        return name;
    }
}
