package sem1;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = sc.nextInt();
        System.out.print("Введите второе число: ");
        int b = sc.nextInt();
        System.out.print("Введите операцию +-*/ ");
        String op = sc.next();
        sc.close();
        System.out.println(calculate(a, b, op));
    }
    public static int calculate(int x, int y, String op) {
        int result = 0; 
        if (op.equals("+")) result = x + y;
        else if (op.equals("-")) result = x - y;
        else if (op.equals("*")) result = x * y;
        else result = x / y;
        return result;
    }
}
