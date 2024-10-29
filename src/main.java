import java.util.Scanner;
import java.security.SecureRandom;

public class main {
    private static final String CHARACTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890!@#$%^&*()-_=+";

    private static String generatePassword(int length){
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < length; i++){
            int index = random.nextInt(CHARACTERS.length());
            password.append(CHARACTERS.charAt(index));
        }

        return password.toString();

    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int length;

        while(true) {
            System.out.println("Enter a password length at least 8 characters long:");
            
            // Make sure input is an integer value
            if (input.hasNextInt()) {
                length = input.nextInt();

                    if(length > 7){
                        break; // Exit loop if value is greater than 7
                    }

                    else {
                        System.out.println("Password must be at least 8 characters long.");
                    }
       
            }
            else {
                System.out.println("Invalid input. Enter password length as an integer");
                input.next();
            }

        }

        String password = generatePassword(length);
        System.out.println("Generated password: \n" + password);

    
    }
}
