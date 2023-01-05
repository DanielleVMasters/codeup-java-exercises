import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        double pi = 3.14159;
//        System.out.format("The Value of pi is approximately %f", pi);
//
//        System.out.print("Enter int: ");
//        int userInt = scanner.nextInt();
//        System.out.println("You entered: --> \"" + userInt + "\" <--");

//        System.out.print("Enter 3 words: ");
//        String userInput1 = scanner.next();
//        String userInput2 = scanner.next();
//        String userInput3 = scanner.next();
//
//        System.out.println("You entered: --> \"" + userInput1 + "\" <--");
//        System.out.println("You entered: --> \"" + userInput2 + "\" <--");
//        System.out.println("You entered: --> \"" + userInput3 + "\" <--");

        System.out.print("Enter sentence: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");

        System.out.println("Room Length:");
        String length = scanner.nextLine();

        System.out.println("room width: ");
        String width = scanner.nextLine();
        int l = Integer.parseInt(length);
        int w = Integer.parseInt(width);

        int area = l*w;
        int per = (2*l) + (2*w);

        System.out.println("The area of the room is: " + area + " The perimeter of the room is: " + per);

    }
}
