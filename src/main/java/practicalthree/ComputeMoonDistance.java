package labthree;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Date;
import java.util.Scanner;

/** This class has a method that computes the distance to the moon in yards.
 * The first line displays the name of the programmer and the date. Then, the
 * program's main method stores some values in variables and performs a
 * computation for the number of yards to the moon. Ultimately, the class can
 * display the number of yards to the moon.
 *
 * <p>Bugs: This program has several known bugs, you should find and fix them!
 *
 * @author Janyl Jumadinova
 */

public class ComputemoonDistances {

  public static void main(String[] args) {
    // display the name of the programmer and the date
    System.out.println("Michelle Mota " + new Date());

    // declare variables for the fixed distances
    int milestomoon = null;
    int yardspermile = null;

    // declare the variable that will be computed
    int yardstomoon;

    // compute the yards to the moon
    double yardstomoon = (milestomoon / yardspermile);

    // output the declared values stored in variables
    String milestomoon = scanner.nextLine();
    System.out.println("Distance to the moon in miles: " + milestomoon);
    String yardspermile = scanner.nextLine();
    System.out.println("Number of miles in a yard: " + yardspermile);

    // output the computed value for the nuber of yards to the moon!
    String yardstomoon = scanner.nextLine();
    System.out.println("Number of kilometers to the moon is: " + yardstomoon);
  }

}
