import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập tên của bạn :");
        String name = sc.nextLine();
        System.out.println("nhập số tuổi của bạn :");
        int age = sc.nextInt();
        System.out.println("nhập chiều cao của bạn :");
        double tall = sc.nextDouble();
        System.out.println("xin chào " + name + ", bạn " + age + " tuổi và chiều cao " + tall + " mét");
    }
}