package entity;


public class Car {
    private String brand;
    private int maxSpeed;
    public Car(String brand, int maxSpeed) {
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }
    public void run() {
        System.out.println("Xe " + brand + " đang chạy với tốc  độ tối đa " + maxSpeed + " km/h");
    }
    public int getMaxSpeed() {
        return this.maxSpeed;
    }


}
