import java.util.Scanner;

public class Bai2 {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        String[] numberWords = {"Khong", "Mot", "Hai", "Ba", "Bon", "Nam", "Sau", "Bay", "Tam", "Chin"};
        System.out.print("Nhap vao mot so nguyen: ");
        int number = scanner.nextInt();
        String numberInWords = "";
        int digit;
        while (number > 0) {
            digit = number % 10;
            numberInWords = numberWords[digit] + " " + numberInWords;
            number /= 10;
        }
        System.out.println("So do viet bang chu la: " + numberInWords);
        scanner.close();
    }
}
