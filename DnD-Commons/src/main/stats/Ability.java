package main.stats;

public enum Ability {
    STR("Strength"),
    DEX("Dexterity"),
    CON("Constitution"),
    INT("Intelligence"),
    WIS("Wisdom"),
    CHA("Charisma");

    private String name;

    Ability(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
