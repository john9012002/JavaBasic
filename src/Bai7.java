import java.util.Scanner;

public class Bai7 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap vao mot so nguyen: ");
        int number=sc.nextInt();
        for(int i=1;i<=20;i++){
            int result=number*i;
            System.out.println(number + " x " + i + " = " + result);
        }
        sc.close();
    }
}
