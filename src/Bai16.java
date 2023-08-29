import java.util.Scanner;

public class Bai16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String inputString = scanner.nextLine();

        System.out.print("Nhap vao mot ky tu: ");
        char inputChar = scanner.nextLine().charAt(0);

        boolean isFound = false;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == inputChar) {
                isFound = true;
                break;
            }
        }

        if (isFound) {
            System.out.println("Co");
        } else {
            System.out.println("Khong");
        }

        scanner.close();
    }
}
