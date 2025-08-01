package entity;

public class Student {
    private String name;
    private int born;
    private String stress;
    private double test1;
    private double test2;
    private double test3;
    private int rest;
    public Student (String name, int born, String stress, double test1, double test2, double test3, int rest) {
        this.name = name;
        this.born = born;
        this.stress = stress;
        this.test1 = test1;
        this.test2 = test2;
        this.test3 = test3;
        this.rest = rest;
    }
    public String getName() {
        return this.name;

    }
    public int getBorn() {
        return 2025-born;
    }
    public String getStress() {
        return this.stress;
    }
    public double getTest1() {
        return this.test1;
    }
    public double getTest2() {
        return this.test2;
    }
    public double getTest3() {
        return this.test3;
    }
    public double getGPA() {
        return test1*0.2 + test2*0.3 + test3*0.5;
    }
    public int getRest() {
        return this.rest;
    }

}
