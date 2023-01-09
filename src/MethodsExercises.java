import java.util.Scanner;

public class MethodsExercises {
    public static int addition(int a, int b) {
        return a + b;}

    public static double subtract(double a, double b) {
        return a - b;}

    public static long multiple(long a, long b) {
        return a * b;}

    public static int multiply(int a, int b) {
        int sum = 0;

        for(int i = 1; i <= a; i++) {
            sum = sum + b;
        }
        return sum;
    }

    public static double multiply(double a, double b, double product) {
        double sum = product;
        if (b <= 0) {
            return product;
        } else {
            sum += a;
        }
        return multiply(a, b -1, sum);
    }

    public static double divide(double a, double b) {
        return a/b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int getInteger(int min, int max) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number between " + min + " and " + max);
        int userInput = scan.nextInt();
        if(userInput < min || userInput > max) {
            return getInteger(min, max);
        }
        return userInput;

    }

    public static void factorial() {
        Scanner sc = new Scanner(System.in);
        String willContinue;
        do {
            int userInput = getInteger(1, 5);

            long userFactorial = 1;
            System.out.print(userInput + "! = ");
            for (int i = 1; i <= userInput; i++) {
                userFactorial *= i;
                if (i == userInput) {
                    System.out.printf("%d = ", i);
                } else {
                    System.out.printf("%d x ", i);
                }
            }
            System.out.println(userFactorial);
            System.out.println("Do you want to continue? (yes/no)");
            willContinue = sc.next();
        } while(willContinue.equalsIgnoreCase("yes"));
    }

    public static void diceRoll() {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many sides does your dice have?");
        int numberOfSides = sc.nextInt();
        int firstDie = (int)(Math.random() * numberOfSides) + 1;
        int secondDie = (int)(Math.random() * numberOfSides) + 1;

        System.out.printf("%d first roll\n%d second roll.", firstDie, secondDie);
    }



    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//
//        System.out.println(addition(12, 3));
//        System.out.println(subtract(12, 3));
//        multiple();
//        System.out.println(divide(20, 5));
//        System.out.println(modulus(19, 5));
//        System.out.println(multiply(5, 5, 0));
//        System.out.println("first number?");
//        int num1 = scan.nextInt();
//        System.out.println("second number?");
//        int num2 = scan.nextInt();
//        System.out.println(multiply(num1, num2));
//        System.out.println(getInteger(1, 10));
//        factorial();
        diceRoll();


    }

}
