import java.util.Scanner;

public class Bai14 {
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

        System.out.println("Mang truoc khi sap xep: ");
        printArray(arr);

        reverseArray(arr);

        System.out.println("Mang sau khi sap xep theo thu tu nguoc lai: ");
        printArray(arr);

        scanner.close();
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
