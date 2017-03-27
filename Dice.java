
package f16s3dec1;

import java.security.SecureRandom;

/**
 *
 * @author krupa
 */
public class Dice {

    /**
     * @param args the command line arguments
     */
        private int numberOfSides;
        private int faceValue;
        
        ///the system will create a default constructor that looks like this
        public Dice()
        {
            
            
            
        }
        
        
        //This constructor will accept the number of sides on the Dice object
        public Dice(int numOfSides)
        {
            //test if the number of sides is invalid
            if (numOfSides < 4 || numOfSides>100)
              throw new IllegalArgumentException(numOfSides + " is outside the "
                                      + "valid range for sides of a dice (4-100)");
            this.numberOfSides = numOfSides;
            this.faceValue = 1;
        }
        
        public void rollTheDice ()
        {
           SecureRandom rng = new SecureRandom ();
           faceValue = rng.nextInt(numberOfSides) + 1;
        }
        
        public int getTheFaceValue()
        {
            return faceValue;
        }
            
        
        
       
    }
    

