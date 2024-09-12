import java.util.Scanner;

public class bai12_whiiie {
    public static void main(String[] args) {
        Scanner sc = new Scanner( System.in);
        System.out.println("Nhập số n:");
        int n = sc.nextInt();
        int i =1 ;
        int gt =1 ;
        while( i<=n){
            gt *= i ;
            i++ ;
        }
        System.out.println( " giai thừa là " + gt);
    }
}
