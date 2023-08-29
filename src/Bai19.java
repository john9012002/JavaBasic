import java.util.Scanner;

public class Bai19 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String inputString = scanner.nextLine();

        boolean hasNumber = false;

        for (int i = 0; i < inputString.length(); i++) {
            if (Character.isDigit(inputString.charAt(i))) {
                hasNumber = true;
                break;
            }
        }

        if (hasNumber) {
            System.out.println("Co");
        } else {
            System.out.println("Khong");
        }

        scanner.close();
    }
}
