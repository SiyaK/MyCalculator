import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("CHOOSE YOUR OPERATION");
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        System.out.println("4.Division");

        int option = scanner.nextInt();

        System.out.println("Enter the first number");
        int x = scanner.nextInt();

        System.out.println("Enter the second number");
        int y = scanner.nextInt();

        if (option == 1) {
            System.out.println("The answer is: " +add(x,y));
        }
        else if (option == 2) {
            System.out.println("The answer is: " +sub(x,y));
        }
        else if (option == 3) {
            System.out.println("The answer is: " +multi(x,y));
        }
        else if (option == 4) {
            System.out.println("The answer is: " +div(x,y));
        }
        else {
            System.out.println("You are out of range ");
        }

    }
    public static int add(int x, int y){
        int n;
        n = x+y;
        return n;
    }

    public static int sub(int x, int y){
        int k;
        k = x-y;
        return k;

    }

    public static int multi(int x, int y){
        int i;
        i = x*y;
        return i;
    }

    public static int div(int x, int y){
        int j;
        j = x/y;
        return j;
    }

}
