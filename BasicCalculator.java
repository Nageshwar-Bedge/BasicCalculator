import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Basic Calculator");
        System.out.println("----------------");
        
        while (true) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            
            System.out.print("Enter operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);
            
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();
            
            double result = 0.0;
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 != 0) {
                        result = num1 / num2;
                    } else {
                        System.out.println("Error: Division by zero.");
                        continue; // Go back to the start of the loop
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    continue; // Go back to the start of the loop
            }
            
            System.out.println("Result: " + result);
            
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String anotherCalculation = scanner.next();
            
            if (!anotherCalculation.equalsIgnoreCase("yes")) {
                System.out.println("Exiting the calculator.");
                break;
            }
        }
        
        scanner.close();
    }
}
