import java.util.*;

public class BasicArithmeticCalculator {
    public static void main(String[] args) {
        double number1, number2;
        Scanner input = new Scanner(System.in);
        number1 = input.nextDouble();       // first number taken as input
        number2 = input.nextDouble();       // second number taken as input
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        input.close();
    }
}
