import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        User user = new User("solace", "1234");

        System.out.println("Mock Login System");

        System.out.print("Type in your username: ");
        String enteredName = scanner.nextLine();

        System.out.print("Type in your password: ");
        String enteredPassword = scanner.nextLine();

        if (user.checkName(enteredName) && user.checkPassword(enteredPassword)) {
            System.out.println("Login successful! Welcome, " + user.getName());
        } else {
            System.out.println("Login failed! Wrong username or password.");
        }

        scanner.close();
    }
}

class User {
    private String name;
    private String password;

    User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String passw) {
        this.password = passw; 
    }

    // Return true if names match
    public boolean checkName(String userName) {
        return this.name.equals(userName);
    }

    // Return true if passwords match
    public boolean checkPassword(String userPassword) {
        return this.password.equals(userPassword);
    }
}
