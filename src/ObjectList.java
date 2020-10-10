/** Christina Ninh
 * CSS143 Kalmin
 *
 */
public class ObjectList {
    //variables
    private int numElements = 0;

    //creates an array that holds 100 objects
    private FractionCounter[]fractionList = new FractionCounter[100];

    //set the element to param f, the increase by 1
    public void addFraction(FractionCounter f) {
        fractionList[numElements++] = f;
    }

    //returns the value of fractioncounter obj
    public FractionCounter getValue(int i) {
        return fractionList[i];
    }

    //returns the number of fractions stored in objectlist
    public int length() {
        return numElements;
    }

    public String toString() {
        String retVal = "";
        for(int i = 0; i < numElements; i++) {
            retVal += fractionList[i] + "\n";
        }
        return retVal;
    }
}//end class
