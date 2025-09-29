

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

     LoopTimesTable();
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

    static void LoopTimesTable(){
        int a = 5;
         for (int b = 0; b <= 12; b++) {
            System.out.println(a * b);
       }
    }
}


