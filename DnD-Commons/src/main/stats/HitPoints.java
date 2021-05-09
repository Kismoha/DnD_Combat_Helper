package main.stats;

public class HitPoints {

    private Integer hitPointMaximum;

    private Integer currentHitPoints;

    private Integer temporaryHitPoints;

    public HitPoints(Integer hitPointMaximum, Integer currentHitPoints, Integer temporaryHitPoints) {
        this.hitPointMaximum = hitPointMaximum;
        this.currentHitPoints = currentHitPoints;
        this.temporaryHitPoints = temporaryHitPoints;
    }

    //TODO damage, heal, gain temporary HP methods needs to go outside of this class, into BaseEntity
    public void damage(Integer amount) throws IllegalArgumentException{
        if(amount < 0){
            throw new IllegalArgumentException("Taking negative damage");
        }

        if(amount > 2 * hitPointMaximum){
            //TODO Handling instant death. Maybe a custom exception?
        }

        Integer tempHPOverflow = reduceTemporaryHitPoints(amount);

        reduceCurrentHitPoints(tempHPOverflow);
    }

    public void heal(Integer amount) throws IllegalArgumentException{
        if(amount < 0){
            throw new IllegalArgumentException("Taking negative healing");
        }

        currentHitPoints += amount;

        maxHitPointsCheck();
    }

    public void gainTemporaryHitPoints(Integer amount) throws IllegalArgumentException{
        if(amount < 0){
            throw new IllegalArgumentException("Gaining negative temporary hit points");
        }

        temporaryHitPoints += amount;
    }

    /**
     * Reduces the temporary hit points and returns the overflow.
     * @param amount
     *  the amount that the temporary HP is reduced by
     * @return
     * the overflow if the reduction is bigger than the temporary HP else it's 0
     */
    public Integer reduceTemporaryHitPoints(Integer amount){
        if(amount > temporaryHitPoints){
            temporaryHitPoints = 0;
            return  amount - temporaryHitPoints;
        }else{
            temporaryHitPoints -= amount;
        }

        return 0;
    }

    private void reduceCurrentHitPoints(Integer amount){
        if(amount > currentHitPoints){
            currentHitPoints = 0;
            //TODO Handling unconsciousness. Maybe a custom Exception?
        }else{
            currentHitPoints -= amount;
        }
    }

    private void maxHitPointsCheck(){
        if (currentHitPoints > hitPointMaximum){
            currentHitPoints = hitPointMaximum;
        }
    }

    public Integer getHitPointMaximum() {
        return hitPointMaximum;
    }

    public void setHitPointMaximum(Integer hitPointMaximum) {
        this.hitPointMaximum = hitPointMaximum;
    }

    public Integer getCurrentHitPoints() {
        return currentHitPoints;
    }

    public void setCurrentHitPoints(Integer currentHitPoints) {
        this.currentHitPoints = currentHitPoints;
    }

    public Integer getTemporaryHitPoints() {
        return temporaryHitPoints;
    }

    public void setTemporaryHitPoints(Integer temporaryHitPoints) {
        this.temporaryHitPoints = temporaryHitPoints;
    }
}
