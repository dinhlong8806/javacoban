import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void chuoi () {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi :");
        String a = sc.nextLine();
        String chuoinguoc = new StringBuilder(a).reverse().toString();
        if (a.equals(chuoinguoc)) {
            System.out.println(a.toUpperCase());
            System.out.println("chuỗi này đối xứng");
        }
        else {
            System.out.println(a.toLowerCase());
            System.out.println("chuỗi không đối xứng");
        }
    }
    public static void main(String[] args) {
        chuoi();


    }
}