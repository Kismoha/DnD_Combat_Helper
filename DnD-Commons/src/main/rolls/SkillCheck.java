package main.rolls;

import main.stats.Ability;
import main.stats.Skill;

public class SkillCheck extends ProficientCheck {

    private Skill skill;

    public SkillCheck(Skill skill, Ability mainStat, Integer abilityModifier, boolean proficient, Integer proficiencyBonus) {
        super(mainStat, abilityModifier, proficient, proficiencyBonus);
        this.skill = skill;
    }

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
