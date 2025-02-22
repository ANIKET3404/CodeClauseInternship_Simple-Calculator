import java.util.Scanner;

public class SimpleCalculator {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean cal = true;

        while (cal) {
            try {
                System.out.println("Enter the First Number: ");
                double num1 = sc.nextDouble();

                System.out.println("Enter the Second Number: ");
                double num2 = sc.nextDouble();

                System.out.println("Choose Operation (+, -, *, /) :");
                char operation = sc.next().charAt(0);

                double result = performOperation(num1, num2, operation);
                System.out.println("Result: " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.next(); 
            }

            System.out.println("Do you want to perform another calculation? (yes/no): ");
            String rep = sc.next();
            cal = rep.equalsIgnoreCase("yes");
        }
        sc.close();
        System.out.println("Thank you for using the Simple Calculator");
    }

    public static double performOperation(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return subtract(num1, num2);
            case '*':
                return multiply(num1, num2);
            case '/':
                return divide(num1, num2);
            default:
                throw new IllegalArgumentException("Invalid Operation. Please try again...");
        }
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }
}