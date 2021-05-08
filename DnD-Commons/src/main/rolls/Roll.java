package main.rolls;

import main.dice.Die;

import java.io.Serializable;

public class Roll implements Serializable {

    protected Integer numberOfDice;

    protected Die die;

    public Roll(Integer numberOfDice, Die die){
        this.numberOfDice = numberOfDice;
        this.die = die;
    }

    public Integer roll(){
        Integer sum = 0;

        for(Integer i = 0; i < numberOfDice; i++){
            sum += singleRoll();
        }

        return sum;
    }

    protected Integer singleRoll(){
        return die.roll();
    }

    public Integer getNumberOfDice() {
        return numberOfDice;
    }

    public void setNumberOfDice(Integer numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    public Die getDie() {
        return die;
    }

    public void setDie(Die die) {
        this.die = die;
    }
}
