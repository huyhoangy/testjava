import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner  sc  = new Scanner(System.in);
        System.out.println(" mời nhập số nguyên a");
        int a =sc.nextInt();
        System.out.println( " mời nhập số nguyên b");
        int b =sc.nextInt();
        int tong = a + b;
        int hieu = a-b ;
        int tich = a * b;
        int thuong = a / b;
        int du = a%b ;
        System.out.println(" tong" + tong);
        System.out.println(" hieu" + hieu);
        System.out.println(" tich" + tich);
        System.out.println("thuong" + thuong);
        System.out.println(" du" + du);
    }
}
