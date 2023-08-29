import java.util.Scanner;

public class Bai17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String inputString = scanner.nextLine();

        System.out.print("Nhap vao mot ky tu: ");
        char inputChar = scanner.nextLine().charAt(0);

        int position = -1;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) {
                position = i;
                break;
            }
        }

        if (position != -1) {
            System.out.println("Vi tri cua ky tu trong chuoi la: " + position);
        } else {
            System.out.println("Khong ton tai trong chuoi");
        }

        scanner.close();
    }
}
