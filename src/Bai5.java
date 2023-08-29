import java.util.Scanner;

public class Bai5 {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String regex = "B170[1-9]{4}";
        for (int i = 1; i <= 5; i++) {
            System.out.print("Nhap ma so sinh vien thu " + i + ": ");
            String studentId = scanner.nextLine();
            if (studentId.matches(regex)) {
                System.out.println("Ma so sinh vien hop le");
            } else {
                System.out.println("Ma so sinh vien khong hop le");
            }
        }
        scanner.close();
    }
}
