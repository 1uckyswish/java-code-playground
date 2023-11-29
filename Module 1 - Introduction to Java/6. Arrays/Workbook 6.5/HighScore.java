public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        int[] arrayInt = {randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum(), randomNum()};
        // Instructions for this workbook are on Learn the Part (Workbook 6.5).
         System.out.print("Here are the scores: ");  
       for (int i = 0; i < arrayInt.length; i++) {
          System.out.print(arrayInt[i] + " ");
         if(arrayInt[i] > highScore){
            highScore = arrayInt[i];
         }
       }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");
        
    }    


    public static int randomNum(){
        int number = (int) (Math.random() * 50000);
        return number;
    }

}
