import java.util.Scanner;

public class cal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int x = scanner.nextInt();

        System.out.println("Enter your second number: ");
        int y = scanner.nextInt();

        System.out.println("Enter the operation (+, -, *, /) :  ");
        String operation = scanner.next();

        int c = 0;

        ObjectCalculator objectCalculator = new ObjectCalculator(x,y);
        switch(operation){
            case "+": c = objectCalculator.add();
            break;
            case "-": c = objectCalculator.sub();
            break;
            case "*": c = objectCalculator.multi();
            break;
            case "/": c = objectCalculator.div();
            break;
            default:
                System.out.println("Invalid operation! ");

        }
        System.out.println(x + operation + y + " = " +c);
    }
}
