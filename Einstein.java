/*
* The Einstein program uses his famous equation to find the energy of an inputted
* then determine how many kiloton bombs its equivalent to
*
*
* @author  Cameron Teed
* @version 1.0
* @since   2021-04-23
* Class Einstein.
*/

import java.util.Scanner; // Imports scanner function

final class Einstein {

  private Einstein() {
        // Prevent instantiation
        // Optional: throw an exception e.g. AssertionError
        // if this ever *is* called
        throw new IllegalStateException("Cannot be instantiated");
    }

  /**
  * Declaring exponent variable.
   */
   public static final double POW1 = 2;
  /**
  * Declaring bomb variable.
  */
  public static final double POW2 = 4;
  /**
  * Declaring exponent variable.
  */
  public static final double POW3 = 10;
  /**
  * Declaring exponent variable.
  */
  public static final double POW4 = 12;
  /**
   * Declaring exponent variable.
   */
  public static final double POW5 = 8;
  /**
  * Declaring light variable.
  */
  public static final double POW6 = 2.998;

  /**
  * The Einstein program uses his famous equation to find the
  * energy of an inputted then determine how many kiloton bombs
  * its equivalent to.
  * @param args
  */

  public static void main(final String[] args) {

    //Speed of light const
    final double lightSpeed = POW6 * Math.pow(POW3, POW5);

    // Create a scanner object
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter the mass of an object in Kg:");

    // Checks if a float value was inputted
    if (myObj.hasNextFloat()) {

      // Read double input
      double mass = myObj.nextFloat();

      //process (calculates energy and amount of kiloton bombs)
      double energy = mass * Math.pow(lightSpeed, POW1);
      double bomb = energy / (POW2 * Math.pow(POW3, POW4));

      // Outputs the mass and energy and how many kiloton
      // bombs its equal to
      System.out.println("If " + (mass) + " kg of mass was converted to"
      + "energy, it would " + "produce " + (energy) + "J of energy. This"
      + "would be the equivalent of a " + (bomb) + " kiloton bomb. ");

    } else {
        // If anything of than a float was inputted, it asks them to input one
        System.out.println("Please input the mass of an object in Kg.");
    }

  }
}
