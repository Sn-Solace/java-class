
import java.util.Scanner;

public class looopassignments {
    public static void main(String[] args) {
         //assignment

        // print 1 to 50
        // a simple password checker, keeps requesting pass untill correct
        // a simple yes or no application....do you want to continue repeatedly, if y continue, if no stop
        // build a  countdown timer that prints out from 10-0 then boom
        // adult only app, ask user for age, if less than 18....not old enough, keep repeating until age is bigger than 18 then end
        // tell user to pick a number from 1-10 if number is correct, end if not keep asking
        
        int count = 1;
        while (count <= 50) {
            System.out.println(count);
            count++;
        }

        String correctpassword = "solace";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in your password : ");
        String userPassword = scanner.nextLine();
        boolean state = true;
        while (state) {
            if (userPassword.equals("solace")) {
                System.out.println("Correct password, Welcome");
                state = false;
            }else{
                System.out.println("Incorrect password \n Password : ");
                userPassword = scanner.nextLine();
            }
        }


        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Do you want to continue? yes/no ");
        String userAnswer = scanner2.nextLine();
        boolean state2 = true;
        while (state2) {
            if (userAnswer.equals("yes")) {
                System.out.println("Code Ended");
                state2 = false;
            }else{
                System.out.println("Do you want to continue? yes/no ");
                userAnswer = scanner2.nextLine();
            }
        }
        
        scanner.close();

        System.out.println("Bomb Timer");
        boolean state3 =  true; 
        int timer = 10;
        while (state3) {
            if (timer != 0) {
                System.out.println(timer);
                timer -- ;
            }else{
                System.out.println("BOOM!!!!");
                state3 =  false;
            }
        }

        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Adult Checker \n What is your Age : ");
        int userAge = scanner3.nextInt();
        boolean state4 = true;
        while (state4) {
            if (userAge >= 18) {
                System.out.println("You are an Adult");
                state4 = false;
            }else{
                System.out.println("You are not of Age you child \n Age : ");
                userAge = scanner3.nextInt();
            }
        }

        
        Scanner scanner4 = new Scanner(System.in);
        System.out.println("=========== Guessing Game ========= \n Guess a number from 1-10 ");
        int userGuess = scanner4.nextInt();
        int correctGuess = 5;
        boolean state5 = true;
        while (state5) {
            if (userGuess == correctGuess) {
                System.out.println("Correct, Super Guess!!!");
                state5 = false;
            }else{
                System.out.println("Incorrect, try again : ");
                userGuess = scanner4.nextInt();
            }
        }

        //go through the assignment from github
        
    }
}
