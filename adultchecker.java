import java.util.Scanner;

public class adultchecker {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1-50");
        Scanner scanner =  new Scanner(System.in);
        int start2 = scanner.nextInt();
        multipleChecker(start2);
    }

    static void multipleChecker(int start2){
        boolean status = true;
        while(status){
            if (start2 % 3 == 0 && start2 % 5 == 0) {
                System.out.println(start2 + " - fizzbuzz");
                status =  false;
            }else if (start2 % 3 == 0){
                System.out.println(start2 + " - fizz");
                status =  false;
            }else if (start2 % 5 == 0){
                System.out.println(start2 + " - buzz");
                status =  false;
            }
        }
    }
}
