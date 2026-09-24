import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Create an instance of the Random class
        Random random = new Random();
        
        System.out.println("--- Rolling a 6-sided die 5 times ---");
        
        for (int i = 1; i <= 5; i++) {
            // random.nextInt(6) generates a number from 0 to 5. 
            // Adding 1 shifts the range to 1 to 6.
            int dieRoll = random.nextInt(6) + 1;
            
            System.out.println("Roll #" + i + ": " + dieRoll);


            System.out.println("DevOps for Cloud Computing Lab Assignment 2 \n");
            System.out.println("Name: Syed Muhammad Ali\nRegNo: SP23-BAI-048")
        }
    }
}
