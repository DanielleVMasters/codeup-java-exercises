import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Talk to Bob");
        String userInput = sc.next();

        if (userInput.endsWith("?")){
            System.out.println("Bob: Sure.");
        } else if (userInput.endsWith("!")){
            System.out.println("Bob: Whoa, chill out!");
        } else {
            System.out.println("Bob: Whatever");
        }
    }
}
