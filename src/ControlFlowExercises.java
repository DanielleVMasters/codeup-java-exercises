import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        int x = 0;
        do {
            System.out.println(x);
            x += 2;
        } while (x < 100);

        int a = 100;
        do {
            System.out.println(a);
            a -= 5;
        } while (a > -11);

        long b = 2;
        do {
            System.out.println(b);
            b = b * b;
        } while (b <= 1000000);

        for (int c = 5; c <= 15; c++) {
            System.out.println(c);
        }
        for (long d = 2; d <= 1000000; d = d * d) {
            System.out.println(d);
        }

        for (int e = 1; e <= 100; e++) {
            if (e % 3 == 0 && e % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (e % 3 == 0) {
                System.out.println("Fizz");
            } else if (e % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(e);
            }
        }

        Scanner scanner = new Scanner(System.in);

        boolean confirmation;

        do {

            System.out.println("What number would you like to go up to?");
            int userInt = scanner.nextInt();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed\n------ | ------- | -----");

            for(int f = 1; f <= userInt; f++){
                int square = f * f;
                int cubed = f * f * f;
                System.out.printf("%-7d|%-9d|%-6d\n", f, square, cubed);
            }
            System.out.print("Continue? [Y/N] ");
            String userInput = scanner.next();
            confirmation = userInput.equalsIgnoreCase("Y");
        } while(confirmation);
        System.out.println("Cool. See you next time!");

        do {
            System.out.print("Input a numerical grade from 0 to 100: ");
            int userGrade = scanner.nextInt();

            if(userGrade >= 88){
                System.out.println("A");
            } else if(userGrade >= 80){
                System.out.println("B");
            } else if(userGrade >= 67){
                System.out.println("C");
            } else if(userGrade >= 60){
                System.out.println("D");
            } else {
                System.out.println("F");
            }
            System.out.print("Continue? [Y/N] ");
            String userInput = scanner.next();
            confirmation = userInput.equalsIgnoreCase("Y");

        } while(confirmation);
        System.out.println("K THanks Bye");




    }
}
