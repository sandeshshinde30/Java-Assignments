/*
    Ques : Write a program in java for custom exception to check speed of car on
            highway, if speed exceeds 120Km/hr then throw a ‘Speed Limit Exceeded’
            exception. (use throw)
*/
class SpeedLimitExceededException extends Exception {
    public SpeedLimitExceededException(String message) {
        super(message);
    }
}

class Car {
    private String carName;
    private double speed;

    public Car(String carName) {
        this.carName = carName;
    }

    public void setSpeed(double speed) throws SpeedLimitExceededException {
        if (speed > 120) {
            throw new SpeedLimitExceededException("Speed Limit Exceeded: " + speed + " Km/hr");
        } else {
            this.speed = speed;
            System.out.println(carName + " is running at " + speed + " Km/hr");
        }
    }
}


public class Ques_5 {
    public static void main(String[] args) {
        Car car = new Car("Toyota");
        try {
            car.setSpeed(100); 
            car.setSpeed(130); 
        } catch (SpeedLimitExceededException e) {
            System.out.println("Caught SpeedLimitExceededException: " + e.getMessage());
        }
    }
}
