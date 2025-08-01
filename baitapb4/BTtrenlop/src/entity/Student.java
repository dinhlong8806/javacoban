package entity;
public class Student {
    private int age;
    private String name;
    public Student(String name, int age) {
        this.age = age;
        this.name = name;
    }
    public void sayHello() {
        System.out.println("Xin chào, tôi tên là " + name + ", năm nay " + age + " tuổi");
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int  getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

}

