package entity;

import entity.Car;
import entity.Student;

public class Main {
    public static final int maxSpeeds = 90;
    public static void main(String[] args) {
        Student a = new Student("Long", 18);
        a.getName();
        a.getAge();
        System.out.println(a.getName() + " " + a.getAge());
        a.setName("khánh");
        a.setAge(19);
        System.out.println(a.getName() + " " + a.getAge());
        Car b = new Car("VinFast", 100);
        b.run();
        if (b.getMaxSpeed() > maxSpeeds) {
            System.out.println("xe chạy quá tốc độ");
        }
        else {
            System.out.println("xe chạy đúng tốc độ");
        }

    }
}