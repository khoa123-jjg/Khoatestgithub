import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        //Khai báo kiểu dữ liệu
        String ten;
        int tuoi;
        double chieucao;
        boolean laptrinh; 
        
        Scanner sc = new Scanner(System.in);
        
        // Nhập tên
        System.out.println("nhap ten: ");
        ten=sc.nextLine();
        
        //Nhâp tuổi
        System.out.println("nhap tuoi: ");
        tuoi=sc.nextInt();
        
        //Nhập chiều cao
        System.out.println("nhap chieu cao: ");
        chieucao=sc.nextDouble();
        
        //Có thích lập trình không
        System.out.println("Có thích lap trình không ?(True/false) ");
        laptrinh=sc.nextBoolean();

        //In ra màn hình
         System.out.println("ten || tuoi || chieu cao cua ban la: "+ ten + "||" +tuoi +"||"+chieucao);
         if (laptrinh==true)
            System.out.println("thích lap trình ");
         else
            System.out.println("khong thich lap trinh ");

    }
}
