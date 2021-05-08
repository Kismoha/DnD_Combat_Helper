package main.rolls;

import main.stats.MainStat;

public class SkillCheck extends AbilityCheck {

    protected boolean proficient;

    protected Integer proficiencyBonus;

    public SkillCheck(MainStat mainStat, Integer mainStatBonus, boolean proficient, Integer proficiencyBonus) {
        super(mainStat, mainStatBonus);
        this.proficient = proficient;
        this.proficiencyBonus = proficiencyBonus;
    }

    @Override
    protected Integer singleRoll() {
        Integer bonus = proficient ? mainStatBonus + proficiencyBonus : mainStatBonus;
        return die.roll() + bonus;
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
