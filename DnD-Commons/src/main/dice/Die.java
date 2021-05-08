package main.dice;

import java.io.Serializable;
import java.util.Random;

public class Die implements Serializable {

    DiceType type;

    public Die (DiceType type){
        this.type = type;
    }

    public Integer roll(){
        return new Random().nextInt(type.getSides() - 1) + 1;
    }

    public String getDieType(){
        return type.getName();
    }

    public DiceType getType() {
        return type;
    }

    public void setType(DiceType type) {
        this.type = type;
    }
}
