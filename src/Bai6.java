import java.util.Scanner;

public class Bai6 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Nhap mot so nguyen duong: ");
        int n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i+=2){
            sum+=i;
        }
        System.out.println("Tong cac so chan tu 0 den " + n + " la:" +sum);
        sc.close();
    }
}
