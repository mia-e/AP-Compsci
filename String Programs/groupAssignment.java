import java.util.Scanner;

public class groupAssignment {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("first name: ");
        String firstName = scan.nextLine();
        System.out.print("last name: ");
        String lastName = scan.nextLine();

        int group;
        char letter = lastName.toLowerCase().charAt(0);
        if (letter >= 'a' && letter <= 'i') {
            group = 1;
        } else if (letter >= 'j' && letter <= 's') {
            group = 2;
        } else {
            group = 3;
        }

        System.out.println(firstName + " " + lastName + " assigned to group " + group);
    }
}