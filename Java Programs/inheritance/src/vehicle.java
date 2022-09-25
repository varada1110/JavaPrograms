public class vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("vehicle.steer():"+direction+"deg");
    }

    public void move(int direction,int velocity){
        this.currentVelocity += velocity;
        this.currentDirection += direction;
        System.out.println("Current velocity is " + velocity +" and current direction is " + direction);

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void stop(){
        currentVelocity = 0;
    }
}
