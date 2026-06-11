import java.util.Scanner;
public class calculator {
    public static void main( String[] args){
        Scanner scanner = new Scanner(System.in);

        double num1;
        double num2;
        char operator;
        double result = 0;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        num2 = scanner.nextDouble();

        System.out.print("Enter an operator(-,+,/,*): ");
        operator = scanner.next().charAt(0);

        if(operator == '+'){
            result = num1 + num2;
        }
        else if(operator == '-'){
            result = num1 - num2;
        }
        else if(operator == '/'){
            result = num1 / num2;
        }
        else if(operator =='*'){
            result = num1 * num2;
        }
        else{
            System.out.print("you entered an invalid operator" + ".");
        }

        System.out.printf("%.1f", result);







        scanner.close();
    }
}
