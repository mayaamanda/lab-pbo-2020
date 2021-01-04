/**
 * Class ini dibuat untuk menguji math random pada dadu.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Random;

public class RollingDice {
     public static void main(String[] args) {
         Random rand = new Random();
         int tries = 0;
         int sum = 0;
         while (sum != 7) {
             int roll1 = rand.nextInt(6) + 1;
             int roll2 = rand.nextInt(6) + 1;
             sum = roll1 + roll2;
             System.out.println(roll1 + " + " + roll2 + " = " + sum);
             tries++;
         }
         System.out.println("You won after " + tries + " tries!");
     }
}
