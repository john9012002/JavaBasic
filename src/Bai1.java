import java.util.Scanner;

public class Bai1{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhap mot so nguyen: ");
        int number=scanner.nextInt();
        if(number>=0){
            System.out.println("Day la so nguyen duong");
        } else {
            System.out.println("Day la so nguyen am");
        }
        scanner.close();
    }
}