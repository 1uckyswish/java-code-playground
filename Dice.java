import java.util.Scanner;
public class Dice {
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int roll1 = rollDice();
        int roll2 = rollDice();
        int roll3 = rollDice();

        System.out.print("Enter three numbers between 1 & 6: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        if(areLessThan1(num1, num2, num3) || areGreaterThan6(num1, num2, num3)){
            System.out.println("Numbers not in range");
            System.exit(0);
        }
        int sumOfDice = roll1 + roll2 + roll3;
        int sumOfNumbers = num1 + num2 + num3;
        System.out.println("Your sum is " + sumOfNumbers + " While the computer is "+sumOfDice);
        if(userWon(sumOfNumbers, sumOfDice)){
            System.out.println("Yay you won!");
        }else{
            System.out.println("\nBetter luck next time!");
        }

        scan.close();
    }

    public static boolean areLessThan1(int number1, int number2, int number3){
        return (number1 < 1 && number2 < 1 && number3 < 1);
    }

     public static boolean areGreaterThan6(int number1, int number2, int number3){
        return (number1 > 6 && number2 > 6 && number3 > 6);
    }

    public static boolean userWon(int sum, int diceSum){
        return (sum > diceSum && (sum - diceSum) < 3);
    }

    public static int rollDice(){
        double randomNum = Math.random() * 6;
        randomNum += 1;
        return (int)randomNum;
    }

}
