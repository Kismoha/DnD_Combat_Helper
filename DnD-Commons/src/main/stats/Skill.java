package main.stats;

public enum Skill {
    ACROBATICS(Ability.DEX, "Acrobatics"),
    ANIMAL_HANDLING(Ability.WIS, "Animal Handling"),
    ARCANA(Ability.INT, "Arcana"),
    ATHLETICS(Ability.STR, "Athletics"),
    DECEPTION(Ability.CHA, "Deception"),
    HISTORY(Ability.INT, "History"),
    INSIGHT(Ability.WIS, "Insight"),
    INTIMIDATION(Ability.CHA, "Intimidation"),
    INVESTIGATION(Ability.INT, "Investigation"),
    MEDICINE(Ability.WIS, "Medicine"),
    NATURE(Ability.INT, "Nature"),
    PERCEPTION(Ability.WIS, "Perception"),
    PERFORMANCE(Ability.CHA, "Performance"),
    PERSUASION(Ability.CHA, "Persuasion"),
    RELIGION(Ability.INT, "Religion"),
    SLEIGHT_OF_HAND(Ability.DEX, "Sleight of Hand"),
    STEALTH(Ability.DEX, "Stealth"),
    SURVIVAL(Ability.WIS, "Survival");

    private Ability base;

    private String name;

    Skill (Ability base, String name){
        this.base = base;
        this.name = name;
    }

    public Ability getBase() {
        return base;
    }

    public String getName() {
        return name;
    }
}
