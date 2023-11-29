import java.util.Arrays;
public class Trap {
    
    public static void main(String[] args) {
        int[] numbers = {1,2,3};
        int[] numb2 = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(numb2));

        numb2[1] = 32;

        System.out.println(numb2);
    }

}
