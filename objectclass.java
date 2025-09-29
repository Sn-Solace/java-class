public class objectclass {
    public static void main(String[] args) {
        System.out.println("this is the main method");
        Car instanCar = new Car("5 meters", 2, 3, "red", "Aventador", "Lambourghini");
        instanCar.IamStarting();
        instanCar.IamStopping();

        Dog dalmation =  new Dog("Rift", "Black & White", 4);
        Cat cat1 = new Cat("Fellis");
        Cat cat2 = new Cat("Saber", "white");
        cat1.name = "mittens";

        

    }    
}

class Car{
    String height; 
    int noOfDoors;
    int noOfWindows;
    String color;
    String name;
    String model;
    // constructor for the class "Car"
    Car(String height, int noOfDoors, int noOfWindows, String color, String name, String model){
        this.height = height;
        this.noOfDoors = noOfDoors;
        this.noOfWindows = noOfWindows;
        this.color =color;
        this.name = name;
        this.model = model;
    }
    void IamStarting(){
        System.out.println("Car is starting.....");
    }

    void IamStopping(){
        System.out.println("Car is stopping.....");
    }
    
}

class Dog{
    String name;
    String color;
    int noOfLimbs;

    Dog(String name, String color, int noOfLimbs){
        this.name = name;
        this.color = color;
        this.noOfLimbs = noOfLimbs;
    }
}

class Cat{
    String name;
    String color;
    int noOfLimbs;

    Cat(String name){
        this.name= name;
    }

    Cat(String name, String color){
        this.name = name;
        this.color = color;
    }

    Cat(String name, String color, int noOfLimbs){
        this.name = name;
        this.color = color;
        this.noOfLimbs = noOfLimbs;
    }
}