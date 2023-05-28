public class Car {
    private String brand;
    private String model;
    private int year;
    
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    
    public void start() {
        System.out.println("The car is starting.");
    }
    
    public void stop() {
        System.out.println("The car is stopping.");
    }
    
    public void accelerate() {
        System.out.println("The car is accelerating.");
    }
    
    public void brake() {
        System.out.println("The car is braking.");
    }
    
    public String getBrand() {
        return brand;
    }
    
    public String getModel() {
        return model;
    }
    
    public int getYear() {
        return year;
    }
    
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2021);
        
        System.out.println("Brand: " + myCar.getBrand());
        System.out.println("Model: " + myCar.getModel());
        System.out.println("Year: " + myCar.getYear());
        
        myCar.start();
        myCar.accelerate();
        myCar.brake();
        myCar.stop();
    }
}
