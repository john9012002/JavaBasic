import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen n: ");
        int n = scanner.nextInt();
        int fib1 = 1, fib2 = 1, fib = 1;
        for (int i = 2; i <= n; i++) {
            fib = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib;
        }
        System.out.println("So Fibonacci thu " + n + " la: " + fib);
        scanner.close();
    }
}
