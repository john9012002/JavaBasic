import java.util.Scanner;

public class Bai18 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String inputString = scanner.nextLine();

        int count = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println("So lan xuat hien cua ky tu 'a' la: " + count);

        scanner.close();
    }
}
