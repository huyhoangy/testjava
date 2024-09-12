public class bai17_breakcontinune {
    public static void main(String[] args) {
        // tísnh tổng từ 1-5 bỏ qua 3
        int tong = 0;
        for( int i = 0 ; i<= 5 ; i++ ){
            if( i==3 )
                 continue;
            else
                 tong+=i;
        }
        System.out.println( " tong la "+ tong );
        //break
        int n=0 ;
        while(n<100){
            n++;
            System.out.println(" n=" +n);

            if(n==20)
                break;
        }
    }
}
