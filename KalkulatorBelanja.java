import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scanner = new Scanner(System.in);

        String nama = scanner.next();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int total = x * y;

        System.out.println("Hi, " + nama + "." + "  Total belanja adalah " + total + " Rupiah.");
    }
}