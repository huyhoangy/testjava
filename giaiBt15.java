import java.util.Scanner;

public class giaiBt15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println( " mời nhâp n");
        int n = sc.nextInt();
        for( int i =10 ; i <=n ; i++){
            if( i % 3 == 0 ){
                System.out.println(i);
            }
        }
    }
}
