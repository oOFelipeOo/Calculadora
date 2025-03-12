import java.util.Scanner;

public abstract class CalcApp extends Operators {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Operators operation;
        double equals = 0;

        System.out.println("Digite o primeiro número: ");
        double num1 = input.nextDouble();

        System.out.println("Digite a operação (+, -, *, /): ");
        char operator = input.next().charAt(0);

        System.out.println("Digite o segundo número: ");
        double num2 = input.nextDouble();

        input.close();

        operation = new Operators();

            switch (operator) {
            case '+':
                equals = operation.addition(num1, num2);
                break;
            case '-':
                equals = operation.subtraction(num1, num2);
                break;
            case '*':
                equals = operation.multiplication(num1, num2);
                break;
            case '/':
                equals = operation.division(num1, num2);
                break;
            default:
                System.out.println("Operação inválida!");
        }

        System.out.println(num1+" "+operator+" "+num2+" = " + equals);
    }
}