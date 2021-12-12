package com.company;

public class Monster {

       String monsterName;
       String description;
       int healtpoints;
       int damegeToPlayer;


    private Monster(String monsterName,String description, int healtpoints,int damegeToPlayer){

          this.monsterName = monsterName;
          this.description =description;
          this.healtpoints = healtpoints;
          this.damegeToPlayer = damegeToPlayer;
    }

    public int getDamegeToPlayer() {
        return damegeToPlayer;
    }

    public int getHealtpoints() {
        return healtpoints;
    }

    public String getDescription() {
        return description;
    }

    public String getMonsterName() {
        return monsterName;
    }
}







