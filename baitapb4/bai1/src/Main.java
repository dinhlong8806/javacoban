import entity.Student;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main (String[] args) {
//        Student s = new Student();
        Student[] ds = new Student[5];
        ds[0] = new Student("long",2006,"hà nội", 8, 9, 8.5, 0);
        ds[1] = new Student("khánh", 2005, "hà nội", 8, 8, 8, 1);
        ds[2] = new Student("minh", 2007, "phú thọ", 9, 9, 8.5, 1);
        ds[3] = new Student("thắng", 2006, "nam định", 7, 9, 9, 2);
        ds[4] = new Student("quỳnh", 2006, "thanh hóa", 9, 9, 9, 3);
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s %-10s %n", "tên", "tuổi", "địa chỉ", "TX1", "TX2", "KTHP", "GPA", "tiết nghỉ");
        for (Student s : ds)
        System.out.printf("%-10s %-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10d%n", s.getName(), s.getBorn(), s.getStress(), s.getTest1(), s.getTest2(), s.getTest3(), s.getGPA(), s.getRest());
    }


}