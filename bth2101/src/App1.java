import java.util.Scanner;
     public class App  {

    public static void main(String[] args) throws Exception {
        //Khai bao cac bien
        double a,b,c,delta,x1,x2;
         Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao he so a: ");
        a = sc.nextDouble();
        System.out.println("Nhap vao he so b: ");
        b = sc.nextDouble();
        System.out.println("Nhap vao he so c: ");
        c = sc.nextDouble();

        delta = Math.pow(b,2) - 4*a*c;
        sc.close();
        if(delta<0) {
            // delta<0
            System.out.println("Phuong trinh vo nghiem");
        }else if(delta==0) {
            // delta==0
            x1 = -b/(2*a);
            System.out.println("phuong trinh co nghiem kep x1=x2="+x1);
        }else {
            // delta>0
            x1 = (-b - Math.sqrt(delta))/(2*a);
            x2 = (-b + Math.sqrt(delta))/(2*a);
            System.out.println("phuong trinh co nghiem");
            System.out.println("x1="+ x1 );
            System.out.println("x2="+ x2 );
        }
   } 
 } 