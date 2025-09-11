import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so tien gui: ");
        Float x=sc.nextFloat();
        System.out.println("nhap lai suat hang nam: ");
        Float y=sc.nextFloat();
        System.out.println("nhap so thang gui ");
        int z=sc.nextInt();

        //Lãi suất hàng tháng
        Float v = y / 12;
        System.out.println("Lãi suất hàng tháng =" +v);

        //Số tiền lời
        Float m = x * v *z;
        System.out.println("Số tiền lời =" +m);

        //Tổng tiền
        Float k = x + m;
        System.out.println("Tổng số tiền =" +k);


    }
}
