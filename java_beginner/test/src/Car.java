public class Car {
    String type;
    String model;
    String color;
    int speed;

    Car(String type, String model, String color) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    int increaseSpeed(int increment) {
        speed += increment;
        return speed;
    }

    int decreaseSpeed(int decrease) {
        if (speed > 0) {
            speed -= decrease;
        }
        return speed;
    }

    void printSpeed() {
        System.out.println("Speed: " + speed);
    }

    void printInfo() {
        System.out.println("================");
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
        System.out.println("Type: " + this.type);
        System.out.println("Speed: " + this.speed);

    }
}
