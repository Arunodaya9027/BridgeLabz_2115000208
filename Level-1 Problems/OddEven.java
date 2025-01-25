import java.util.*;

public class OddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        if (number <= 0) {
            System.err.println("Error! Please enter a natural number");
            System.exit(0);
        }

        int[] oddNumbers = new int[number / 2 + 1];
        int[] evenNumbers = new int[number / 2 + 1];
        int oddIndex = 0;
        int evenIndex = 0;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) 
                evenNumbers[evenIndex++] = i;
            else 
                oddNumbers[oddIndex++] = i;
        }
        
        System.out.println("Odd Numbers:");
        for (int i = 0; i < oddIndex; i++)
            System.out.print(oddNumbers[i] + " ");

        System.out.println("\nEven Numbers:");
        for (int i = 0; i < evenIndex; i++)
            System.out.print(evenNumbers[i] + " ");
        input.close();
    }
}
