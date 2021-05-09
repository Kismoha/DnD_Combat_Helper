package main.entity;

import main.stats.HitPoints;
import main.stats.Size;

public class BaseEntity {

    Integer armorClass;

    HitPoints hitPoints;

    Size size;

    public BaseEntity(Integer armorClass, HitPoints hitPoints, Size size) {
        this.armorClass = armorClass;
        this.hitPoints = hitPoints;
        this.size = size;
    }

    public Integer getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(Integer armorClass) {
        this.armorClass = armorClass;
    }

    public HitPoints getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(HitPoints hitPoints) {
        this.hitPoints = hitPoints;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
