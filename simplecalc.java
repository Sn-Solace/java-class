
import java.util.Scanner;



public class simplecalc {
    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);
        float num1, num2;
        System.out.println("Input your first number");
        num1 = newscanner.nextFloat();
        System.out.println("Input your second number");
        num2 = newscanner.nextFloat();
        System.out.println("What operation would you like to perform? \n 1. Add \n 2. Subract \n 3. Multiply \n 4. Divide");
        int operation = newscanner.nextInt();

        if (operation == 1) {
            float sum = num1 + num2;
            System.out.println("the sum is " + sum);
        }else if (operation == 2) {
            float difference =  num1- num2;
            System.out.println("the difference is " + difference);
        }else if (operation == 3) {
            float product = num1 * num2;
             System.out.println("the product is " + product);
        }else if (operation == 4) {
            float quotient =   num1 /  num2;
            System.out.println("the quotient is " + quotient);
        }else{
            System.out.println("Invalid operation");
        }

        newscanner.close();

        //create folder called calculator, new file main .java, diff methods for each operationmb
        
    }

}
