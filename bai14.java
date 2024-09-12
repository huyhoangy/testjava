import java.util.Scanner;

public class bai14 {
    public static void main(String[] args) {
        int n ;
        int tong = 0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println( " mời nập n ");
        n =sc.nextInt();
        if ( n%2 != 0)
        {
            for( int i=1 ; i<=n ; i+=2)
            {
                if( i==3)
                    continue;
                else

                tong +=i ;
            }
            System.out.println( " tong " + tong );
        }
    }
}
