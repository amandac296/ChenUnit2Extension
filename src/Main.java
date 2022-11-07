import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //user input
        System.out.print("Enter an expression with *, /, +, -, %, or ^: ");
        String user = scan.nextLine();

        double num1 = 0;
        double num2 = 0;
        if (user.indexOf("*") != -1) {
            num1 = Double.parseDouble(user.substring(0, user.indexOf("*")));
            num2 = Double.parseDouble(user.substring(user.indexOf("*") + 1));
            Calculator calc = new Calculator();
            System.out.println(user + " = " + calc.multiply(num1, num2));
        } else if (user.indexOf("/") != -1) {
            num1 = Double.parseDouble(user.substring(0, user.indexOf("/")));
            num2 = Double.parseDouble(user.substring(user.indexOf("/") + 1));
            Calculator calc = new Calculator();
            System.out.println(user + " = " + calc.division(num1, num2));
        } else if (user.indexOf("+") != -1) {
            num1 = Double.parseDouble(user.substring(0, user.indexOf("+")));
            num2 = Double.parseDouble(user.substring(user.indexOf("+") + 1));
            Calculator calc = new Calculator();
            System.out.println(user + " = " + calc.addition(num1, num2));
        } else if (user.indexOf("-") != -1) {
            num1 = Double.parseDouble(user.substring(0, user.indexOf("-")));
            num2 = Double.parseDouble(user.substring(user.indexOf("-") + 1));
            Calculator calc = new Calculator();
            System.out.println(user + " = " + calc.subtraction(num1, num2));
        } else if (user.indexOf("%") != -1) {
            num1 = Double.parseDouble(user.substring(0, user.indexOf("%")));
            num2 = Double.parseDouble(user.substring(user.indexOf("%") + 1));
            Calculator calc = new Calculator();
            System.out.println(user + " = " + calc.mod(num1, num2));
        } else {
            num1 = Double.parseDouble(user.substring(0, user.indexOf("^")));
            num2 = Double.parseDouble(user.substring(user.indexOf("^") + 1));
            Calculator calc = new Calculator();
            System.out.println(user + " = " + calc.power(num1, num2));
        }
    }
}