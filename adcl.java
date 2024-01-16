import java.util.Scanner;

public class adcl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so : ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("day la so duong");
        } else if (n < 0) {
            System.out.println("day la so am");
        }
        if (n % 2 == 0) {
            System.out.print("day la so chan");
        } else if ((n % 2) != 0) {
            System.out.print("day la so le");
        }
        sc.close();
    }
}