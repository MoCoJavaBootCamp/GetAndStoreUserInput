import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int houseNumber;
        char firstInitial;
        String lastName, streetName, streetType, city;

        System.out.println("Enter your address in the following format:\n" +
                "first initial + last name + house number + street name + street type + city\n" +
                "Example: P Sherman 42 Wallaby Way Sydney");

        firstInitial = input.next().charAt(0);
        lastName = input.next();
        houseNumber = input.nextInt();
        streetName = input.next();
        streetType = input.next();
        city = input.next();

        System.out.printf("%c %s %d %s %s %s", firstInitial, lastName, houseNumber, streetName, streetType, city);
    }
}
