public class car extends vehicle {

    private int wheels;
    private int doors;
    private int gears;
    private boolean isManual;

    private int currentGear;


    public car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.isManual = isManual;

        this.currentGear = 1;
    }
    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.currentGear() is "+currentGear+" gear" );
    }

    public void changeVelocity(int direction,int velocity){
        move(direction,velocity);
        System.out.println("Velocity is " + velocity + " and direction is " + direction);
    }
}
