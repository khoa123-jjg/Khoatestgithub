import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so nguyen x: ");
        int x=sc.nextInt();
        System.out.println("nhap so nguyen y: ");
        int y=sc.nextInt(); 
       
         //Tính tổng
        int tong=x+y;
        System.out.println("tong= "+tong);

        //Tính hiệu
        int hieu=x-y;
        System.out.println("hieu= "+hieu);

         //Tính tích
        int tích=x*y;
        System.out.println("tích= "+tích);

         //Tính thuong
        float thuong=x/y;
        System.out.println("tong= "+thuong);

         //Tính dư
        int du=x%y;
        System.out.println("du= "+du);

    }
}
