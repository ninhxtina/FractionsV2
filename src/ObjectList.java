/** Christina Ninh
 * CSS143 Kalmin
 *
 */
public class ObjectList {
    //variables
    private int numElements = 0;
    private FractionCounter[]fractionList = new FractionCounter[100];

    public void addFraction(FractionCounter f) {
        fractionList[numElements++] = f;
    }

    public FractionCounter getValue(int i) {
        return fractionList[i];
    }

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
