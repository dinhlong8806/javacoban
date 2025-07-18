import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mang = new int[5];
        for (int i=0; i<5; i++) {
            System.out.println("nhập số nguyên thứ "+ (i + 1) + " là:");
            mang[i] = sc.nextInt();
        }
        System.out.println("nội dung mảng là: ");
        for (int i=0; i<5; i++) {
            System.out.println( mang[i] + " ");
        }
        int a = 0;
        for (int i=0; i<5; i++) {
            a = a + mang[i];
        }
        System.out.println("tổng các phần tử trong mảng là :" + a);
        int b = mang[0];
        for (int i=0; i<5; i++) {
            if (mang[i] > b) {
                b = mang[i];

            }
        }
        System.out.println("phần tử lớn nhất của mảng là :" + b);

    }
}