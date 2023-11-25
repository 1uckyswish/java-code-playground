import java.util.Scanner;

public class CountingTool {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a number \n");
        int answer = scan.nextInt();

        for(int i = 1; i <= answer; i++){
            System.out.println(i+ "\n");
        }
        // See Learn the Part for the instructions.

        scan.close();
    }
}
