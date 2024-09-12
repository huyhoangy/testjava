import java.util.Scanner;

public class bai13 {
    public static void main(String[] args) {
         int a = 0;
         int s =0 ;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Nhập số nguyên  a: ");
        a= sc.nextInt();
        if( a %2 !=0)
        {
            System.out.println( " mời nhập lại");
        }
        else {
            for( int i=0; i<=a ; i+=2){
                s += i;
            }
            System.out.println( " tong la " +s);
        }
    }
}
