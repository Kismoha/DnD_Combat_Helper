package main.rolls;

import main.dice.DiceType;
import main.dice.Die;
import main.stats.Ability;

public class AbilityCheck extends Roll {

    protected Ability ability;

    protected Integer abilityModifier;

    public AbilityCheck(Ability ability, Integer abilityModifier) {
        super(1, new Die(DiceType.D20));
        this.ability = ability;
        this.abilityModifier = abilityModifier;
    }

    @Override
    protected Integer singleRoll() {
        return super.singleRoll() + abilityModifier;
    }

    private AbilityCheck(Integer numberOfDice, Die die) {
        super(numberOfDice, die);
    }

}
