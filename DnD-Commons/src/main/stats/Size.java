package main.stats;

public enum Size {
    TINY("Tiny", 2.5D),
    SMALL("Small", 5D),
    MEDIUM("Medium", 5D),
    LARGE("Large", 10D),
    HUGE("Huge", 15D),
    GARGANTUAN("Gargantuan", 20D),
    UNCATEGORIZED("Unknown", null);

    private String name;

    private Double tableTopSize;

    Size(String name, Double tableTopSize){
        this.name = name;
        this.tableTopSize = tableTopSize;
    }

    public String getName() {
        return name;
    }

    public Double getTableTopSize() {
        return tableTopSize;
    }

    public String getAreaLabel() {
        StringBuilder sb = new StringBuilder();
        sb.append(tableTopSize).append(" by ").append(tableTopSize).append(" ft.");
        return sb.toString();
    }
}
