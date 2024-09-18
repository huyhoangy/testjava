import java.util.Scanner;

public class BAI17_GIAIBT {
    public static void main(String[] args) {
        // so hoan hao
        //kiem tra so hoan hao
        Scanner sc = new Scanner (System.in);
        System.out.println(" nhap so n:");
        int n=sc.nextInt();
        int s=0;
        for (int i=1;i<n;i++){
            if(n%i==0)
                s+=i;
        }if(s==n)
            System.out.println( +n+"  là số hoàn hao");
        else
            System.out.println( +n+"  khong phai la so hoan hao");
    }
}
