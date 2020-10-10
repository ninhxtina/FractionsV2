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
        //reads file with scanner
        Scanner in = new Scanner(new FileInputStream("fractions.txt"));

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

            //if first line of txt file
            if (current == 0) {
                //creates fraction object
                FractionCounter newCount = new FractionCounter(createFraction);
                fractions.addFraction(newCount); //brings the new object to objectlist
                current++; //increase value by 1, since process went through
            } else {
                //if not the first line of txt file
                boolean counted = false;
                for (int i = 0; i < fractions.length(); i++) {
                    //checks all the fractions in objectlist
                    FractionCounter currentCount = fractions.getValue(i);

                    if (currentCount.compareAndIncrement(createFraction)) {
                        counted = true; //checks if fraction is added in objectlist
                        break;
                    }
                }
                //if currentcount is not equal to createfraction
                if (counted == false) {
                    FractionCounter newCurrentCount = new FractionCounter(createFraction);
                    //add this fraction to the objectlist
                    fractions.addFraction(newCurrentCount);
                }
            }
        }
        //continues to read the txt file until there are no more lines
        while (in.hasNextLine());

        in.close(); //close file

        System.out.println(fractions.toString()); //print what was found in objectlist
    }//end main
}//end class
