import java.util.Scanner;
import java.util.Random;


public class Main {
    public static void nhap() {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int a = rand.nextInt(101);
        int b = rand.nextInt(101);
        int c = rand.nextInt(201);
        System.out.println(a + " + " + b + " = " + c);
        String dapan;
        if (a + b == c) {
            dapan = "đúng";
        }
        else {
            dapan = "sai";
        }
        System.out.println("kết quả của phép tính trên bạn dựa đoán đúng hay sai ( trả lời đúng hoặc sai không thêm từ ) :");
        String duakien = sc.nextLine();
        if (dapan.equalsIgnoreCase(duakien)) {
            System.out.println("bạn đã trả lời đúng");
            return;
        }
        else {
            System.out.println("bạn đã trả lời sai");
        }

    }

    public static void main(String[] args) {
        nhap();

    }
}