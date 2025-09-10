
import java.util.Scanner;



public class loops {
    public static void main(String[] args) {
        //out put numbers 1 to 10
        //starting point
        int start = 1;
        //ending point
        int end = 10;

        // while (start <= end) {
        //     System.out.println(start);
        //     start++;
        // }

        // int start2 = 1;
        // while(start2 <= 50){
        //     if (start2 % 3 == 0 && start2 % 5 == 0) {
        //         System.out.println(start2 + " - fizzbuzz");
        //     }else if (start2 % 3 == 0){
        //         System.out.println(start2 + " - fizz");
        //     }else if (start2 % 5 == 0){
        //         System.out.println(start2 + " - buzz");
        //     }
        //     start2 ++;
        // }

        //if divisible by 3- fizz
        //if divisible by 5- buzz
        //if divisible by 3 and 5- fizzbuzz

        //arithmetic operators
        // + addition
        // - subtraction
        // / division
        // * multiplication

        //logical operators
        // || OR
        // && AND
        // ! NOT

        // relational operators
        // > greater than
        // < less than
        // >= greater than or equal to
        // <= less than or equal to
        // == equal to
        // != not equal to

       //do while
    //    int i = 3; //start variable
    //    do {
    //         System.out.println("this is the value of " + i);
    //         i++; //4+1 = 5
    //    } while (i < 5);

    //    Scanner scanner = new Scanner(System.in);
    //    System.out.print("Input a number that you want its times table : ");
    //    int userNum =  scanner.nextInt();
    //    int startNum = 0;
    //    int maxNumber = 12;
    //    while (startNum <=  maxNumber) {
    //         int endproduct = startNum * userNum;
    //         System.out.println(endproduct);
    //         startNum++;
    //    }

    //    scanner.close();
        
       for (int b = 0; b <= 50; b++) {
           if (b % 5 == 0) {
                 System.out.println(b);
           }
       }
       
    }
}
