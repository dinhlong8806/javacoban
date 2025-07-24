import java.net.SocketOption;
import java.util.Scanner;


public class Main {
    public static final String hinhvuong = "Square";
    public static final String hinhtamgiac = "Triangle";
    public static final String hinhtron = "Circle";
    public static final double pi = 3.14;

    public static double tinh () {
        Scanner sc =  new Scanner(System.in);
        System.out.println("nhập vào dạng type :");
        String type = sc.nextLine();
        double s = 0;
        if(type.equalsIgnoreCase(hinhvuong)) {
            System.out.println("nhập cạnh hình vuông");
            int a = sc.nextInt();
            s = a * a;
            System.out.println("diện tích của viên gạch là :" + s);
        }
        else if(type.equalsIgnoreCase(hinhtron)) {
            System.out.println("nhập bán kin của hình tròn :");
            double b = sc.nextDouble();
            s = pi * b * b;
            System.out.println("diện tích của viên gạch là :" + s);
        }
        else if(type.equalsIgnoreCase(hinhtamgiac)) {
            System.out.println("nhập chiê cao của tam giác :");
            double h = sc.nextDouble();
            System.out.println("nhập cạnh đáy của tam giác :");
            double c = sc.nextDouble();
            s = (h * c)/2;
            System.out.println("diện tích của viên gạch là :" + s);
        }
        else {
            System.out.println("hình dạng không phù hợp");
        }
        return s;
    }


    public static void main(String[] args) {
        tinh();


    }
}