package main.rolls;

import main.stats.Ability;

public class AttackRoll extends ProficientCheck {

    private Integer weaponBonus;

    private Integer skillBonus;

    private Integer otherBonus;

    public AttackRoll(Integer weaponBonus, Integer skillBonus, Integer otherBonus, Ability ability, Integer abilityModifier, boolean proficient, Integer proficiencyBonus) {
        super(ability, abilityModifier, proficient, proficiencyBonus);
        this.weaponBonus = weaponBonus;
        this.skillBonus = skillBonus;
        this. otherBonus = otherBonus;
    }

    @Override
    protected Integer singleRoll() {
        return super.singleRoll() + weaponBonus + skillBonus + otherBonus;
    }

    public Integer getWeaponBonus() {
        return weaponBonus;
    }

    public void setWeaponBonus(Integer weaponBonus) {
        this.weaponBonus = weaponBonus;
    }

    public Integer getSkillBonus() {
        return skillBonus;
    }

    public void setSkillBonus(Integer skillBonus) {
        this.skillBonus = skillBonus;
    }

    public Integer getOtherBonus() {
        return otherBonus;
    }

    public void setOtherBonus(Integer otherBonus) {
        this.otherBonus = otherBonus;
    }
}
