import java.util.Scanner;


public class oop {
    public static void main(String[] args) {

        

     System.out.println(bark());   
     System.out.println(Dogage());  

    //  Scanner scanner = new Scanner(System.in);
    //  System.out.println("What's your name");
    //  String userName =  scanner.nextLine();

    //  System.out.println(greetMan(userName));

     nameMethod("Solace");
     nameMethod("Felix");
     nameMethod("Christine");
    }  

    static String bark(){
        return "woof woof";
    }

    static int Dogage(){
        return 17;
    }

    static String greetMan(String nameofUser){
        return "hello " + nameofUser;
    }

    static void nameMethod(String fname){
        System.out.println(fname + " Majesty");
    }
}


// class Dog{
//     String bark(){
//         return "woof woof";
//     } 
//     int Dogage(){
//         return 17;
//     }
// }
