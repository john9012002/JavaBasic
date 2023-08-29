import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao canh thu nhat: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao canh thu hai: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap vao canh thu ba: ");
        double c = scanner.nextDouble();
        if (isTriangle(a, b, c)) {
            System.out.println("Ba so nay la 3 canh cua mot tam giac");
        } else {
            System.out.println("Ba so nay khong phai la 3 canh của mot tam giac");
        }
        scanner.close();
    }

    public static boolean isTriangle(double a, double b, double c) {
        if (a + b > c && a + c > b && b + c > a) {
            return true;
        } else {
            return false;
        }
    }
}
