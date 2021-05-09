package main.rolls;

import main.stats.Ability;

public abstract class ProficientCheck extends AbilityCheck{

    protected boolean proficient;

    protected Integer proficiencyBonus;

    public ProficientCheck(Ability ability, Integer abilityModifier, boolean proficient, Integer proficiencyBonus) {
        super(ability, abilityModifier);
        this.proficient = proficient;
        this.proficiencyBonus = proficiencyBonus;
    }

    @Override
    protected Integer singleRoll() {
        Integer profBonus = proficient ? proficiencyBonus : 0;
        return super.singleRoll() + profBonus;
    }

    public boolean isProficient() {
        return proficient;
    }

    public void setProficient(boolean proficient) {
        this.proficient = proficient;
    }

    public Integer getProficiencyBonus() {
        return proficiencyBonus;
    }

    public void setProficiencyBonus(Integer proficiencyBonus) {
        this.proficiencyBonus = proficiencyBonus;
    }
}
