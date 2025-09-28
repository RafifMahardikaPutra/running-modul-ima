import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int t = scanner.nextInt();

        int jatahPermen= n / (t + 1);
        int sisaPermen = n % (t + 1);
        
        System.out.println(jatahPermen);
        System.out.println(sisaPermen);
    }
}