import java.util.Scanner;

public class Bai15 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] codes = new String[5];

        System.out.println("Nhap vao 5 ma so:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Ma so thu " + (i + 1) + ": ");
            codes[i] = scanner.nextLine();
        }

        boolean isValid = true;

        for (int i = 0; i < 5; i++) {
            if (!codes[i].matches("00[2-5][0-9][a-zA-Z]{4}")) {
                isValid = false;
                break;
            }
        }

        if (isValid) {
            System.out.println("Dung roi");
        } else {
            System.out.println("Sai roi");
        }

        scanner.close();
    }
}
