import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bảng cửu chương 5 là :");
        for (int i = 1; i <= 10; i++) {
            int a = 5 * i;
            System.out.println(a + " ");
        }
        System.out.println("bảng cửu chương 5 là :");
        int n = 1;
        while (n <= 10) {
            int b = 5 * n;
            System.out.println(b + " ");
            n++;
        }
        System.out.println("tổng các số chẵn từ 1 đến 100 là :");
        int c =0;
        for (int i=1; i<=100; i++) {
            if(i%2==0) {
                c = c + i;
            }
        }
        System.out.println(c + " ");
        System.out.println("tổng các số chẵn từ 1 đến 100 là :");
        int m = 1;
        int d = 0;
        while (m <= 100) {
            if (m%2==0) {
                d = d + m;
            }
            m++;
        }
        System.out.println(d + " ");
    }
}