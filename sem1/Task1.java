package sem1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для рассчета треугольного числа: ");
        int num = sc.nextInt();
        int res = triangleSum(num);
        System.out.format("Треугольное число = %d \n", res);
        System.out.println("Введите число для рассчета факториала: ");
        int num2 = sc.nextInt();
        int res2 = factorial(num2);
        System.out.format("Факториал числа %d = %d", num2, res2);
        sc.close();
    } 
    public static int triangleSum (int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }
    public static int factorial(int n) {
        int sum = 1;
        for (int i = 2; i <= n; i++) {
            sum *= i;
        }
        return sum;
    }
}