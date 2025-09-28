import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int n = scanner.nextInt();

        int totalTabungan = x + (y * n);

        System.out.println(totalTabungan);
    }
}