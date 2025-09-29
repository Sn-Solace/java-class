import java.util.Scanner;

public class calculatorImproved {
    public static void main(String[] args) {
        
        Scanner newscanner = new Scanner(System.in);
        float num1, num2;
        System.out.println("Input your first number : ");
        num1 = newscanner.nextFloat();
        System.out.println("Input your second number : ");
        num2 = newscanner.nextFloat();

        // sumFunction(num1, num2);
        // differenceFunction(num1, num2);
        // productFunction(num1, num2);
        // quotientFunction(num1, num2);

        System.out.println("What operation would you like to perform? \n 1. Add \n 2. Subract \n 3. Multiply \n 4. Divide");
        int operation = newscanner.nextInt();

        switch (operation) {
            case 1:
                sumFunction(num1, num2);
                break;
            case 2:
                differenceFunction(num1, num2);
                break;
            case 3:
                productFunction(num1, num2);
                break;
            case 4:
                quotientFunction(num1, num2);
                break;
            default:
                break;
        }
    }
     
    static void sumFunction(float num1, float num2){
            float sum = num1 + num2;
            System.out.println("The sum is " + sum);
    }

    static void differenceFunction(float num1, float num2){
            float difference =  num1- num2;
            System.out.println("The difference is " + difference);
    }

    static void productFunction(float num1, float num2){
            float product = num1 * num2;
             System.out.println("the product is " + product);
    }

    static void quotientFunction(float num1, float num2){
            float quotient =   num1 /  num2;
            System.out.println("the quotient is " + quotient);
    }

}

