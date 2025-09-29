public class subclasses {
    public static void main(String[] args) {
        System.out.println("this is the main method");
        anotherClass obj = new anotherClass();
        obj.Display();

    
    }

    abstract class takeFromHere{
        public String name = "solace";
        public String color = "matte black";
        abstract  void Display();

        // getter methods
        public String getName(){
            return name;
        }

        public String getColor(){
            return color;
        }

        //setter methods
        public void setName(String name){
            this.name = name;
        }

        public void setColor(String color){
            this.color = color;
        }
    }
}


class anotherClass1{
     private String name= "majesty";
     private  String color = "matte black";
}



class anotherClass  extends subclasses{
       void Display(){
        System.out.println("this is the display method from anotherClass");
    }
}