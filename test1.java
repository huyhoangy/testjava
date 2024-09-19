import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
      // kiem tra am duong
        /*
        Scanner sc = new Scanner (System.in);
        System.out.println(" moi nhap so kiem tra ");
        int n=sc.nextInt();
        if(n>0)
            System.out.println( +n+ " la so duong");
        else {
            if (n < 0)
                System.out.println(+n + " la so am");
            else
                System.out.println(+n);

        }*/
        /*
        // xep loai hoc sinh
        Scanner sc = new Scanner(System.in);
        System.out.println(" moi nhập điểm trung bình");
        double dtb=sc.nextDouble();
        if(dtb>= 8.5)
            System.out.println(" gioi");
        else{
            if(dtb>= 6.5 && dtb < 8.5)
                System.out.println(" kha");
            else{
                if(dtb>=5.0 && dtb <6.5)
                    System.out.println(" trung binh");
                else{
                    if(dtb<= 5)
                        System.out.println(" yeu");
                }
            }
        }*/

        // giai phuong trinh bac 2
        Scanner sc = new Scanner(System.in);
        System.out.println(" moi nhap he so a , b ,c");
        double a = sc.nextDouble();
        double b= sc.nextDouble();
        double c =sc.nextDouble();
        if(a==0) {
            if (b == 0 && c != 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (b == 0 &&c == 0) {
                System.out.println(" phuong trinh vo so  nghiem");

            } else {
                double x = sc.nextDouble();
                x = -c / b;
                System.out.println("phuong trinh co nghiem la " + x);
            }
        }
        else
            {
                double delta = b*b - 4*a*c;
                if(delta<0)
                    System.out.println("phuong trinh vo nghiem");
                else
                    if(delta==0)
                    {
                        double x=sc.nextDouble();
                        x=-b/(2*a);
                        System.out.println("phuong trinh co nghiem kep la " +x);
                    }
                    else
                    {
                        double x1=sc.nextDouble();
                        double x2=sc.nextDouble();
                        x1=(-b+Math.sqrt(delta))/(2*a);
                        x2=(-b-Math.sqrt(delta))/(2*a);
                        System.out.println("phuong trinh co 2 nghiem phan biet la x1 = " +x1 +" va x2 = " +x2);
                    }
            }
        }
    }


