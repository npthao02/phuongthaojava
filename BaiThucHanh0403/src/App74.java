import java.util.Scanner;
public class App74 {
    public static void main(String[] args) {
        System.out.println("Nhập vào số phần tử trong mảng");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double[] a = new double[n];
        double sum = 0;
        for(int i=0;i<a.length;i++){
            System.out.println("Nhap vào giá trị cho phần tử thứ"+(i+1)+": ");
            a[i] = scanner.nextDouble();
        }
        for(int i=0;i<a.length;i++){
            sum = sum + a[i];
        }
        System.out.println("Tổng các phần tử trong mảng là: %.2f"+sum);
    }
}