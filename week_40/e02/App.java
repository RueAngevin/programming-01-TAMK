import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a name?");

        String name = scanner.nextLine();

        System.out.println("You entered: " + name);

        String[] letters = name.split("");

        for (String letter: letters){

            System.out.println(letter);
        }
    }
}
