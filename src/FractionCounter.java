/** Christina Ninh
 * CSS143 Kalmin
 *
 */
public class FractionCounter {
    //variables
    private Fraction theFraction;
    private int counter = 1;

    //constructor
    FractionCounter(Fraction fraction) {
        this.theFraction = fraction;
    }

    @Override
    //used to see if the newFraction passed into this function is the same as the Fraction
    //we're storing, and if so increments the counter by one and returns true (otherwise, returns false).
    public boolean compareAndIncrement(Fraction newFraction) {
        if(theFraction.equals(newFraction)) {
            counter++;
            return true;
        } else {
            return false;
        }
    }

    //replace this inherited method with one that prints out both the Fraction and its count
    public String toString() {
        String retVal = theFraction.toString() + " has a count of" + counter;
        return retVal;
    }
}//end class
