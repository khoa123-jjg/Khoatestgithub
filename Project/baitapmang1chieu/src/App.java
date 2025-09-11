import java.util.Scanner;

public class App {
    public static void Xuat (int N,int [] M)
    {
        System.out.println("Mang vua nhap:");
        for (int i = 0; i < N; i++) {
            System.out.print(M[i] + " ");
        }
        System.out.println();
    }
    public static int Xoa (int N,int []M,int x)
    {
        for (int i = 0; i < N; i++)
            while (M[i]==x)
            {
                for (int j = i; j < N-1; j++)
                    M[j]=M[j+1];
                    N=N-1;
            }
        return N;
    }
    public static int Min (int[] M,int N,int vt)
    {
        int j=0;
        int min=M[vt];     
        for(int i=vt; i<=N; i++)
            if (M[i]<min)
            {
                min=M[i]; 
                j=i;
            }
        return j;

    }
    public static void hoanvi(int A,int B)
    {
        int TG=A;
        A=B;
        B=TG;
    }
    public static void Xapxep (int N, int [] M )
    {
        for (int vt=0; vt<=N;vt++)
        {
            int vtm=Min(M,N,vt);
            if (vt!=vtm)
            {
                hoanvi(M[vt],M[vtm]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập số phần tử của mảng
        System.out.print("Nhap so phan tu cua mang N = ");
        int N = sc.nextInt();

        // Khai báo mảng
        int[] M = new int[N];

        // Nhập giá trị cho từng phần tử
        for (int i = 0; i < N; i++) {
            System.out.print("M[" + i + "] = ");
            M[i] = sc.nextInt();
        }

        // Xuất mảng ra màn hình
        Xuat(N,M);

        // Xóa phần tử có trong mảng
        System.out.print("Nhap gia tri can xoa x= ");
        int x = sc.nextInt();
        N=Xoa(N,M,x);
        Xuat(N,M);

        // Xắp xếp các phần tử trong trong mảng
        Xapxep(N,M);
        Xuat(N,M);
        }
    }



