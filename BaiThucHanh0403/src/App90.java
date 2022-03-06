import java.util.Scanner;
public class App90 {
    public static void main(String[] args){
        String chuoi;
        char KyTu;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
        System.out.println("Các ký tự có trong chuỗi là: ");
        for(int i=0;i<chuoi.length();i++){
            // trả về ký tự tại vị trí thứ i trong chuỗi
            // và gán vào cho biến KyTu
            // i chạy từ 0 đến vị trị độ dài chuỗi - 1
            KyTu = chuoi.charAt(i);
            System.out.println(KyTu);
        }
    }
    
}