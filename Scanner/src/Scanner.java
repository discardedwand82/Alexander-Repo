import java.util.Scanner;

class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Username: ");
        String user = scanner.next();

        System.out.print("Enter a Password: ");
        String password = scanner.next();

        System.out.println("Your username is " + user +" and your password is " +password);

    }
}