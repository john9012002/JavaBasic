import java.util.Scanner;

public class Bai8 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen n: ");
        int n=sc.nextInt();
        System.out.println("Cac so nguyen to tu 0 den " + n + " la: ");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
