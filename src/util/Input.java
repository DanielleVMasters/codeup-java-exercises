package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input() {
        scanner = new Scanner(System.in);
    }

    public String getString() {
        System.out.print("Input sting:");
        return scanner.nextLine();
    }

    public String getString(String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String userrep = getString("input yes or no");
        if(userrep.equalsIgnoreCase("yes") || userrep.equalsIgnoreCase("y")){
        return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        int userInput;
        try {
            System.out.println("Please enter a number between " + min + " and " + max);
            userInput = Integer.valueOf(this.scanner.nextLine());
            if (userInput < min || userInput > max) {
                return getInt(min, max);
            }
            return userInput;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getInt(min, max);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return getInt(min, max);
        }
    }

    public int getInt() {
        System.out.println("Please enter a whole number:");
        try {
            int userInput = Integer.valueOf(this.scanner.nextLine());
            System.out.println("Input is accepted");
            return userInput;
        } catch (NumberFormatException e) {
            System.out.println("Invalid input");
            return getInt();
        }

    }

    public double getDouble(double min, double max) {
        System.out.println("Please enter a number between " + min + " and " + max);
        double userInput = scanner.nextDouble();
        if(userInput < min || userInput > max) {
            return getDouble(min, max);
        }
        return userInput;
    }

    public double getDouble() {
        System.out.println("Please enter a number:");
        double userInput = scanner.nextDouble();
        return userInput;
    }
}
