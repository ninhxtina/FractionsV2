/** Christina Ninh
 * CSS143 Kalmin
 *
 */

public class Fraction {
    //variables
    private int num = 1;
    private int denom = 1;

    //default "no-arg" constructor
    public Fraction() {
    }

    //constructor which initializes your data
    Fraction(int n,int d){
        setNumerator(n);
        setDenominator(d);
        setReduce(n,d);
    }

    public int gcdReduce(int n, int d) {
        int gcd = (d == 0? n: gcdReduce(d, n % d));
        return gcd;
    }

    public void setReduce(int n, int d) {
        int gcd = gcdReduce(n,d);
        this.num = (n/gcd);
        this.denom = (d/gcd);
    }

    //replace this inherited method with one appropriate to the class
    public String toString() {
        return num + "/" + denom;
    }

    @Override
            public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if(other instanceof Fraction == false) {
            return false;
        }
        Fraction that = (Fraction) other;
        return this.num == that.num && this.denom == that.denom;
    }

    //getter & setter methods
    public int getNumerator() {
        return num;
    }

    public void setNumerator(int num) {
        this.num = num;
    }

    public int getDenominator() {
        return denom;
    }

    public void setDenominator(int denom) {
        if (denom == 0) {
            System.out.println("Invalid fraction");
        } else {
            this.denom = denom;
        }
    }
}//end class
