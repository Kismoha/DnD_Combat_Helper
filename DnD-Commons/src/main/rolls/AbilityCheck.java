package main.rolls;

import main.dice.DiceType;
import main.dice.Die;
import main.stats.MainStat;

public class AbilityCheck extends Roll {

    protected MainStat mainStat;

    protected Integer mainStatBonus;

    public AbilityCheck(MainStat mainStat, Integer mainStatBonus) {
        super(1, new Die(DiceType.D20));
        this.mainStat = mainStat;
        this.mainStatBonus = mainStatBonus;
    }

    @Override
    protected Integer singleRoll() {
        return die.roll() + mainStatBonus;
    }

    private AbilityCheck(Integer numberOfDice, Die die) {
        super(numberOfDice, die);
    }

}
