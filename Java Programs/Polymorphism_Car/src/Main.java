class Car{
    private String name;
    private int cylinders;
    private int wheels;
    private boolean engine;

    public Car(String name, int cylinders) {
        this.name = name;
        this.cylinders = cylinders;
        this.wheels = 4;
        this.engine = true;

    }

    public String startEngine(){
        return "Car -> startEngine()";
    }

    public String accelerate(){
        return "Car -> accelerate()";
    }

    public String brake(){
        return "Car -> brake()";
    }
}

class Car1 extends Car{
    public Car1(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Car1 -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Car1 -> accelerate()";
    }

    @Override
    public String brake() {
        return "Car1 -> brake()";
    }
}
class Car2 extends Car{
    public Car2(String name, int cylinders) {
        super(name, cylinders);
    }

    @Override
    public String startEngine() {
        return "Car2 -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Car2 -> accelerate()";
    }

    @Override
    public String brake() {
        return "Car2 -> brake()";
    }
}


public class Main {

    public static void main(String[] args) {
        Car car = new Car("Base Car",8);
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car1 car1 = new Car1("Outlander",5);
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());

        Car2 car2 = new Car2("Ford",3);
        System.out.println(car2.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car2.brake());

    }
}