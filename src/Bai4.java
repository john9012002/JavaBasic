import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao canh thu nhat: ");
        double a = scanner.nextDouble();
        System.out.print("Nhap vao canh thu hai: ");
        double b = scanner.nextDouble();
        System.out.print("Nhap vao canh thu ba: ");
        double c = scanner.nextDouble();
        if (isRightTriangle(a, b, c)) {
            System.out.println("Ba so nay la 3 canh cua mot tam giac vuong ");
        } else {
            System.out.println("Ba so nay khong phai la 3 canh cua mot tam giac vuong");
        }
        scanner.close();
    }
    public static boolean isRightTriangle(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a) {
            return true;
        } else {
            return false;
        }
    }
}
