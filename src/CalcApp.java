import java.util.Scanner;

public class CalcApp {
    public static void main(String[] args) {

        Scanner inputNum = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = inputNum.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = inputNum.nextDouble();
        System.out.println("Digite a operação (+, -, *, /): ");
        char operator = inputNum.next().charAt(0);
        inputNum.close();
        double result;

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
                result = num1 / num2;
                break;
            default:
                System.out.println("Operação inválida.");
                return;
        }

        System.out.println(num1+" "+operator+" "+num2+": "+result);
    }
}