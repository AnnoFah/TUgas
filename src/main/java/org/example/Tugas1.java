import java.util.Scanner;

public class Tugas1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("=== Library system ===");
        System.out.println("1. Login as Student");
        System.out.println("2. Login as Admin");
        System.out.println("3. Exit");
        System.out.print("Choose option: ");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                Mahasiswa();
                break;
            case 2:
                Admin();
                break;
            case 3:
            default:
                System.out.println("Choose Incorect!");
        }
    }

    private static void Admin() {
        System.out.print("Input your Username (admin): ");
        String One = scanner.next();
        System.out.print("Input your password (admin): ");
        String Two = scanner.next();

        if (One.equals("admin") && Two.equals("admin")) {
            System.out.println("Login as admin!");
        } else {
            System.out.println("Login fail! Username or password incorrect.");
        }
    }

    private static void Mahasiswa() {
        System.out.print("Input NIM: ");
        String nim = scanner.next();

        if (nim.length() != 15) {
            System.out.println("Must 15 letter!!");
        }
    }
}