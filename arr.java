
import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        // String firstName = "majesty";
        // String Name = "Chibuike";

        // String[] fullName = {"majesty", "chibuike","solace", "kingsley", "Leo"};

        // int age = 17;
        // int coinPerRun = 1230;
        // int totalCoins = 37477;
        // int[] playerInfo = {age, coinPerRun, totalCoins };
        // fullName[1] = "Kingdom";
        // // System.out.println(playerInfo[1]);
        // // System.out.println(fullName[1]);

        // for (int i = 0; i < fullName.length; i++) {
        //     System.out.println(fullName[i]);
        // }

        // int ages[] = {20, 22,18,35,48,26,87,70};
        //  int newValue = 0;
        // for (int j = 0; j < ages.length; j++) {
        //     newValue += ages[j];
        // }
        // System.out.println(newValue);

        //ask a user for name, first and second then for month of birth, status single or married, store in an array
        //ask user for age, number and how many hands they have, store in an int arr
        //create a program that asks users for their name and age, itll ask 5 times....print average age
        //read multidimensional
        //push to github
        //

        Scanner scanner =  new Scanner(System.in);
        

        System.out.println("Input your first name : ");
        String userFirstName = scanner.nextLine();
        System.out.println("Input your second name : ");
        String userSecondName = scanner.nextLine();
        System.out.println("Input your month of birth: ");
        String monthOfBirth = scanner.nextLine();
        System.out.println("Marriage status: ");
        String status = scanner.nextLine();

        scanner.close();
        
        String[] userDetails = {userFirstName, userSecondName, monthOfBirth, status};
        

        

    }
}
