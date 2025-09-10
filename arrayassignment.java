import java.util.Scanner;

public class arrayassignment {
    public static void main(String[] args) {
        Scanner newscanner = new Scanner(System.in);

        String[] names = new String[5];
        int[] ages = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("User " + (i + 1) + "....... What is your name : ");
            names[i] = newscanner.nextLine();

            System.out.println(names[i] + " please input your age : ");
            ages[i] = newscanner.nextInt();
            newscanner.nextLine(); 
        }

        int sum = 0;
        for (int age : ages) {
            sum += age;
        }

        double average = (double) sum / ages.length;

        System.out.println("The average age of the above users is " + average);

        newscanner.close();
    }
}
