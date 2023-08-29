import java.util.Scanner;

public class Bai20 {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap vao mot chuoi: ");
        String inputString = scanner.nextLine();

        boolean isValid = inputString.matches("[A-Z][a-zA-Z0-9]{0,18}[0-9]");

        if (isValid) {
            System.out.println("Duyet!");
        } else {
            System.out.println("Khong duyet");
        }

        scanner.close();
    }
}
