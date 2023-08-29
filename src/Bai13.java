import java.util.Scanner;

public class Bai13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao so phan tu n: ");
        int n = scanner.nextInt();

        int[] arr = new int[n];

        System.out.println("Nhap vao " + n + " phan tu so nguyen:");

        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        int min = arr[0];

        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Phan tu co gia tri nho nhat la: " + min);

        scanner.close();
    }
}
