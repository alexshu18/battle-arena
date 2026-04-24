import java.util.Scanner;
import java.util.InputMismatchException;

public class Menu {
    public static int menu() {
        int select = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Select your option: ");
        System.out.println("1 - Warrior");
        System.out.println("2 - Archer");
        System.out.println("3 - Quit");


        while (select < 1 || select > 3) {
            System.out.println("Enter the number 1-3");
            try {
                select = input.nextInt();
                input.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Invalid number");
                input.nextLine();
            }
        }
        return select;
    }
}
