/** Christina Ninh
 * CSS143 Kalmin
 */
import java.util.Scanner;
import java.io.IOException;
import java.io.FileInputStream;

public class FractionDriver {
    public static void main(String[] args) throws IOException {
        //creates a new instance of objectlist class
        ObjectList fractions = new ObjectList();

        //keeps track of loop iteration
        int current = 0;
        //reads file
        Scanner in = new Scanner(new FileInputStream("fraction.txt"));

        //makes it run at least once
        do {
            //variables
            int num;
            int denom;

            String fractionsTxt = in.nextLine(); //reads first line of text
            String[] splitFrac = fractionsTxt.split("/"); //split the text line with /

            num = Integer.parseInt(splitFrac[0]); //converts 1st num from string to int
            denom = Integer.parseInt(splitFrac[1]); //converts 1st denom from string to int

            //uses fraction class to create a fraction with the num & denom we found
            Fraction createFraction = new Fraction(num, denom);

            if (current = 0) {
                FractionCounter newCount = new FractionCounter(createFraction);
                fractions.addFraction(newCount); //brings the new object to objectlist
                current++;
            } else {
                boolean counted = false;
                for (int i = 0; i < fractions.length(); i++) {
                    FractionCounter currentCount = fractions.getValue(i);

                    if (currentCount.compareAndIncrement(createFraction)) {
                        counted = true;
                        break;
                    }
                }
                if (counted == false) {
                    FractionCounter newCurrentCount = new FractionCounter(createFraction);

                    fractions.addFraction(newCurrentCount);
                }
            }
        }
        while (in.hasNextLine());

        in.close(); //close file

        System.out.println(fractions.toString()); //print what was found in objectlist
    }//end main
}//end class
