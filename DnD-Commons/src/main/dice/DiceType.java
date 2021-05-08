package main.dice;

public enum DiceType {
    D4(4,"D4"),
    D6(6, "D6"),
    D8(8, "D8"),
    D12(12, "D12"),
    D20(20, "D20"),
    D100(100, "D100");

    private Integer sides;

    private String name;

    DiceType (int sides, String name){
        this.sides = sides;
        this.name = name;
    }

    public Integer getSides() {
        return sides;
    }

    public void setSides(Integer sides) {
        this.sides = sides;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
