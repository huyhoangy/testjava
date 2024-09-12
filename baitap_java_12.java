import java.util.Scanner;

public class baitap_java_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " mời nhập số nguyên n");
        int n = sc.nextInt();
        int  gt=1;
        for(int i=1; i<=n; i++) {
            gt = gt*i ;
        }
        System.out.println( " giai thừa của " +n +" là " + gt);

    }
}
