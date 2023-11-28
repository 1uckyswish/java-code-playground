import java.util.Scanner;

public class Doubles {
    public static void main(String[] args) {

   //      See Learn the Part for instructions.
       Scanner scan = new Scanner(System.in);

        int dice1 = roll();
        int dice2 = roll();
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");
        while (dice1 != dice2) {
         dice1 = roll();
            dice2 = roll();
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");
        }

        System.out.println("yay you won");
        scan.close();
    }

    public static int roll(){
       int dice = (int) (Math.random() * 6) + 1;
        return dice;
    }

}





